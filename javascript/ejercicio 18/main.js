const fillBarEatTxt = document.getElementById('fillBar-eat-txt');
const fillBarEat = document.getElementById("fillBar-eat")
const fillBarTrain = document.getElementById("fillBar-train");
const fillBarTrainTxt = document.getElementById ("fillBar-train-txt");
const fillBarFight = document.getElementById("fillBar-fight");
const fillBarFightTxt = document.getElementById ("fillBar-fight-txt");
const fillBarSleep = document.getElementById("fillBar-sleep");
const fillBarSleepTxt= document.getElementById("fillBar-sleep-txt");
const fillBarGoku = document.getElementById("fillBar-goku");
const fillBarGokuTxt = document.getElementById("fillBar-goku-txt")
const sprite = document.getElementById('sprite');
const sprite2 = document.getElementById("sprite2");
const ki = document.getElementById("ki");
const pesa = document.getElementById("pesa");
const fillBarCora = document.getElementById("fillBar-cora");
const fillBarCoraTxt = document.getElementById("vida-txt");

        let progress = 100; //barra eat
        let progress2= 100; // barra train;
        let progress3 = 100; // barra fight
        let progress4 = 100; // barra sleep
        let prom = 100;
        let vida = 100;

        const max = 100;

        function decreaseProgress() {
            progress -= Math.floor(Math.random()*1.9); // Disminuye el progreso en 1 
            progress2 -= Math.floor( Math.random()*1.8);
            progress3 -= Math.floor( Math.random()*1.7);
            progress4 -= Math.floor( Math.random()*1.4); 
            prom -= Math.floor(Math.random()*1.1);
            fillBarEat.style.width = progress + '%'; // Actualiza el ancho de la barra
            fillBarEatTxt.textContent = progress + '%'; // Muestra el porcentaje debajo de la barra
            fillBarTrain.style.width = progress2 + '%'; 
            fillBarTrainTxt.textContent = progress2 + '%';
            fillBarFight.style.width = progress3 + '%'; 
            fillBarFightTxt.textContent = progress3 + '%';
            fillBarSleep.style.width = progress4 + '%'; 
            fillBarSleepTxt.textContent = progress4 + '%';
            fillBarGoku.style.width = prom + '%'; 
            fillBarGokuTxt.textContent = prom + '% Energy'; 
            fillBarCora.style.width = vida + '%';
            fillBarCoraTxt.textContent = vida + '% vida';
            progress = Math.max(0, progress);
            progress2 = Math.max(0, progress2);
            progress3 = Math.max(0, progress3);
            progress4 = Math.max(0, progress4);
            prom = Math.max(0, prom);
            vida = Math.max(0, vida)
            let nuevoIntervalo = generarIntervaloAleatorio(1000, 5000);
        
            // Llamar a setInterval() con la misma función y el nuevo intervalo
            setTimeout(generarIntervaloAleatorio, nuevoIntervalo);
            updateProgressBar();
        }
        
        function generarIntervaloAleatorio(min, max) {
           
            return Math.floor(Math.random() * (max - min + 1)) + min;
        }
        
