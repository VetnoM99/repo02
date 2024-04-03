import { foods } from './foods.mjs';
//tarea 2 y 3
// const comida = [...new Set(foods.map(food => food.category))];
// function existecategoria (categoria) {
//     const categorias = foods.map(item => item.category);
//     return categorias.includes(categoria); 
//   }

//   console.log(existecategoria("Italian"));

//   console.log(existecategoria("Spanish"));

//tarea 4
function filtrado (categoria) {
    const alimentosFiltrados = foods.filter(item => item.category === categoria);
    return alimentosFiltrados.length > 0;
  }
  
  console.log(filtrado('Fast Food'));
  