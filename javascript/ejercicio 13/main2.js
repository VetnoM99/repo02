
const emoticon = [",🌭",",🍋",",👋",",🧀",",🌭",",🍟",",🥜",",🍣",",❗",",🔎",",🍚",",🍄"];
const contenedor = document.getElementById("emoticons");
function meter (clave){
    let randomEmoticon = emoticon[Math.floor(Math.random() * emoticon.length)];
    const span = document.createElement("span");
    span.textContent = randomEmoticon;
    span.classList.add("emoticon", "slide-in");
if(clave === 'push'){
    contenedor.appendChild(span);
}else if(clave === "unshift"){
    contenedor.insertBefore(span,contenedor.firstChild)
}else if(clave === "insert"){
  let spaces = document.getElementById("spaces").value;
  let flag = document.getElementById("spaces").checkValidity() === false;
  if(flag == false){
let index = Math.min(contenedor.children.length, Math.max(0, parseInt(spaces)));
    contenedor.insertBefore(span, contenedor.children[index]);
  }else{
    alert("Para poder user insert tiene que indicar un numero en el campo espacios")
    return;
  }
};
};
function quitar(clave) {
   
    if(clave === 'pop'){
       let borrado = contenedor.lastChild;
        borrado.classList.add("slide-out")
        setTimeout(() => {
            contenedor.removeChild(borrado);
          }, 300);
    }else if(clave === "shift"){
        let borrado = contenedor.firstChild;
        borrado.classList.add("slide-out")
        setTimeout(() => {
            contenedor.removeChild(borrado);
          }, 300);
    }else if(clave === "removeAt"){
      let spaces = document.getElementById("spaces").value;
      let index = Math.min(contenedor.children.length, Math.max(0, parseInt(spaces)));
      let flag = document.getElementById("spaces").checkValidity() === false;
      if (flag=== false) {
        let borrado = contenedor.children[index];
        borrado.classList.add("slide-out");
        setTimeout(() => {
          contenedor.removeChild(borrado);
        }, 300);
      }else{
        alert("por favor introduzca un numero para poder utilizar remove at");
        return;
      }
  
  }else if(clave ==="random"){
   let borrado = contenedor.children[Math.floor(Math.random() * contenedor.children.length)]
   borrado.classList.add("slide-out");
   setTimeout(() => {
     contenedor.removeChild(borrado);
   }, 500);
  }
}
function quitartodo() {
  const borrado = contenedor.children;
  
  for (let i = 0; i < borrado.length; i++) {
    borrado[i].classList.add("slide-out");
  }

  setTimeout(() => {
    contenedor.innerHTML = "";
  }, 500);
}