// Exercicio 1
let fizzBuzz = (a,b) => {
    for (let i = 0; i < 100; i++) {
        if ((i % a == 0) && (i % b == 0)) {
            console.log ("FizzBuzz");
        } else if (i % a == 0) {
            console.log ("Fizz");
        } else if (i % b == 0) {
            console.log ("Buzz");
        } else {
            console.log(i);
        }               
    }

}

console.log(fizzBuzz(9,3));

// Avançado
let fizzBuzz2 = (a,b,palavra1,palavra2) => {
    for (let i = 0; i < 100; i++) {
        if ((i % a == 0) && (i % b == 0)) {
            console.log (palavra1+palavra2);
        } else if (i % a == 0) {
            console.log (palavra1);
        } else if (i % b == 0) {
            console.log (palavra2);
        } else {
            console.log(i);
        }               
    }

}

let chamaFizzBuzz = (x,y,w,z,funcao) => funcao(x,y,w,z);

chamaFizzBuzz(5,7,"xa","blau", fizzBuzz2);