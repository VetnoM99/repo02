let focoEncendido = false;
const focoOff = document.querySelector(".foco")
const focoON = document.querySelector('.foco-luz');
const interruptor = document.getElementById("interruptor")

function toggleFoco() {
  interruptor.classList.toggle("encendido")
  focoEncendido = !focoEncendido;
  if (focoEncendido) {
    focoON.style.transform = 'scale(1)';
    focoON.style.opacity = '1';

   
  } else {
    focoON.style.transform = 'scale(0)';
    focoON.style.opacity = '0';
    focoOff.style.display ="block";
  }


}

document.querySelectorAll('.barras input').forEach(function(input) {
    input.addEventListener('input', function() {
    
      const focoON = document.querySelector('.foco-luz');
      const luminosidad = document.querySelector('.luminosidad').value / 100;
      const tamaño = document.querySelector('.tamaño').value / 50;
      const inclinacion = document.querySelector('.inclinacion').value;
      focoOff.style.opacity = luminosidad;
      focoOff.style.transform = `scale(${tamaño}) rotate(${inclinacion}deg)`;
      focoON.style.transform = `scale(${tamaño}) rotate(${inclinacion}deg)`;
    });
  });