// ---- theme ----
const themeSel=document.getElementById('theme');
function setTheme(t){document.documentElement.setAttribute('data-theme',t);themeSel.value=t;}
setTheme(window.matchMedia&&window.matchMedia('(prefers-color-scheme: dark)').matches?'dark':'light');
themeSel.addEventListener('change',e=>setTheme(e.target.value));

// ---- sample inbox data (covers every row variant Truecaller renders) ----
const CONVOS=[
  {ini:'P',name:'Priya Sharma',cls:'',avail:true,snippet:'See you at 7! 🙂',time:'2:38 PM',unread:2},
  {ini:'H',name:'HDFC Bank',cls:'biz',verified:true,snippet:'Rs.2,499 debited from a/c XX2345',time:'1:12 PM',label:'TRANSACTION'},
  {ini:'A',name:'Amazon',cls:'otp',snippet:'123456 is your OTP. Do not share.',time:'12:04 PM',labelOtp:'OTP',unread:1},
  {ini:'!',name:'+1 (415) 555‑0134',cls:'spam',snippet:'You won a prize! Click http://…',time:'11:20 AM',spam:true,label:'SPAM'},
  {ini:'M',name:'Mom',cls:'',snippet:'You: Reached home safely',time:'Yesterday',extra:'pin'},
  {ini:'R',name:'Rahul Verma',cls:'',snippet:'Draft: about the trip…',time:'Yesterday',draft:true,extra:'mute'},
  {ini:'S',name:'Swiggy',cls:'otp',snippet:'Your order is on the way 🛵',time:'Mon',label:'OFFERS'},
  {ini:'T',name:'Team Standup',cls:'',snippet:'Ankit: pushed the fix ✅',time:'Sun',group:true},
];

// ---- thread sample (bubble variants: in/out, status, starred, forwarded, OTP) ----
const THREAD=[
  {sep:'Today'},
  {side:'in',text:'Hey! Are we still on for dinner tonight?',time:'2:30 PM'},
  {side:'out',text:'Yes! Booked a table at 7.',time:'2:31 PM',status:'Read'},
  {side:'in',text:'Perfect 🙂',time:'2:32 PM',starred:true},
  {side:'out',text:'I forwarded you the address earlier',time:'2:33 PM',status:'Delivered',fwd:true},
  {otp:'123456',from:'Amazon',time:'12:04 PM'},
  {side:'in',text:'See you at 7! 🙂',time:'2:38 PM'},
];

const el=s=>document.querySelector(s);
const phone=el('#phone');

// ---- render inbox ----
function renderInbox(){
  const list=el('#convlist'); list.innerHTML='';
  CONVOS.forEach((c,i)=>{
    const row=document.createElement('div'); row.className='crow'; row.dataset.i=i;
    const avail=c.avail?'<span class="avail"></span>':'';
    const vbadge=c.verified?'<span class="vbadge">✓</span>':'';
    const extra=c.extra==='pin'?'<span class="extra">📌</span>':(c.extra==='mute'?'<span class="extra">🔕</span>':'');
    const snippetCls='csnippet'+(c.unread?' unread':'')+(c.spam?' spam':'');
    let right='';
    if(c.unread) right=`<div class="cbadge">${c.unread}</div>`;
    else if(c.extra==='mute') right=`<div class="cmuted">🔕</div>`;
    else if(c.label) right=`<div class="clabel${c.labelOtp?' otp':''}">${c.label}</div>`;
    const timeCls='ctime'+(c.unread?' unread':'');
    row.innerHTML=`
      <div class="avatar ${c.cls}">${c.ini}${avail}</div>
      <div class="cmid">
        <div class="cname">${c.name}${vbadge}${extra}</div>
        <div class="${snippetCls}">${c.snippet}</div>
      </div>
      <div class="cright"><div class="${timeCls}">${c.time}</div>${right}</div>`;
    row.addEventListener('click',()=>openThread(c));
    list.appendChild(row);
  });
}

// ---- render thread ----
function renderThread(){
  const t=el('#thread'); t.innerHTML='';
  THREAD.forEach(m=>{
    if(m.sep){const d=document.createElement('div');d.className='daysep';d.textContent=m.sep;t.appendChild(d);return;}
    if(m.otp){const o=document.createElement('div');o.className='otpbubble';
      o.innerHTML=`<div style="font-size:12px;color:var(--muted)">${m.from}</div>
        <div class="otpcode">${m.otp}</div><div style="font-size:13px">is your one‑time password. Do not share it.</div>
        <div class="copyotp">Copy OTP</div><div class="bmeta">${m.time}</div>`;t.appendChild(o);return;}
    const w=document.createElement('div');w.className='bwrap '+m.side;
    const cls=(m.starred?'starred ':'')+(m.fwd?'fwd ':'');
    const tick=m.side==='out'?`<span class="tick">${m.status==='Read'?'✓✓':m.status==='Delivered'?'✓✓':'✓'}</span>`:'';
    w.innerHTML=`<div class="bubble ${cls}">${m.text}</div><div class="bmeta">${m.time}${tick}</div>`;
    t.appendChild(w);
  });
  t.scrollTop=t.scrollHeight;
}

