document.addEventListener("keydown", function(event) {
    if (event.key === "1") {
      jugar("piedra");
    } else if (event.key === "2") {
      jugar("papel");
    } else if (event.key === "3") {
      jugar("tijera");
    }
  });
  
  const  ManosUsu = document.getElementById("mano-usuario");
  const  ManosPC = document.getElementById("mano-computadora");
  const containerManos = document.getElementById("container-manos");
  const opcionespc = [ "./img/piedra.png",
  "./img/papel.png",
  "./img/tijera.png","./img/piedra.png",
  "./img/papel.png",
  "./img/tijera.png","./img/piedra.png",
  "./img/papel.png",
  "./img/tijera.png",];
  const opciones = ["piedra", "papel","tijera",]
  function jugar(opcionUsuario) {
 

    let contador = 0;
    intervalo = setInterval(function() {
      document.getElementById("descanso2").src = opcionespc[contador % opcionespc.length];
      contador++;
    }, 10);

    setTimeout(function() {
      detenerRandomizacion();
      const opcionMaquina = opcionespc[Math.floor(Math.random() * opcionespc.length)];
      mostrarResultado(opcionUsuario, opcionMaquina);
      document.getElementById("descanso2").src = opcionMaquina;
      if (opcionUsuario === "piedra") {
        document.getElementById("descanso").src = "./img/piedra.png";      
          }else if (opcionUsuario === "papel") {
            document.getElementById("descanso").src="./img/papel.png";
          }else{
            document.getElementById("descanso").src= "./img/tijera.png";
          }
    }, 700); // Randomiza durante 3 segundos

  }
  
  function detenerRandomizacion() {
    clearInterval(intervalo);
  }

  
  function mostrarResultado(opcionUsuario, opcionMaquina) {
    let resultado = "";

    //arreglar la opciones de la maquina

    if (opcionMaquina === "./img/piedra.png") {
      opcionMaquina = "piedra";
    }else if (opcionMaquina === "./img/papel.png") {
      opcionMaquina = "papel";
    }else{
      opcionMaquina = "tijera";
    }

 
  
    if (opcionUsuario === opcionMaquina) {
      resultado = "Empate!";
    } else if (
      (opcionUsuario === "piedra" && opcionMaquina === "tijera") ||
      (opcionUsuario === "papel" && opcionMaquina === "piedra") ||
      (opcionUsuario === "tijera" && opcionMaquina === "papel")
    ) {
      resultado = "¡Ganaste!";
    } else {
      resultado = "¡Perdiste!";
    }
  
 
    document.getElementById("resultado").innerText = `Elegiste ${opcionUsuario}. ${resultado}`;
    
    // Mostrar un alert con el resultado del juego
    alert(`Elegiste ${opcionUsuario}. La computadora eligió ${opcionMaquina}. ${resultado}`);

}