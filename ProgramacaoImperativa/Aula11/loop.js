// let peliculas = ["star wars", "totoro", "rocky", "pulp fiction", "la vida es bella"]
// let animacoes = ["Toy Story", "Procurando Nemo", "Kung-fu Panda", "Wally", "Fortnite"]

// function converterMaiuscula(array) {
//     for (let i=0; i < array.length; i++) {

//         array[i] = array[i].toUpperCase()
    
//     }

//     return array;
// }

// console.log (converterMaiuscula(peliculas));


// function passagemFilmes(peliculas, animacoes) {
//     let limit = animacoes.length
//     for (let i=0; i < limit; i++) {
//         peliculas.push(animacoes.pop().toUpperCase());
//     }

//     return peliculas;
// }

// console.log(passagemFilmes(peliculas, animacoes));

let peliculas = ["star wars", "totoro", "rocky", "pulp fiction", "la vida es bella"]
let animacoes = ["Toy Story", "Procurando Nemo", "Kung-fu Panda", "Wally", "Fortnite"]

function passagemElementos(array1, array2) {
    let invalido = array2.pop();
    let qtd = array2.length;

    for (let i=0; i < qtd; i++) {
        array2.push(array1.pop().toUpperCase());
    }

    console.log ("Esse filme é inválido:", invalido);
    return array1
    
}

console.log (passagemElementos (peliculas, animacoes));

const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];

function compararClassificacao(asia, europa) {
    let comparaAsiaEuropa = [];

    comparaAsiaEuropa[0]= asia[0] === europa[0];
    comparaAsiaEuropa[1]= asia[1] === europa[1];
    comparaAsiaEuropa[2]= asia[2] === europa[2];
    comparaAsiaEuropa[3]= asia[3] === europa[3];

}

console.log (compararClassificacao(asiaScores, euroScores));