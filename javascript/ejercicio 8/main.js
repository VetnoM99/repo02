//punto1
let pala1 ="academia";


function funcion1 (palabra){
console.log(palabra.replace(/a/g, 'o'));
}

funcion1 (pala1);

//Punto2
function empieza (palabra){

    console.log("la palabra empieza por aca? " + palabra.startsWith('aca'))
}

empieza (pala1);

pala1 = "escuela";

empieza (pala1);
//punto 3
let hola = "hola";

function saludar(hola) {
    console.log(hola.repeat(3));
}

saludar (hola);
