const drinksConsumed = [
    { nombre: 'Alice', bebida: '🍹', hora: '18:30:00' },
    { nombre: 'Bob', bebida: '🍷', hora: '19:15:00' },
    { nombre: 'Charlie', bebida: '🍹', hora: '20:00:00' },
    { nombre: 'Alice', bebida: '🍸', hora: '21:45:00' },
    { nombre: 'Bob', bebida: '🥂', hora: '22:30:00' },
    { nombre: 'Charlie', bebida: '🍵', hora: '23:15:00' },
    { nombre: 'Alice', bebida: '🍹', hora: '03:30:00' },
    { nombre: 'Bob', bebida: '🍺', hora: '04:15:00' },
    { nombre: 'Charlie', bebida: '🍸', hora: '05:00:00' },
  ];
  
  function encontrado(array, targetDrink) {
	const firstOccurrenceIndex = array
		.map((item) => item.bebida)
		.indexOf(targetDrink);

	if (firstOccurrenceIndex !== -1) {
		const nombre = array[firstOccurrenceIndex].nombre;
		console.log(
			"First occurrence of ",targetDrink, " found by ",nombre, " at index: ",firstOccurrenceIndex
		);
	} else {
		console.log(`${targetDrink} not found in the array.`);
	}
}

encontrado(drinksConsumed, "🍹");
encontrado(drinksConsumed, "🥂");

