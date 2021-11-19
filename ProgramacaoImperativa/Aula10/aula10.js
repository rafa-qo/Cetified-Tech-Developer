// Exercício 1

let numbers = [22, 33, 54, 66, 72];

console.log(numbers[numbers.length]); // Desse jeito não retornou nada, deu erro. 

console.log (numbers.length); // Fiz desse jeito para que ele retornasse o número de elementos na array.

let grupoDeAmigos = [ ["Harry", "Ron", "Hermione"], ["Spiderman", "Hulk",
"Ironman"], ["Penélope Glamour", "Pierre Nodoyuna","Patán"] ];

console.log(grupoDeAmigos[1][0]); // Ele procura primeiro a sub-array (a segunda, no caso), e depois procura o elemento 0 dentro da sub-array 1.

let str = "uma string qualquer";

let grupoDeAmigos2 = [[45, 89, 0], ["Digital", "House", true], ["string","123","false", 54, true, str]];

console.log(grupoDeAmigos2[2][grupoDeAmigos2[2].length - 1]); //Ele mostrou o sub-array na posição 2 e o elemento na posição 5 dentro desse sub-array.

let funcao = ["Array 1", "Array 2", "Array 3", "Array 4"];

function imprimirInverso () {
    return funcao[funcao.length - 1] + ", " + funcao[funcao.length - 2] + ", " + funcao[funcao.length - 3] + ", " + funcao[funcao.length - 4];
};

console.log (imprimirInverso());

function inverter(array) {
    return array = funcao.slice(array).reverse();
}

console.log(inverter(2));

let soma = [2,6,8,93,4];
let soma2 = [10,3,10,4];
// let soma3 =[10,3,10,4]


function somarArray(array) {
    let total = 0;

    for (i = 0; i < array.length; i++) {
    total += array[i];
    }
    return total;
}

console.log (somarArray(soma));
console.log (somarArray(soma2));

let filmes = ["star wars", "matrix", "mr. robot", "o preço do amanhã", "a vida é bela"];

console.log(filmes[2]);

function upperCase (array) {
    array[0] = array[0].toUpperCase();
    array[1] = array[1].toUpperCase();
    array[2] = array[2].toUpperCase();
    array[3] = array[3].toUpperCase();
    array[4] = array[4].toUpperCase();

    return array;
}

console.log(upperCase(filmes));

let animacao = ["Toy Story", "Procurando Nemo", "Kung-fu Panda", "Wally", "Fortnite"]

function juntaTudo (array3, array4) {
    array3.push(array4[0]);
    array3.push(array4[1]);
    array3.push(array4[2]);
    array3.push(array4[3]);
    array3.push(array4[4]);
    return array3;
}

let tudoJunto = juntaTudo(filmes,animacao);
console.log (tudoJunto);

let game = tudoJunto.pop();

console.log(game);
console.log(tudoJunto);

const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];

function comparaNota(asiaScores, euroScores) {
    let resultado = "";
    resultado = [ 
        asiaScores[0] === euroScores[0],
        asiaScores[1] === euroScores[1],
        asiaScores[2] === euroScores[2],
        asiaScores[3] === euroScores[3],
        asiaScores[4] === euroScores[4],
        asiaScores[5] === euroScores[5],
        asiaScores[6] === euroScores[6],
        asiaScores[7] === euroScores[7],
        asiaScores[8] === euroScores[8] ];
    return resultado;
}

console.log(comparaNota(asiaScores,euroScores));
