const ticket01 = ['🍺', '🍺', '🥜']; 
//👨🏻‍🦰 Output: ['🍺', '🍺', '🥜']
const ticket02 = ['🍺', '🥪', '🥙']; 
//👱🏽‍♂️ Output: ['🍺', '🥪', '🥙']


//Output: []
//Expected output ['🍺', '🍺', '🍺', '🥜', '🍺', '🥪', '🥙']

const combinedTicket = ticket01.concat( ticket02);

console.log(combinedTicket);