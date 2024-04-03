const ticket02 = ['🍹', '🥖', '☕', '🥯', '🍵', '🥐', '🥪'];
/* Expeted Output:
Person 1 Ticket: [ '☕', '🥐' ]
Person 2 Ticket: [ '🍵', '🥖' ]
Person 3 Ticket: [ '🍹', '🥪' ]
Remaining items in the original ticket: [ '🥯' ]*/

//metodo splice
// const remainingItems = ticket02;
// const person1Ticket = ticket02.splice(2, 1);
// person1Ticket.push(ticket02.find((item) => item = item == "🥐"))
// ticket02.splice(4,1);
// const person2Ticket = ticket02.splice(3, 1);
// person2Ticket.push(ticket02.find((item) => item = item =="🥖"));
// ticket02.splice(1,1);
// const person3Ticket = ticket02.splice(0,1);
// person3Ticket.push(ticket02.find((item)=> item = item === "🥪"));
// ticket02.splice(1,1);

// console.log("Person 1 Ticket:", person1Ticket);
// console.log("Person 2 Ticket:", person2Ticket);
// console.log("Person 3 Ticket:", person3Ticket);
// console.log("Remaining itens inn the original ticket", remainingItems);

// metodo slice
const person1Ticket =[];
const person2Ticket =[];
const person3Ticket =[];
let i = 6; //elementos comparados
ticket02.forEach(element => {

    if(element ==="☕"){
        person1Ticket.push(element);
    }else if(element === "🥐"){
        person1Ticket.push(element);
    }else if(element === "🍵"){
        person2Ticket.push(element)
        
    }else if(element === "🥖"){
        person2Ticket.push(element)
        
        console.log(ticket02);
    }else if(element === "🍹"){
        person3Ticket.push(element);
    }else if(element === "🥪"){
        person3Ticket.push(element)
    }
});


console.log(person1Ticket);
console.log(person2Ticket);
console.log(person3Ticket);
const restante = ticket02.slice(3,4);
console.log(restante)


