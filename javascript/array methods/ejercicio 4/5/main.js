const dinner = ['🍔', '🌭', '🍟', '🍟', '🍕', '🧋', '🧋']; 
//Output ['🧋', '🧋', '🍕', '🍟', '🍟', '🌭', '🍔']
//Expected output ['🍸', '🧋', '🧋', '🍕', '🍟', '🍟', '🌭', '🍔']

dinner.unshift("🍸")

console.log(dinner);