// ---- compose ----
function renderCompose(){
  const l=el('#composelist');
  // keep the group row + section, append suggestions
  l.querySelectorAll('.suggestion').forEach(n=>n.remove());
  CONVOS.slice(0,6).forEach(c=>{
    const r=document.createElement('div');r.className='crow suggestion';
    r.innerHTML=`<div class="cavatar ${c.cls}">${c.ini}</div><div class="cmeta"><div class="cname">${c.name}</div><div class="cnum">Mobile · +91 98${Math.floor(100000+Math.random()*899999)}</div></div>`;
    l.appendChild(r);
  });
}

// ---- navigation ----
function switchScreen(name){
  phone.querySelectorAll('.screen').forEach(s=>s.classList.toggle('hidden',s.dataset.screen!==name));
  document.querySelectorAll('.screenbtn').forEach(b=>b.classList.toggle('active',b.dataset.screen===name));
  renderFeatures(name);
}
function openThread(c){
  el('#thName').textContent=c.name;
  el('#thAvatar').textContent=c.ini; el('#thAvatar').className='th-avatar '+(c.cls||'');
  el('#thStatus').textContent=c.group?`${'5 members'}`:(c.avail?'online':'last seen recently');
  switchScreen('thread'); renderThread();
}
document.getElementById('screens').addEventListener('click',e=>{const b=e.target.closest('.screenbtn');if(b)switchScreen(b.dataset.screen);});
phone.addEventListener('click',e=>{const n=e.target.closest('[data-nav]');if(n)switchScreen(n.dataset.nav);});
document.getElementById('fab').addEventListener('click',()=>{switchScreen('compose');renderCompose();});
document.getElementById('filters').addEventListener('click',e=>{const c=e.target.closest('.chip');if(!c)return;
  document.querySelectorAll('.chip').forEach(x=>x.classList.toggle('on',x===c));});

// send button (frontend only)
const input=document.getElementById('msgInput');
document.getElementById('sendBtn').addEventListener('click',()=>{
  const v=input.value.trim(); if(!v)return;
  THREAD.push({side:'out',text:v,time:'now',status:'Sent'}); input.value=''; renderThread();
});
input.addEventListener('keydown',e=>{if(e.key==='Enter')document.getElementById('sendBtn').click();});

// ---- feature map per screen ----
const FEATURES={
  inbox:[
    'Toolbar: title “Messages”, search, overflow (<code>ic_action_search_24dp</code>, <code>ic_tcx_more_vert_24dp</code>)',
    'Filter tabs: Inbox · Offers · Transactions · Spam (<code>ConversationFilter*</code>)',
    'Row = <code>layout_tcx_list_item</code>: 52dp avatar + availability, title, subtitle, timestamp, action icons',
    'Variants: unread badge, verified business ✓, OTP/Transaction/Offers label, spam (red), pin/mute, draft, group',
    'FAB new message: <code>ic_tcx_new_message_variant_24dp</code>',
  ],
  thread:[
    'Toolbar = <code>fragment_conversation_toolbar</code>: 36dp avatar, name, availability/typing, call, overflow',
    'Bubbles = <code>item_message_incoming/outgoing</code>: radius 20dp, 4dp tail; timestamp + status ticks',
    'Variants: starred (★), forwarded (↪), OTP with “Copy OTP” action',
    'Input bar = <code>layout_conversation_input_bar_default</code>: emoji, “Type a message”, attach, send FAB',
  ],
  compose:[
    'Toolbar: back + “New conversation” (<code>NewConversationTitle</code>)',
    'To: search field',
    'New group row (<code>ic_tcx_group_24dp</code>)',
    'Suggested contacts = <code>item_new_conversation</code>: avatar, name, number',
  ],
};
const MEASURE={
  inbox:'Row height 72dp · avatar 52dp · unread badge (bg_message_count) · FAB 56dp.',
  thread:'Bubble radius 20dp (4dp tail) · input bar min 48dp · send FAB.',
  compose:'Suggested row 64dp · avatar 44dp.',
};
function renderFeatures(name){
  el('#features').innerHTML=FEATURES[name].map(f=>`<li>${f}</li>`).join('');
  el('#measure').textContent=MEASURE[name];
}

renderInbox(); renderFeatures('inbox');
