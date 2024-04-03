const ticket01 = ['🍺', '🍺', '🥜']; 
//👨🏻‍🦰 Output: ['🍺', '🍺', '🥜']
const ticket02 = ['🍺', '🥪', '🥙']; 
//👱🏽‍♂️ Output: ['🍺', '🥪', '🥙']

const combinedTicket = []; 
//Output: []
//Expected output ['🍺', '🍺', '🍺', '🥜', '🍺', '🥪', '🥙']

/// Agregar elementos del primer array
for (let i = 0; i < ticket01.length; i++) {
    combinedTicket[combinedTicket.length] = ticket01[i];
  }
  
  // Agregar elementos del segundo array
  for (let i = 0; i < ticket02.length; i++) {
    combinedTicket[combinedTicket.length] = ticket02[i];
  }

  console.log(combinedTicket);