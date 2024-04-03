
const ticket01 = ['🍺', '🍺', '🥜']; 
//👨🏻‍🦰 Output: ['🍺', '🍺', '🥜']
const ticket02 = ['🍺', '🥪', '🥙']; 
//👱🏽‍♂️ Output: ['🍺', '🥪', '🥙']

const combinedTicket = []; 
//Output: []
//Expected output ['🍺', '🍺', '🍺', '🥜', '🍺', '🥪', '🥙']



ticket01.forEach(function(elemento) {
    combinedTicket[combinedTicket.length] = elemento;
  });
  
  // Agregar elementos del segundo array
  ticket02.forEach(function(elemento) {
    combinedTicket[combinedTicket.length] = elemento;
  });

  console.log(combinedTicket);