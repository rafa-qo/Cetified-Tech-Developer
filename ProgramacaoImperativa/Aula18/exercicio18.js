// Loop de Pares
// Você deve criar uma função chamada loopDePares que receba um número como parâmetro e faça loops de 0 a 100 mostrando cada número do loop no console.
// Caso o número da iteração somado com o número passado pelo parâmetro seja par, aparecerá no console: "O número x é par"
let loopdePares = (a) => {
    for (let i = 0; i <= 100; i++) {
        if ((i + a) % 2 === 0) {
            console.log("O número "+ i +" é par");
        } else {
        console.log(i);
        }
    }
};

// loopdePares(6);

// Loop ímpares com palavra
// Você deve criar uma função chamada loopDeImpares que receba um número e uma palavra como parâmetro e faça loops de 0 a 100 mostrando cada número do loop no console.
// Agora, modifique o código para que, caso esse número somado com o número passado por parâmetro seja ímpar, mostre a palavra passada por parâmetro no console.
let loopdeImpares = (a, palavra) => {
    for (let i = 0; i <= 100; i++) {
        if ((i + a) % 2 !== 0) {
            console.log("xablau");
        } else {
        console.log(i);
        }
    }
};

// loopdeImpares(6, 'xablau');

// Soma
// 	Você deve criar uma função chamada soma que receba um número como parâmetro e retorne a soma de todos os seus números anteriores, incluindo o número recebido por parâmetro.

let criaArray = (b) => {
    let array = [];
    let qtd = b;

    for (let i = 0; i <= qtd; i++) {
        array.unshift(i);
    };

    let soma = array.reduce(
    function(acumulador, i){
    return acumulador + i;
    });

    return soma;
};

console.log(criaArray(10));