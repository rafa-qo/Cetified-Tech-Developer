function adicionar(a, b) {
  console.log ("-------------- Teste de Soma / Calculadora --------------")
  return a + b
}

function subtracao(c, d) {
    console.log ("-------------- Teste de Subtração / Calculadora --------------")
    return c - d
}

function multiplicacao(e, f) {
    console.log ("-------------- Teste de Multiplicação / Calculadora --------------")
    return e * f
}

function divisao(g, h) {
    console.log ("-------------- Teste de Divisão / Calculadora --------------")
    return g / h
}



console.log (adicionar (5, 8));
console.log (subtracao (3, 2));
console.log (multiplicacao (8, 3));
console.log (divisao (30, 5));
console.log (divisao (30, 0));

function quadradoDoNumero(x) {
    console.log ("-------------- Teste de Quadrado / Calculadora --------------")
    return x*x;
}

console.log (quadradoDoNumero (3,2));

function mediaDeTresNumeros(a,b,c) {
    console.log ("-------------- Teste de Média / Calculadora --------------")
    let soma2 = adicionar (a,b);
    let soma3 = adicionar (soma2,c);
    return divisao (soma3,3);
}

console.log (mediaDeTresNumeros (3,2,55));

function calculaPorcentagem(a, b) {
    console.log ("-------------- Teste de Porcentagem / Calculadora --------------")
    return multiplicacao(a, divisao(b,100));
}

console.log (calculaPorcentagem (3,2));

function geradorDePorcentagem(a, b) {
    return multiplicacao(divisao(a,b),100); 
}

console.log(geradorDePorcentagem(2,200));