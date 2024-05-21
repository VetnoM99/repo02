document.addEventListener('DOMContentLoaded', function () {
    const pokemonListContainer = document.getElementById('pokemon-list');

    // Función para obtener un ID de Pokémon aleatorio
    function getRandomPokemonId() {
        return Math.floor(Math.random() * 898) + 1; // Hay 898 Pokémon en la PokeAPI (hasta la generación 8)
    }

    // Función para generar las tarjetas de Pokémon y los enlaces
    function generatePokemonCards() {
        for (let i = 0; i < 15; i++) {
            const pokemonId = getRandomPokemonId();
            fetch(`https://pokeapi.co/api/v2/pokemon/${pokemonId}`)
                .then(response => response.json())
                .then(pokemon => {
                    const pokemonCard = document.createElement('a');
                    pokemonCard.href = `./pokemon-details.html?id=${pokemonId}`; // Enlace a la página de detalles del Pokémon con el ID como parámetro
                    pokemonCard.classList.add('card');
                    pokemonCard.innerHTML = `
                        <img src="${pokemon.sprites.front_default}" alt="${pokemon.name}">
                        <h2>${pokemon.name}</h2>
                    `;
                    pokemonListContainer.appendChild(pokemonCard);
                })
                .catch(error => {
                    console.log('Error al obtener los detalles del Pokémon:', error);
                });
        }
    }

    // Generar las tarjetas de Pokémon al cargar la página
    generatePokemonCards();
});


const categoriesButton = document.getElementById('categories-button');
const categoriesList = document.getElementById('categories-list');

// Obtener y mostrar los tipos de Pokémon cuando se hace clic en el botón de categorías
categoriesButton.addEventListener('click', function () {
    if (categoriesList.style.maxHeight) {
        // Si el menú ya está abierto, cerrarlo
        categoriesList.style.maxHeight = null;
    } else {
        // Si el menú está cerrado, abrirlo y mostrar los tipos de Pokémon
        categoriesList.style.maxHeight = categoriesList.scrollHeight + 'px';
    }
});

// Hacer una solicitud a la PokeAPI para obtener los tipos de Pokémon
fetch('https://pokeapi.co/api/v2/type')
    .then(response => response.json())
    .then(data => {
          // Mostrar los tipos de Pokémon en el menú desplegable
          data.results.forEach(type => {
            const listItem = document.createElement('li');
            listItem.textContent = type.name;
            // Generar un color aleatorio
            const randomColor = '#' + Math.floor(Math.random()*16777215).toString(16);
            // Aplicar el color aleatorio al fondo del elemento de la lista
            listItem.style.backgroundColor = randomColor;
            categoriesList.appendChild(listItem);
        });
    })
    .catch(error => {
        console.log('Error al obtener los tipos de Pokémon:', error);
    });

