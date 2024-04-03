const dinner = ['🍔', '🌭', '🍟', '🍟', '🍕', '🧋', '🧋']; 
//Output: ['🍔', '🌭', '🍟', '🍟', '🍕', '🧋', '🧋', ]
//Expected output ['🧋', '🧋', '🍕', '🍟', '🍟', '🌭', '🍔']
let aux = [];
for (let i = dinner.length - 1; i >= 0; i--) {
    aux.push(dinner[i]);
    
}

console.log(aux);


