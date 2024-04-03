const ticket01 = ['🍺', '🍺', '🥜']; 
//👨🏻‍🦰 Output: ['🍺', '🍺', '🥜']
const ticket02 = ['🍺', '🥪', '🥙']; 
//👱🏽‍♂️ Output: ['🍺', '🥪', '🥙']


//Output: []
//Expected output ['🍺', '🍺', '🍺', '🥜', '🍺', '🥪', '🥙']


const combinedTicket = []; 
combinedTicket.push(...ticket01);
combinedTicket.push(...ticket02);

console.log(combinedTicket);