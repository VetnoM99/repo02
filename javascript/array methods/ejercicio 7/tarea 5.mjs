import { foods } from "./foods.mjs"
const ticket = ["🥜", '🌮', '🥗', '🍕', '🍣', '🧀'];
// Expected output: Total of the ticket: ["🥜","🌮","🥗","🍕","🍣","🧀"] is $52.48 

  const sumaTotal = ticket.reduce((total, item) => {
    const alimento = foods.find(food => food.icon == item);
    console.log(alimento);
    return total + (alimento ? alimento.price:0);
  }, 0).toFixed(2);

console.log(sumaTotal)