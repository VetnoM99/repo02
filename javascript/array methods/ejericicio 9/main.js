const tickets = [1, 100000, 21, 30, 4]

// console.log (tickets.sort((a, b) => a - b));
for (let i = 0; i < tickets.length -1; i++){

    for (let j = 0; j < tickets.length - 1 - i; j++) {
    if(tickets[j]> tickets[j+1]){
        let aux = tickets[j];
        tickets[j] = tickets[j+1];
        tickets[j+1] = aux;
    }
}
}
console.log(tickets)