// Obtener las cartas
const carta1 = document.getElementById("carta1");
const carta2 = document.getElementById("carta2");
const carta3 = document.getElementById("carta3");
const cartaAleatoria = ["url('./q.png'","url('./k.jpg'","url('./carta-delante.png')","url('./5.png')","url('./10.png')","url('./9.png')"]
const random = cartaAleatoria[Math.floor(Math.random() * cartaAleatoria.length)];

// Agregar eventos para cambiar la imagen al pasar el mouse
carta1.addEventListener("mouseover", function() {
  carta1.style.backgroundImage = "url('./carta-delante.png')";
});

carta1.addEventListener("mouseout", function() {
  carta1.style.backgroundImage = "url('./carta-atras.png')";
});

carta2.addEventListener("mouseover", function() {
  carta2.style.backgroundImage = "url('./carta-delante.png')";
});

carta2.addEventListener("mouseout", function() {
  carta2.style.backgroundImage = "url('./carta-atras.png')";
});

carta3.addEventListener("mouseover", function() {
    const cartaAleatoria = ["url('./q.png'","url('./k.jpg'","url('./carta-delante.png')","url('./5.png')","url('./10.png')","url('./9.png')"]
const random = cartaAleatoria[Math.floor(Math.random() * cartaAleatoria.length)];

    carta3.style.backgroundImage = random;
  });

  carta3.addEventListener("mouseout", function() {
    carta3.style.backgroundImage = "url('./carta-atras.png')";
  });

  console.log(random)