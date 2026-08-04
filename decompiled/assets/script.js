var video = document.getElementById('videoElement');
var muteButton = document.getElementById('muteButton');
var unMuteButton = document.getElementById('unMuteButton');
var skipAdButton = document.getElementById('skipAdButton');
var closeButton = document.getElementById('closeButton');
var skipAdImg = document.getElementById('skipAdImage');
var privacyImg = document.getElementById('privacyImage');
var endCardImg = document.getElementById('endCardImg');

let countdownPaused = false;

video.style.display = 'none';
muteButton.style.display = 'none';
unMuteButton.style.display = 'none';
skipAdButton.style.display = 'none';
closeButton.style.display = 'none';
skipAdImg.style.display = 'none' ;
endCardImg.style.display = 'none';

// Show the video only when it's ready to play
video.oncanplay = function() {
    video.style.display = 'block'; // Show the video when ready
    unMuteButton.style.display = 'block';
    video.addEventListener('timeupdate', trackVASTEvents);
};

video.onclick = function() {
    // Call the accept invitation can be added
    window.android.handleClickVideo();
    countdownPaused = true
};

endCardImg.onclick = function() {
    window.android.handleClickEndCard();
};

privacyImg.onclick = function() {
    window.android.handleClickPrivacyIcon();
    countdownPaused = true
};

// Mute Button
muteButton.onclick = function() {
    video.muted = true;
    muteButton.style.display = 'none';
    unMuteButton.style.display = 'block';
    window.android.muteAudio();
};

// UnMute Button
unMuteButton.onclick = function() {
    video.muted = false;
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

if (video) {
    video.preload = "auto";
}
if (video) {
    video.load();
}

function trackVASTEvents() {

    var duration = video.duration;
    var currentTime = video.currentTime;

    if (currentTime > 0 && !start) {
        start = true;
        window.android.trackStart(video.duration);
    }
    if (currentTime > 0 && !impressionGenerated && start) {
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
        window.android.trackCompleteVideo();
        start = false;
        firstQuartileTracked = false;
        secondQuartileTracked = false;
        thirdQuartileTracked = false;
        completeTracked = false;
        video.removeEventListener('timeupdate', trackVASTEvents);
        if(skipAdImg.style.display != 'block'){
            skipAdImg.style.display = 'block';
        }
    }
}

closeButton.onclick = function() {
    window.android.handleCustomClose();
    video.removeEventListener('timeupdate', trackVASTEvents);
}

var timeLeft; // Set the timer duration here

function beginVideo(offsetTime){
    timeLeft = offsetTime  ;
    skipAdButton.style.display = 'block';
    skipAdTimer() ;
    document.querySelectorAll('video').forEach(v => v.removeAttribute('controls'));
}

function skipAdTimer() {

    skipAdButton.innerHTML =  timeLeft;
    skipAdButton.disabled = true; // Initially disable the skip button

    // Countdown Logic to Enable Skip Ad Button
    const countdown = setInterval(() => {

        if (!countdownPaused) {
            if (timeLeft > 1) {
                timeLeft -= 1;
                skipAdButton.innerHTML =  timeLeft;
            } else {
                clearInterval(countdown);
                skipAdButton.style.display = 'none';
                skipAdImg.style.display = 'block';
            }
        }
    }, 1000);

     skipAdImg.addEventListener("click" , () =>{
        window.android.handleClickSkip()
        skipAdImg.style.display = 'none';
        video.style.display = 'none';
        video.src = '';
        video.load(); // Stop the video
        video.parentNode.removeChild(video); // Optional: Remove the video element
        muteButton.style.display = 'none';
        unMuteButton.style.display = 'none';
        closeButton.style.display = 'block';
        privacyImg.style.display = 'block';
        endCardImg.style.display = 'block';
     })
}