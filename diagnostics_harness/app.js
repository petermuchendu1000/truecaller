// ---------------- Backend adapters (mocks of the real deps the decompiled flow calls) ----------------
const BACKENDS = [
  {key:'callDetect', label:'Call detection', sub:'READ_PHONE_STATE / CallScreeningService', required:true, def:'off'},
  {key:'overlayPerm', label:'Overlay permission', sub:'SYSTEM_ALERT_WINDOW · canDrawOverlays()', required:true, def:'off'},
  {key:'windowDraw',  label:'Window draw',       sub:'WindowManager.addView · type 2038', required:true, def:'off'},
  {key:'notifSvc',    label:'Notification',       sub:'full‑screen intent / heads‑up', required:false, def:'off'},
  {key:'touchRoute',  label:'Touch routing',      sub:'click_catcher z‑order · button visibility enable', required:true, def:'off'},
  {key:'telecom',     label:'Telecom / dialer role', sub:'default dialer · acceptRingingCall()', required:true, def:'off'},
  {key:'fgService',   label:'Foreground service', sub:'OEM battery/autostart keep‑alive', required:true, def:'off'},
];
const state = {};
BACKENDS.forEach(b=>state[b.key]=b.def);

let call = 'idle';   // idle | ringing | answered | ongoing | ended
let ringUI = null;   // 'overlay' | 'notif' | 'nothing'
let timerInt = null;

// ---------------- DOM ----------------
const $=s=>document.querySelector(s);
const phone=$('#phone'), verdict=$('#verdict'), logEl=$('#log'), ringstate=$('#ringstate');
const overlay=$('#overlay'), notif=$('#notif'), answer=$('#answer'), ongoing=$('#ongoing'), ghost=$('#ghostring');
const clickCatcher=$('#clickCatcher'), ansAnswerBtn=$('#ansAnswerBtn'), ansStatus=$('#ansStatus');

// theme
const themeSel=$('#theme');
function setTheme(t){document.documentElement.setAttribute('data-theme',t);themeSel.value=t;}
setTheme(window.matchMedia&&window.matchMedia('(prefers-color-scheme: dark)').matches?'dark':'light');
themeSel.addEventListener('change',e=>setTheme(e.target.value));

// ---------------- build backend bus ----------------
const busEl=$('#backends');
function renderBus(){
  busEl.innerHTML='';
  BACKENDS.forEach(b=>{
    const li=document.createElement('li');
    li.className='backend'+(b.required?' required':'');
    li.innerHTML=`<div class="bl"><span class="dot ${state[b.key]}"></span>${b.label}</div>
      <div class="bs">${b.sub}</div>
      <div class="seg3" data-key="${b.key}">
        <button data-v="off" class="${state[b.key]==='off'?'on':''}">Off</button>
        <button data-v="ok" class="${state[b.key]==='ok'?'on':''}">OK</button>
        <button data-v="faulty" class="${state[b.key]==='faulty'?'on':''}">Faulty</button>
      </div>`;
    busEl.appendChild(li);
  });
}
busEl.addEventListener('click',e=>{
  const btn=e.target.closest('.seg3 button'); if(!btn)return;
  const key=btn.closest('.seg3').dataset.key;
  state[key]=btn.dataset.v;
  renderBus();
  if(call==='ringing') evaluateRing(true);   // live re-evaluate while ringing
});
renderBus();

// ---------------- logging ----------------
function log(kind,msg){const li=document.createElement('li');li.className=kind;li.innerHTML=msg;logEl.appendChild(li);}
function clearLog(){logEl.innerHTML='';}
function setVerdict(cls,msg){verdict.className='verdict '+cls;verdict.innerHTML=msg;}

// ---------------- screen helpers ----------------
function hideAll(){[overlay,notif,answer,ongoing,ghost].forEach(n=>n.classList.add('hidden'));}
function show(n){n.classList.remove('hidden');}

// ---------------- the FLOW ----------------
function simulateCall(){
  clearLog(); hideAll();
  call='ringing'; ringstate.textContent='Ringing…';
  log('info','📶 OS reports <b>incoming call</b> — the phone rings (handled by the OS, not the app).');
  evaluateRing(false);
}

function evaluateRing(isLive){
  // 1) does the app even find out about the call?
  if(state.callDetect!=='ok'){
    ringUI='nothing'; renderRing();
    log('bad',`❌ <b>Call detection</b> is <b>${state.callDetect}</b> → CallerIdService never notified. App does nothing.`);
    setVerdict('bad','App shows nothing — <b>Call detection</b> backend is required first.');
    return;
  }
  log('ok','✅ Call detection OK → CallerIdService.onCallState(RINGING) fired.');

  // 2) foreground service alive?
  if(state.fgService==='off'){
    ringUI='nothing'; renderRing();
    log('bad','❌ <b>Foreground service</b> Off → service killed by OEM before UI draws. Nothing shows.');
    setVerdict('bad','App shows nothing — <b>Foreground service</b> is being killed (battery/autostart).');
    return;
  }
  if(state.fgService==='faulty') log('info','⚠ Foreground service Faulty → may be killed mid‑call.');
  else log('ok','✅ Foreground service alive → CallerIdService stays running.');

  // 3) try to draw the OVERLAY (Surface A)
  let overlayShown=false;
  if(state.overlayPerm!=='ok'){
    log('bad',`❌ <b>Overlay permission</b> is <b>${state.overlayPerm}</b> → canDrawOverlays()=false. addView(type 2038) would throw. Overlay suppressed.`);
  } else if(state.windowDraw!=='ok'){
    log('bad',`❌ <b>Window draw</b> is <b>${state.windowDraw}</b> → WindowManager.addView failed. No overlay.`);
  } else {
    overlayShown=true;
    log('ok','✅ Overlay drawn → caller‑ID card on top of the host app.');
  }

  // 4) notification fallback (Surface C)
  let notifShown=false;
  if(state.notifSvc==='ok'){notifShown=true; log('ok','✅ Notification posted → heads‑up with Answer/Decline.');}
  else log('info',`• Notification is <b>${state.notifSvc}</b> → no heads‑up fallback.`);

  // decide what the user sees
  if(overlayShown){ringUI='overlay';}
  else if(notifShown){ringUI='notif';}
  else{ringUI='nothing';}
  renderRing();

  // verdicts for the "nothing shows" symptom
  if(ringUI==='nothing'){
    setVerdict('bad','😖 <b>App shows nothing</b> while ringing — overlay blocked and no notification fallback.');
  } else if(ringUI==='notif' && !overlayShown){
    setVerdict('warn','⚠ Only the <b>notification</b> shows (overlay is blocked). Answer must be tapped on the notification.');
  } else {
    setVerdict('','Ringing — caller‑ID overlay is up. Tap <b>Answer</b> (notification or full‑screen) to test the tap path.');
  }
}

