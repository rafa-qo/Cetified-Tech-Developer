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

// console.log(criaArray(10));

// Novo Array
// Você deve criar uma função chamada newArray que receba um número como parâmetro e retorne um novo array com a quantidade de elementos equivalente ao valor do número que você passou por parâmetro.

let newArray = (c) => {
    let array = [];
    let qtd = c;

    for (let i = 0; i <= qtd; i++) {
        array.push(i);
    };
    console.log(array);
};

// newArray(5);

// String.split()
// Você deve criar uma função chamada split que receba uma string e simule o comportamento da função split original. Se você não sabe como funciona, o Google pode ajudá-lo.
// Importante: Você não pode usar o String.split()
let split = (p) =>
{
    let palavra = [];
    for (let i = 0; i < p.length; i++) {
        palavra[i] = p[i];
    }
    return palavra;
}

// console.log(split("Rafael"));

// Você deve criar uma função chamada moverZeros que receba um array como parâmetro e retorne outro com os números 0 ordenados ao final.
let teste = [false,1,0,1,2,0,1,3,"a"]

let moverZeros = (m) =>
{
    let novoArray = m.filter((m) => {
        return m !== 0;
    });

    m.forEach(valor => {
        if (valor == 0) {
            novoArray.push(valor);
        }  
    });
    return novoArray;

};

// console.log(moverZeros(teste));

// Você deve criar uma função chamada arrayHandler que receba dois arrays de igual tamanho como parâmetros e exiba no console: "Eu sou {elemento do array 1} e eu sou {elemento do array 2}".
// Exemplo:
// arrayHandler([1,2,3], [“o”,”l”,”á”]) deve mostrar: 
// 		Eu sou 1 e eu sou o
// Eu sou 2 e eu sou l
// Eu sou 3 e eu sou á

function arrayHandler(x, y) {
    for (let i = 0; i < x.length; i++) {
        console.log("Eu sou " + x[i] + " e eu sou " + y[i]);
    }
}

// arrayHandler([1,2,3], ['o','l','á']);


// Você deve criar uma função chamada arrayObjects que receba um número como parâmetro e retorne um array de objetos que tem uma propriedade chamada valor que contém o valor do número e seus anteriores.
// Exemplo:
// arrayObjects(5) deve retornar [{valor: 1}, {valor: 2}, {valor: 3}, {valor: 4}, {valor: 5}]
// arrayObjects(3) deve retornar [{valor: 1}, {valor: 2}, {valor: 3}]

let arrayObjects = (num) => 
{
    let array = [];
    for (let i = 0; i < num; i++) {
        array.push({valor:[i]});
    }
    return array;
}

// console.log(arrayObjects(5));

// Arrays de objetos 2
// Você deve criar uma função chamada arrayObjectsTwo que recebe um número e uma palavra como parâmetro e retorna um array de objetos que possui: uma propriedade nomeada pela palavra passada por parâmetro e o valor dessa propriedade deve ser o número passado por parâmetro e seus anteriores.

// Exemplo:
// arrayObjectsTwo(5, “olá”) deve retornar [{olá: 1}, {olá: 2}, {olá: 3}, {olá: 4}, {olá: 5 }]
// arrayObjectsTwo(3, “tchau”) deve retornar [{tchau: 1}, {tchau: 2}, {tchau: 3}]

let arrayObjectsTwo = (num2, p) => 
{
    let array2 = [];
    for (let i = 0; i < num2; i++) {
        array2.push({[p]:[i]});
    }
    return array2;
}

// console.log(arrayObjectsTwo(5, "teste"));