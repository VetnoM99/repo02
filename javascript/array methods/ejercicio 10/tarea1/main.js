const ticket01 = ['☕', '☕', '☕', '☕'];
const ticket02 = ['☕', '🥖', '☕', '🥯', '🍵', '🥐', '🥪'];

const consulta1 = ticket01.every((element) => element === "☕");

console.log(consulta1);

const consulta2 = ticket02.every((element) => element === "☕");

console.log(consulta2);