function renderRing(){
  hideAll();
  if(ringUI==='overlay'){show(overlay); if(state.notifSvc==='ok')show(notif);}
  else if(ringUI==='notif'){show(notif);}
  else{show(ghost);}
}

// ---------------- ANSWER path (the "tap to receive" test) ----------------
function tryAnswer(source){
  if(call!=='ringing'){return;}
  log('info',`👆 Answer tapped on <b>${source}</b>.`);

  // touch routing: does the tap even reach the handler?
  if(state.touchRoute!=='ok'){
    if(source==='full‑screen'){clickCatcher.classList.add('tapmapFlash');setTimeout(()=>clickCatcher.classList.remove('tapmapFlash'),500);}
    log('bad',`❌ <b>Touch routing</b> is <b>${state.touchRoute}</b> → tap swallowed by click_catcher / Answer button still <code>visibility=gone</code>. Handler never runs.`);
    setVerdict('bad','😖 <b>Tap does nothing</b> — the tap never reaches the answer handler (<b>Touch routing</b>).');
    return;
  }
  log('ok','✅ Touch routing OK → onAnswerClick() handler invoked.');

  // telecom: can we actually accept the call?
  if(state.telecom!=='ok'){
    log('bad',`❌ <b>Telecom / dialer role</b> is <b>${state.telecom}</b> → not the default dialer, acceptRingingCall() denied. Call not answered.`);
    setVerdict('bad','😖 <b>Tap does nothing</b> — handler ran, but app isn’t the default dialer so the call can’t be accepted (<b>Telecom</b>).');
    return;
  }
  log('ok','✅ Telecom OK → TelecomManager.acceptRingingCall() → call connected.');
  connect();
}

function connect(){
  call='ongoing'; ringstate.textContent='In call';
  hideAll(); show(ongoing);
  let s=1; $('#timer').textContent='00:01';
  timerInt=setInterval(()=>{s++;$('#timer').textContent='00:'+String(s).padStart(2,'0');},1000);
  setVerdict('good','✅ <b>Call connected!</b> All required backends are wired — the flow works end‑to‑end.');
}
function decline(){endCall('Declined');}
function hangup(){endCall('Call ended');}
function endCall(reason){
  call='ended'; ringstate.textContent='Idle';
  if(timerInt){clearInterval(timerInt);timerInt=null;}
  hideAll(); $('#hostapp').classList.remove('hidden');
  log('info','• '+reason+'.');
  setVerdict('',reason+'. Press “Simulate incoming call” to run again.');
}

// full-screen expand from overlay
function expand(){ if(call!=='ringing')return; hideAll(); show(answer); log('info','• Overlay tapped → full‑screen answer screen opened.'); }

// ---------------- wire interactions ----------------
phone.addEventListener('click',e=>{
  const t=e.target.closest('[data-act]'); if(!t)return;
  const act=t.dataset.act;
  if(act==='answer') tryAnswer(answer.classList.contains('hidden')?'notification':'full‑screen');
  else if(act==='decline') decline();
  else if(act==='hangup') hangup();
  else if(act==='expand') expand();
});
// clicking the transparent catcher explicitly (to demonstrate it eats taps)
clickCatcher.addEventListener('click',()=>{
  if(call==='ringing'){log('bad','⚠ Tap landed on <b>click_catcher</b> (transparent layer above the caller area) — swallowed.');}
});

$('#callBtn').addEventListener('click',simulateCall);
$('#resetBtn').addEventListener('click',()=>{call='idle';ringstate.textContent='Idle';if(timerInt)clearInterval(timerInt);hideAll();$('#hostapp').classList.remove('hidden');clearLog();setVerdict('','Reset. Press “Simulate incoming call”.');});

// presets
document.querySelector('.presets').addEventListener('click',e=>{
  const b=e.target.closest('.chipbtn'); if(!b)return;
  if(b.dataset.preset==='bug'){ // reported scenario: detects call but overlay+touch+telecom broken
    Object.assign(state,{callDetect:'ok',fgService:'ok',overlayPerm:'off',windowDraw:'ok',notifSvc:'ok',touchRoute:'faulty',telecom:'off'});
  }else{ // everything connected
    BACKENDS.forEach(x=>state[x.key]='ok');
  }
  renderBus();
  setVerdict('', b.dataset.preset==='bug'
    ? 'Loaded the reported‑bug scenario. Simulate the call, then flip backends OK one at a time to find the culprit.'
    : 'All backends connected. Simulate the call — it should connect end‑to‑end.');
});

setVerdict('','Press “Simulate incoming call” to run the flow.');