setInterval(decreaseProgress, 2000 )
        // Llama a decreaseProgress cada segundo (ajusta el intervalo según tus necesidades

  
        function updateProgressBar() {
           
            fillBarEat.style.width = progress + '%'; // Actualiza el ancho de la barra
            fillBarEatTxt.textContent = progress + '%'; // Muestra el porcentaje debajo de la barra
            fillBarTrain.style.width = progress2 + '%'; 
            fillBarTrainTxt.textContent = progress2 + '%'; 
            fillBarFight.style.width = progress3 + '%'; 
            fillBarFightTxt.textContent = progress3 + '%'; 
            fillBarSleep.style.width = progress4 + '%'; 
            fillBarSleepTxt.style.textContent = progress4 + '%';
            fillBarGoku.style.width = prom + '%';
            fillBarGokuTxt.textContent = prom + '% Energy';
            fillBarCora.style.width = vida + '%';
            fillBarCoraTxt.textContent = vida +  '% Vida';
         
    function getEmoji(progress) {
        if (progress <= 100 && progress >= 70) {
          return "😃";
        } else if (progress <= 70 && progress >= 60) {
          return "🙂";
        } else if (progress <= 60 && progress > 50) {
          return "😐";
        } else if (progress <= 50 && progress > 40) {
          return "🫤";
        } else if (progress <= 40 && progress > 20) {
          return "☹️";
        } else if (progress <= 20 && progress > 0) {
          return "😨";
        } else if (progress === 0) {
          return "☠️";
        }
      }
      function getEmoji2(progress) {
        if (progress <= 100 && progress >= 70) {
          return "😃";
        } else if (progress <= 70 && progress >= 60) {
          return "🙂";
        } else if (progress <= 60 && progress > 50) {
          return "😐";
        } else if (progress <= 50 && progress > 40) {
          return "🫤";
        } else if (progress <= 40 && progress > 20) {
          return "☹️";
        } else if (progress <= 20 && progress > 0) {
          return "😨";
        } else if (progress === 0) {
          return "☠️";
        }
      }
      function getEmoji3(progress) {
        if (progress <= 100 && progress >= 70) {
          return "😃";
        } else if (progress <= 70 && progress >= 60) {
          return "🙂";
        } else if (progress <= 60 && progress > 50) {
          return "😐";
        } else if (progress <= 50 && progress > 40) {
          return "🫤";
        } else if (progress <= 40 && progress > 20) {
          return "☹️";
        } else if (progress <= 20 && progress > 0) {
          return "😨";
        } else if (progress === 0) {
          return "☠️";
        }
      }
   
    function getEmoji4(progress) {
      if (progress <= 100 && progress >= 70) {
        return "😃";
      } else if (progress <= 70 && progress >= 60) {
        return "🙂";
      } else if (progress <= 60 && progress > 50) {
        return "😐";
      } else if (progress <= 50 && progress > 40) {
        return "🫤";
      } else if (progress <= 40 && progress > 20) {
        return "☹️";
      } else if (progress <= 20 && progress > 0) {
        return "😨";
      } else if (progress === 0) {
        return "☠️";
      }
    }
 
      
      function updateBar(progress, fillBar) {
        let emoji = getEmoji(progress);
        fillBar.style.color = progress < 20 ? "red" : progress <= 50 ? "orange" : "black";
        fillBar.textContent = progress === 0 ? emoji : progress + "%" + emoji;
      }
      function updateBar2(progress, fillBar) {
        let emoji = getEmoji2(progress);
        fillBar.style.color = progress2 < 20 ? "red" : progress2<= 50 ? "orange" : "black";
        fillBar.textContent = progress2 === 0 ? emoji : progress2 + "%" + emoji;
      }
      function updateBar3(progress, fillBar) {
        let emoji = getEmoji3(progress);
        fillBar.style.color = progress3 < 20 ? "red" : progress3<= 50 ? "orange" : "black";
        fillBar.textContent = progress3 === 0 ? emoji : progress3 + "%" + emoji;
      }
      function updateBar4(progress, fillBar) {
        let emoji = getEmoji4(progress);
        fillBar.style.color = progress4 < 20 ? "red" : progress4<= 50 ? "orange" : "black";
        fillBar.textContent = progress4 === 0 ? emoji : progress4 + "%" + emoji;
      }
      updateBar(progress, fillBarEatTxt);
      updateBar2(progress2,fillBarTrainTxt);
      updateBar3(progress3,fillBarFightTxt);
      updateBar4(progress4,fillBarSleepTxt);
      
    }



        function fillProgress(amount) {
            progress = Math.min(101, progress);
            progress += amount; // Aumenta el progreso según el botón presionado
            progress = Math.min(progress, max);
            prom += Math.floor(Math.random()*20);
            prom = Math.min(100, prom);
            prom = Math.min(prom, max);
            vida += Math.floor(Math.random()*20);
          vida = Math.min(100,vida);
          vida = Math.min(vida, max);
            updateProgressBar();
            
        }

        
        function fillProgress2(amount) {
            progress2= Math.min(101, progress2);
            progress2 += amount; // Aumenta el progreso según el botón presionado
            progress2 = Math.min(progress2, max);
            prom -= Math.floor(Math.random()*20);
            prom = Math.min(100,prom);
            prom = Math.min(prom, max);
            updateProgressBar();
        }

        function fillProgress3(amount) {
          progress3= Math.min(101, progress3);
          progress3 += amount; // Aumenta el progreso según el botón presionado
          progress3 = Math.min(progress3, max); 
          prom -= Math.floor(Math.random()*20);
          prom = Math.min(100,prom);
          prom = Math.min(prom, max);
          vida -= Math.floor(Math.random()*20);
          vida = Math.min(100,vida)
          vida = Math.min(vida, max);
          updateProgressBar();
      }

      function fillProgress4(amount) {
        progress4= Math.min(101, progress3);
        progress4 += amount; // Aumenta el progreso según el botón presionado
        progress4 = Math.min(progress4, max); 
        prom += Math.floor(Math.random()*20);;
        prom = Math.min(100, prom);
        prom = math.min(prom, max)
        updateProgressBar();
    }

      const fight = document.getElementById('fight-b2');
      const train = document.getElementById("train-b2")
      const train2 = document.getElementById("train-b3");
      
      fight.addEventListener('click', function() {
        // Mostrar la segunda imagen (GIF)
        sprite.style.opacity = '0';
        sprite2.style.opacity = '1';
      
        // Cambiar nuevamente a la primera imagen después de que termine la reproducción del GIF
        setTimeout(function() {
          sprite.style.opacity = '1';
          sprite2.style.opacity = '0';
        }, 8800); // Cambiar la imagen después de 9000 ms (9 segundos)
      });

      train.addEventListener('click', function() {
        // Mostrar la segunda imagen (GIF)
        sprite.style.opacity = '0';
        ki.style.opacity = '1';
      
        // Cambiar nuevamente a la primera imagen después de que termine la reproducción del GIF
        setTimeout(function() {
          sprite.style.opacity = '1';
          ki.style.opacity = '0';
        }, 3000); // Cambiar la imagen después de 9000 ms (9 segundos)
      });

      train2.addEventListener('click', function() {
        // Mostrar la segunda imagen (GIF)
        sprite.style.opacity = '0';
        pesa.style.opacity = '1';
      
        // Cambiar nuevamente a la primera imagen después de que termine la reproducción del GIF
        setTimeout(function() {
          sprite.style.opacity = '1';
          pesa.style.opacity = '0';
        }, 2400); // Cambiar la imagen después de 9000 ms (9 segundos)
      });