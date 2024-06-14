

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
    }, 2000);

    const urlParams = new URLSearchParams(window.location.search);
    const pokemonId = urlParams.get('id');


    fetch(`https://pokeapi.co/api/v2/pokemon/${pokemonId}`)
        .then(response => response.json())
        .then(pokemonData => {
            const pokemonName = pokemonData.name;
            const pokemonHeight = pokemonData.height;
            const pokemonWeight = pokemonData.weight;
            const pokemonAbilities = pokemonData.abilities.map(ability => ability.ability.name).join(', ');
            const pokemonTypes = pokemonData.types.map(type => type.type.name).join(', ');
            const pokemonImage = pokemonData.sprites.front_default;
            const pokemonShinyImage = pokemonData.sprites.front_shiny; // Imagen shiny
            const pokemonImageBack = pokemonData.sprites.back_default;
            const pokemonShinyImageBack = pokemonData.sprites.back_shiny;

                    fetch(pokemonData.species.url)
                        .then(response => response.json())
                        .then(speciesData => {
                            const pokemonDescription = speciesData.flavor_text_entries.find(entry => entry.language.name === 'es').flavor_text;
                            const evolutionChainUrl = speciesData.evolution_chain.url;

                            fetch(evolutionChainUrl)
                                .then(response => response.json())
                                .then(evolutionData => {
                                    const evolutions = [];
                                    let currentEvolution = evolutionData.chain;
                                    
                                    do {
                                        evolutions.push(currentEvolution.species.name);
                                        currentEvolution = currentEvolution.evolves_to[0];
                                    } while (currentEvolution);

                                    const pokemonHTML = `
                                        <div class="pokemon-info">
                                            <h2>${pokemonName}</h2>
                                            <p>Altura: ${pokemonHeight / 10} m</p>
                                            <p>Peso: ${pokemonWeight / 10} kg</p>
                                            <p>Habilidades: ${pokemonAbilities}</p>
                                            <p>Tipo: ${pokemonTypes}</p>
                                        </div>
                                        <div class="pokemon-description">
                                            <h3>Descripción</h3>
                                            <p>${pokemonDescription}</p>
                                        </div>
                        <div class="pokemon-images">
                                    <img src="${pokemonImage}" alt="${pokemonName}">
                                    <img src="${pokemonShinyImage}" alt="${pokemonName} Shiny Back">
                                </div>
                                        <div class="pokemon-stats">
                                            <h3>Estadísticas</h3>
                                        
                                                ${pokemonData.stats.map(stat => `<li>${stat.stat.name}: ${stat.base_stat}</li>`).join('')}
                                            
                                        </div>
                                        <div class="pokemon-evolutions">
                                            <h3>Evoluciones</h3>
                                            <p>${evolutions.join(' → ')}</p>
                                        </div>
                                    `;

                                    document.getElementById('pokemon-details').innerHTML = pokemonHTML;

                                    // Agregar hover para mostrar la imagen de espalda con efecto de opacidad
                                    const pokemonImages = document.querySelectorAll('.pokemon-images img');
                                    pokemonImages.forEach(image => {
                                        image.addEventListener('mouseenter', function () {
                                            this.style.opacity = '0'; // Reducir la opacidad
                                            setTimeout(() => {
                                                this.src = this.alt.includes('Shiny') ? pokemonShinyImageBack : pokemonImageBack;
                                                this.style.opacity = '1'; // Restaurar la opacidad
                                            }, 200); // Ajustar el tiempo según la transición en CSS
                                        });
                                        image.addEventListener('mouseleave', function () {
                                            this.style.opacity = '0'; // Reducir la opacidad
                                            setTimeout(() => {
                                                this.src = this.alt.includes('Shiny') ? pokemonShinyImage : pokemonImage;
                                                this.style.opacity = '1'; // Restaurar la opacidad
                                            }, 200); // Ajustar el tiempo según la transición en CSS
                                        });
                                    });
                                });
                        });
                })
                .catch(error => {
                    console.log('Error al obtener detalles del Pokémon:', error);
                });
        });