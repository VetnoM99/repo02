//punto 1
let arr = ["🍔","🍺","🌭","🍕","🥤","🍙","🍚","🍟"]

console.log(arr.fill("🍓",2));
//punto 2
let arr2 = ["🍕,","🍕","🍍","🍕","🍕"];
let encontrado = arr2.some (function (icono){
    return icono == "🍍";
})
console.log(encontrado);

//punto 3
let arr3 = ["🍕,","🍕","🍍","🍕","🍕"];
let eliminado = 2;
arr3.splice(eliminado,1);
console.log(arr3);

//punto 4

let arr4 = ["🍓","🍋","🍓","🍋","🍓"];

arr4.forEach(function(valor, i)
{
    if (valor =="🍓") {
        arr4.splice(i,1,"🍄")
    }
});
console.log(arr4);

//punto 5
let arr5 = ["🌶️","🥛","🌶️","🥛","🌶️"]
for (let i = 0; i < arr5.length; i++){
    if (arr5[i]=== "🌶️") {
        arr5.splice(i + 1,0,"🥵")
        
    }
}
console.log(arr5);
    
//punto 6

let arr6 = ["🎴","🎴","🎴","🎴","🎴","🎴"]

let mitad = Math.floor(arr6.length / 2);
arr6.splice(mitad,0,"🃏");
console.log(arr6);
