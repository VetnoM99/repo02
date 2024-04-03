const dinner = ['🍔', '🌭', '🍟', '🍟']; 
//Output: ['🍔', '🌭', '🍟', '🍟']
//Expected output ['🍔', '🌭', '🍟', '🍟', '🧋', '🧋']

dinner[dinner.length] = "🥛";
dinner[dinner.length] ="🥛";
console.log(dinner);
