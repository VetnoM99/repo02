const boton = document.getElementById("boton")
const imagen = document.getElementById ("imagen")
const imagen2 = document.getElementById("imagen2")

boton.addEventListener("click", function() {
    imagen.classList.toggle("fondo2");
    imagen2.classList.toggle("fondo4");
  });