document.addEventListener("DOMContentLoaded", () => {
  const buttonO = document.getElementById("button-o");
  const buttonI = document.getElementById("button-i");
  const buttonA = document.getElementById("button-a");

  const gifO = document.getElementById("gif-o");
  const gifI = document.getElementById("gif-i");
  const gifA = document.getElementById("gif-a");

  const soundO = document.getElementById("sound-o") as HTMLAudioElement;
  const soundI = document.getElementById("sound-i") as HTMLAudioElement;
  const soundA = document.getElementById("sound-a") as HTMLAudioElement;

  buttonO?.addEventListener("click", () => {
    showGif(gifO);
    playSound(soundO);
  });

  buttonI?.addEventListener("click", () => {
    showGif(gifI);
    playSound(soundI);
  });

  buttonA?.addEventListener("click", () => {
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
    } else if (key === "i") {
      keyCombination += key;
      showGif(gifI);
      playSound(soundI);
    } else if (key === "a") {
      keyCombination += key;
      showGif(gifA);
      playSound(soundA);
    } else {
      keyCombination = ""; // Reiniciar la combinación si se presiona otra tecla
    }

    if (keyCombination === "oiia") {
      showVideoCombination();
    }
  });

  function showGif(gif: HTMLElement | null) {
    if (gif) {
      gif.classList.add("visible");
      setTimeout(() => {
        gif.classList.remove("visible");
      }, 1000); // Ocultar el gif después de 1 segundo
    }
  }

  function playSound(sound: HTMLAudioElement) {
    if (sound) {
      sound.currentTime = 0;
      sound.play();
    }
  }

  function showVideoCombination() {
    const videoCombination = document.getElementById("video-combination") as HTMLVideoElement;

    if (videoCombination) {
      videoCombination.classList.remove("hidden");
      videoCombination.play();

      // Ocultar el video después de 4 segundos
      setTimeout(() => {
        videoCombination.classList.add("hidden")
        videoCombination.pause();
      }, 4000);
    }
  }
});
