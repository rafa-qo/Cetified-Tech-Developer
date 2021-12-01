let pares = [2,4,6,8,10,12,14];

let pares2 = pares.map (function (num) {
  return num-1;  
});

console.log(pares2);

let nomes = ["João", "Maria", "Pedro", "Roberta", "Maria"];

let nomes2 = nomes.filter(function(num) {
    return num === "Maria";
    
})

console.log(nomes2);

let idade = [22,34,15,29,12,9];

let maiorIdade = idade.filter(function (num) {
    return num >= 18;
    
});

console.log(maiorIdade);

let letras = ["c","a","s","a"];

let palavra = letras.reduce(function (acumulador, num) {
    return acumulador + num;
    
});

console.log(palavra);


let animais = ["Cabra", "Cavalo", "Onça", "Porco"];

animais.forEach((item) => {
    console.log("O animal é "+item);
});


let numeros = [1,5,9,3,7];

let formatados = numeros.reduce((acumulador, item)=>{
    return acumulador+"-"+item;
});

console.log(formatados);

// Crie uma função que receba um array composto por números e retorna uma nova matriz (array) com todos os valores divididos pela soma de toda a matriz, usando map() e reduce().

let soma = numeros.reduce((acumulador,item)=>{
    return acumulador+item;
});

let matriz = numeros.map((valor,item2)=> {
    return item2 / soma; 
});

console.log(matriz);

// Crie uma função que receba um array de palavras e um número, e que retorna uma matriz (array) com apenas as palavras que têm mais do que uma quantidade de letras maior do que o número informado. (verifique como funciona o método filter ())

let array = ["Maria", "João", "Pedro"];

let filtro = array.filter((palavras) => {return palavras.length > 4;});

console.log(filtro);

// Crie um array de objetos literais, onde cada objeto será um aluno e terá dois atributos: nome e nota. Crie duas funções que ordenam o array: uma ordenará os alunos em ordem alfabética e a outra o fará por nota, da mais alta para a mais baixa. (Analise qual método seria apropriado para este caso. Recomendamos que você consulte a documentação do MDN: https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Array)

let meusAlunos = [
    {
        Nome: 'Maria',
        Nota: 10
    },

    {
        Nome: 'Alberto',
        Nota: 8
    },

    {
        Nome: 'Pedro',
        Nota: 6.5
    }
];

// console.log(meusAlunos);

let ordemAlfabetica = meusAlunos.sort((a,b)=>{return a.Nome - b.Nome});

// let ordemNota = meusAlunos.sort((a,b)=>{return a.Nota - b.Nota});

console.log(ordemAlfabetica);
// console.log(ordemNota);