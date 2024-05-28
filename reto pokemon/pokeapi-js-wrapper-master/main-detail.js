document.addEventListener('DOMContentLoaded', function () {
    // Obtener el ID del Pokémon de la URL
    const urlParams = new URLSearchParams(window.location.search);
    const pokemonId = urlParams.get('id');

    // Hacer una solicitud a la PokeAPI para obtener los detalles del Pokémon específico
    fetch(`https://pokeapi.co/api/v2/pokemon/${pokemonId}`)
        .then(response => response.json())
        .then(pokemonData => {
            // Mostrar la información del Pokémon en la página
            const pokemonName = pokemonData.name;
            const pokemonHeight = pokemonData.height;
            const pokemonWeight = pokemonData.weight;
            const pokemonAbilities = pokemonData.abilities.map(ability => ability.ability.name).join(', ');
            const pokemonTypes = pokemonData.types.map(type => type.type.name).join(', ');

            // Construir el HTML para mostrar los detalles del Pokémon
            const pokemonHTML = `
                <div class="pokemon-details">
                <div class="container-details">
                <div class="detail-t>
                    <img src="${pokemonData.sprites.front_default}" alt="${pokemonName}">
                    <h2>${pokemonName}</h2>
                    </div
                    <div class="texto-detail"
                    <p class="altura">Altura: ${pokemonHeight / 10} m</p>
                    <p class="peso">Peso: ${pokemonWeight / 10} kg</p>
                    <p class="habilidades">Habilidades:\n${pokemonAbilities}</p>
                    <p>Tipo: ${pokemonTypes}</p>
                    </div>
                    </div>
                </div>
            `;

            // Insertar el HTML en el elemento de detalles del Pokémon
            document.getElementById('pokemon-details').innerHTML = pokemonHTML;

            // Mostrar el video del Pokémon
            displayPokemonVideo(pokemonId);
        })
        .catch(error => {
            console.log('Error al obtener detalles del Pokémon:', error);
        });

    // Función para mostrar el video del Pokémon
    function displayPokemonVideo(pokemonId) {
        const videoHTML = `
            <video width="560" height="315" loop autoplay muted>
                <source src="./img/${pokemonId}.mp4" type="video/mp4">
                Tu navegador no soporta el elemento de video.
            </video>
        `;
        document.getElementById('pokemon-video').innerHTML = videoHTML;
    }
});
