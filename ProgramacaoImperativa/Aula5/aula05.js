let conversao = function (pol) {
    console.log(pol * 2.5 +' cm');
}

conversao(3);

let convertURL = function (name){
    console.log ('http://www.'+name+'.com.br');
}

convertURL('instagram');
let exclamacao = function(frase){
    console.log(frase+'!');
}

exclamacao ('Isso é um teste');

function IdadeCachorro(cachorro) {
    cachorro*7;
    console.log(cachorro*7);
}

IdadeCachorro(7);

let horaTrabalho = function (salario) {
    hora = salario/160;
    console.log('R$'+hora+'/h');
}

horaTrabalho (1000);

let IMC = function (altura, peso) {
    let calculo = peso/((altura/100)*(altura/100));
    let arredondar = Math.round (calculo);
    console.log(arredondar);
}

IMC(178,86);

let toUpperCase = function (frase) {
    console.log (frase.toUpperCase());
}

toUpperCase('Teste de frase para converter');

let tipo = function (objeto) {
    console.log (typeof objeto);
}

tipo(5);
tipo('teste de frase');
tipo(2+2);

let circunferencia = function (raio) {
    let formula = 2 * Math.PI * raio;
    Math.round(formula);
}

circunferencia(4);