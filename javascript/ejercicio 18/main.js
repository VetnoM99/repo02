const fillBarEatTxt = document.getElementById('fillBar-eat-txt');
const fillBarEat = document.getElementById("fillBar-eat")
        let progress = 100; // Valor inicial (puede ser cualquier otro valor)
        const maxProgress = 100;
        function decreaseProgress() {
            progress -= 1; // Disminuye el progreso en 1 (ajusta según tus necesidades)
            fillBarEat.style.width = progress + '%'; // Actualiza el ancho de la barra
            fillBarEatTxt.textContent = progress + '%'; // Muestra el porcentaje debajo de la barra
            progress = Math.max(0, progress);
            updateProgressBar();
           
        
      
        }

        // Llama a decreaseProgress cada segundo (ajusta el intervalo según tus necesidades)
        setInterval(decreaseProgress, 100);

  
        function updateProgressBar() {
            fillBarEat.style.width = progress + '%'; // Actualiza el ancho de la barra
            fillBarEatTxt.textContent = progress + '%'; // Muestra el porcentaje debajo de la barra
            if (progress < 100 && progress >=70){
                fillBarEatTxt.style.color= "black";
                fillBarEatTxt.textContent = progress +"% 😃"
            }else if(progress<=70 && progress >=60){
                fillBarEatTxt.style.color= "black";
                fillBarEatTxt.textContent = progress +"% 🙂"
            }else
    if(progress <= 60 && progress >50){
        fillBarEatTxt.style.color = "black";
        fillBarEatTxt.textContent = progress + "%😐"
    }
            else if (progress <= 50 && progress > 40) {
                fillBarEatTxt.style.color = 'yellowgreen';
                fillBarEatTxt.textContent = progress + "%🫤"
              } else if (progress <= 40 && progress> 20) {
                fillBarEatTxt.style.color ="orange";
                fillBarEatTxt.textContent = progress + '%! ☹️';

              } else if (progress <20 && progress > 0){
                  fillBarEatTxt.style.color="red";
                fillBarEatTxt.textContent = progress + "%!!!😨"
              } else if (progress === 0){
                fillBarEatTxt.textContent = "☠️"
            }
        }

        function incrementProgress(amount) {
            progress += amount; // Incrementa el progreso según el botón
            progress = Math.min(100, progress); // Asegura que el valor no supere el 100%
            updateProgressBar();
        }

        function fillProgress(amount) {
            progress = Math.min(101, progress);
            progress += amount; // Aumenta el progreso según el botón presionado
            progress = Math.min(progress, maxProgress); // Asegura que no exceda el 100%
            updateProgressBar();
        }