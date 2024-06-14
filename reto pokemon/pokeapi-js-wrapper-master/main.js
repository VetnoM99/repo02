

document.addEventListener('DOMContentLoaded', function () {

    document.getElementById('loader').style.display = 'flex';

    // Simular un retraso de carga de 3 segundos
    setTimeout(() => {
        // Ocultar el loader
        document.getElementById('loader').style.opacity = '0'; // Reducir la opacidad del loader

        // Esperar un breve momento para que la transición de opacidad del loader se complete
        setTimeout(() => {
            document.getElementById('loader').style.display = 'none'; // Ocultar completamente el loader
            document.getElementById('page-content').style.display = 'block'; // Mostrar el contenido de la página
        }, 500); // Asegúrate de que este valor coincida con el tiempo de duración de la transición de opacidad en CSS
    }, 4000);


    const pokemonListContainer = document.getElementById('pokemon-list');



    // Función para obtener un ID de Pokémon aleatorio
    function getRandomPokemonId() {
        return Math.floor(Math.random() * 898) + 1; // Hay 898 Pokémon en la PokeAPI (hasta la generación 8)
    }

    // Función para generar las tarjetas de Pokémon y los enlaces
    function generatePokemonCards() {
        for (let i = 0; i < 20; i++) {
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
});
