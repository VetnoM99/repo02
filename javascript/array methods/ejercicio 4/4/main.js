const dinner = ['🍔', '🌭', '🍟', '🍟', '🍕', '🧋', '🧋']; 
//Output: ['🍔', '🌭', '🍟', '🍟', '🍕', '🧋', '🧋', ]
//Expected output ['🧋', '🧋', '🍕', '🍟', '🍟', '🌭', '🍔']


// dinner.forEach((element, index, array) => {
// 	const reverse = array.length - 1 - index;
// 	if (index < reverse) {
// 		[array[index], array[reverse]] = [array[reverse], array[index]];
// 	}
// });
// console.log(dinner)

dinner.forEach(function(_, index) {
    if (index < Math.floor(dinner.length / 2)) {
      let temp = dinner[index];
      dinner[index] = dinner[dinner.length - 1 - index];
      dinner[dinner.length - 1 - index] = temp;
    }
  });

  console.log(dinner)