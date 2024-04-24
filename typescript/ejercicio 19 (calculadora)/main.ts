const themes = [
  { backgroundColor: '#394666', textColor: '#ffffff', boton: "#ff0000" }, // Tema 1
  { backgroundColor: '#87ceeb', textColor: '#000000', boton: "#fa9494" }, // Tema 2
  { backgroundColor: '#90ee90', textColor: '#000000', boton: "#ffc7c7" }, // Tema 3
];
const calculator = document.querySelector('.calculator') as HTMLElement | null;
const display = document.getElementById('display');
const clearButton = document.getElementById('clearButton');
const deleteButton = document.getElementById('deleteButton');
const equalsButton = document.getElementById('equalsButton');

function applyTheme(themeIndex: number) {
  const theme = themes[themeIndex];
  calculator!.style.backgroundColor = theme.backgroundColor;
  display!.style.color = theme.textColor;
  clearButton!.style.backgroundColor = theme.boton;
  deleteButton!.style.backgroundColor = theme.boton;
  equalsButton!.style.backgroundColor = theme.boton;
}
document.addEventListener('DOMContentLoaded', () => {
  const slider = document.getElementById('themeSlider') as HTMLInputElement;
  const themeValue = document.getElementById('themeValue');
  const calculator = document.querySelector('.calculator');
  const display = document.getElementById('display');

  let themeIndex: number;
  if (themeValue && calculator && display) {
    slider.addEventListener('input', () => {
      themeIndex = parseInt(slider.value);
      applyTheme(themeIndex);
      themeValue.innerText = `Tema ${themeIndex + 1}`;
      
      // Agregar clase 'step2' al slider cuando llega al segundo paso
      if (themeIndex === 1) {
        slider.classList.add('step2');
      } else {
        slider.classList.remove('step2');
      }
    });
  }
});



  
  
  



function appendToDisplay(value: string) {
  const display = document.getElementById('display') as HTMLInputElement;
  display.value += value;
}

function clearDisplay() {
  const display = document.getElementById('display') as HTMLInputElement;
  display.value = '';
}

function calculate() {
  try {
    const display = document.getElementById('display') as HTMLInputElement;
    const result = eval(display.value);
    
    // Animación de opacidad progresiva
    display.style.transition = 'opacity 1s';
    display.style.opacity = '0';
    
    // Mostrar el resultado después de 1 segundo
    setTimeout(() => {
      display.style.opacity = '1';
      display.value = result;
    }, 600);
  } catch (error) {
    const display = document.getElementById('display') as HTMLInputElement;
    display.value = 'Error';
  }
}



