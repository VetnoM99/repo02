"use strict";
document.addEventListener("DOMContentLoaded", () => {
    const buttonO = document.getElementById("button-o");
    const buttonI = document.getElementById("button-i");
    const buttonA = document.getElementById("button-a");
    const gifO = document.getElementById("gif-o");
    const gifI = document.getElementById("gif-i");
    const gifA = document.getElementById("gif-a");
    const soundO = document.getElementById("sound-o");
    const soundI = document.getElementById("sound-i");
    const soundA = document.getElementById("sound-a");
    buttonO === null || buttonO === void 0 ? void 0 : buttonO.addEventListener("click", () => {
        showGif(gifO);
        playSound(soundO);
    });
    buttonI === null || buttonI === void 0 ? void 0 : buttonI.addEventListener("click", () => {
        showGif(gifI);
        playSound(soundI);
    });
    buttonA === null || buttonA === void 0 ? void 0 : buttonA.addEventListener("click", () => {
        showGif(gifA);
        playSound(soundA);
    });
    let keyCombination = "";
    document.addEventListener("keydown", (event) => {
        const key = event.key.toLowerCase();
        if (key === "o") {
            keyCombination += key;
            showGif(gifO);
            playSound(soundO);
        }
        else if (key === "i") {
            keyCombination += key;
            showGif(gifI);
            playSound(soundI);
        }
        else if (key === "a") {
            keyCombination += key;
            showGif(gifA);
            playSound(soundA);
        }
        else {
            keyCombination = ""; // Reiniciar la combinación si se presiona otra tecla
        }
        if (keyCombination === "oiia") {
            showVideoCombination();
        }
    });
    function showGif(gif) {
        if (gif) {
            gif.classList.add("visible");
            setTimeout(() => {
                gif.classList.remove("visible");
            }, 1000); // Ocultar el gif después de 1 segundo
        }
    }
    function playSound(sound) {
        if (sound) {
            sound.currentTime = 0;
            sound.play();
        }
    }
    function showVideoCombination() {
        const videoCombination = document.getElementById("video-combination");
        if (videoCombination) {
            videoCombination.classList.remove("hidden");
            videoCombination.play();
            // Ocultar el video después de 4 segundos
            setTimeout(() => {
                videoCombination.classList.add("hidden");
                videoCombination.pause();
            }, 4000);
        }
    }
});
