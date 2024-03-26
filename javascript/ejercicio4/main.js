 let resultado;
 let num = 0;
 num = Math.round(Math.random());
 console.log("el numero aleatorio es =",num);
 
function A (num, resultado){
    if(num == 0){
        resultado = 1;
        console.log("devuelve",resultado);
    }else{
        resultado = "X";
        console.log("devulve",resultado);
    }
return (resultado);
 }
A (num, resultado)