//punto  numero 1
let num1= Math.round(Math.random() *10);
let num2= Math.round(Math.random() *10);
let num3= Math.round(Math.random() *10);

console.log("los numeros son", + num1, + num2, + num3);

function suma (num1, num2, num3){
    let resultado = num1 + num2 + num3;
    return(resultado);
}

let resultado = suma(num1, num2, num3);
console.log("la suma es ", resultado);
//punto numero 2
let nomb;
let apellido1;
let apellido2;
let nombrecompleto;

function nombre (nom, ape1, ape2){
    nom = "Eric";
    ape1 = "Alessi";
    ape2 = "Gonzalez";
    console.log(nom," " + ape1," " + ape2);

}
nombre (nomb, apellido1, apellido2);
//punto numero 3
let comp1 = Math.round(Math.random() *10);
let comp2 = Math.round(Math.random() *10);
console.log("los numeros a comprar son ", comp1, "y", + comp2)
function comparar (num1, num2){
    if(num1>num2){
        console.log ("el numero mayor es ", num1);
    }else{
        console.log("el numero mayor es ", num2);
    }
}
comparar (comp1, comp2);