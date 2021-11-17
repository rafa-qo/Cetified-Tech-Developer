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

