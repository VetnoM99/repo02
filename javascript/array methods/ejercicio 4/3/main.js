const dinner = ['🍔', '🌭', '🍟', '🍟', '🍕', '🧋', '🧋']; 
//Output: ['🍔', '🌭', '🍟', '🍟', '🍕', '🧋', '🧋', ]
//Expected output ['🧋', '🧋', '🍕', '🍟', '🍟', '🌭', '🍔']
let aux = [];
for (let i = 0; i < Math.floor(dinner.length / 2); i++) {
    let aux = dinner[i];
    dinner[i] = dinner[dinner.length- 1 - i];
    dinner[dinner.length - 1 - i] = aux;
  }
  console.log(dinner)
  