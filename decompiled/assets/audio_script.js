var audio = document.getElementById('audioElement');
var muteButton = document.getElementById('muteButton');
var unMuteButton = document.getElementById('unMuteButton');
var skipAdButton = document.getElementById('skipAdButton');
var closeButton = document.getElementById('closeButton');

let countdownPaused = false;

audio.style.display ='none';
muteButton.style.display ='none';
unMuteButton.style.display ='none';
skipAdButton.style.display = 'none';
closeButton.style.display = 'none';

// Show the audio only when it's ready to play
audio.oncanplay = function() {
    audio.style.display = 'block';  // Show the audio when ready
    muteButton.style.display = 'block';
    audio.addEventListener('timeupdate', trackVASTEvents);
};

audio.addEventListener('ended',function() {
    skipAdButton.style.display = 'none';
    closeButton.style.display = 'block';
});

audio.onclick = function() {
    // Call the accept invitation can be added
    window.android.handleClickVideo();
    countdownPaused = true

};


// Mute Button
muteButton.onclick = function() {
    audio.muted = true;
    muteButton.style.display = 'none';
    unMuteButton.style.display = 'block';
    window.android.muteAudio();
};

// UnMute Button
unMuteButton.onclick = function() {
    audio.muted = false;
    muteButton.style.display = 'block';
    unMuteButton.style.display = 'none';
    window.android.unMuteAudio();
};


var start = false;
var firstQuartileTracked = false;
var secondQuartileTracked = false;
var thirdQuartileTracked = false;
var completeTracked = false;
var impressionGenerated = false;

if (audio) {
    audio.preload = "auto";
}

if (audio) {
    audio.load();
}

function trackVASTEvents() {


// Track VAST ad events

    var duration = audio.duration;
    var currentTime = audio.currentTime;

    if(currentTime >0 && !start) {
        start = true;
        window.android.trackStart(audio.duration);
    }
    if(currentTime >0 && !impressionGenerated && start) {
        impressionGenerated = true;
        window.android.trackImpression();
    }
    if (currentTime > duration * 0.25 && !firstQuartileTracked) {
        firstQuartileTracked = true;
        window.android.trackFirstQuartile();
    }
    if (currentTime > duration * 0.5 && !secondQuartileTracked) {
        secondQuartileTracked = true;
        window.android.trackMidPoint();
    }
    if (currentTime > duration * 0.75 && !thirdQuartileTracked) {
        thirdQuartileTracked = true;
        window.android.trackThirdQuartile();
    }
    if (currentTime >= duration && !completeTracked) {
        completeTracked = true;
//        skipAdButton.style.display = 'none';
//        closeButton.style.display = 'block';

        window.android.trackCompleteVideo();
        start = false;
        firstQuartileTracked = false;
        secondQuartileTracked = false;
        thirdQuartileTracked = false;
        completeTracked = false;

        audio.removeEventListener('timeupdate', trackVASTEvents);

    }
}

closeButton.onclick = function() {
    window.android.handleCustomClose();
    audio.removeEventListener('timeupdate', trackVASTEvents);

}

var timeLeft  ;  // Set the timer duration here


function skipAdTimer()  {

// Skip Ad Button Logic
skipAdButton.innerHTML = "Skip Ad in " + timeLeft;
skipAdButton.disabled = true;  // Initially disable the skip button

// Countdown Logic to Enable Skip Ad Button
const countdown = setInterval(() => {

 if (!countdownPaused) {
    if (timeLeft > 1) {
        timeLeft -= 1;
        skipAdButton.innerHTML = "Skip Ad in " + timeLeft;
    } else {
        clearInterval(countdown);
        skipAdButton.style.display = 'block';
//        closeButton.style.display = 'block';

        skipAdButton.innerHTML = "Skip Ad";
        skipAdButton.disabled = false;  // Enable the button after countdown
        skipAdButton.classList.add("enabled");  // Optionally style the enabled button
    }
  }
}, 1000);

// Handle Skip Ad Button Click
skipAdButton.addEventListener("click", () => {
    if (!skipAdButton.disabled) {

        audio.removeEventListener('timeupdate', trackVASTEvents);
        window.android.handleClickSkip();  // Skip ad via Android interface
    } else {
        console.log("Button is not enabled yet!");  // Prevent early click
    }
});
}