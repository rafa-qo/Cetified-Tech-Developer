let bemVindo = () => 'Olá Mundo!';

console.log (bemVindo());

let dobro = numero => numero*2;

console.log (dobro(2));

// let soma = (a,b) => a + b;

// console.log(soma(5,8));

let horaAtual = () => {

    let data = new Date();
    return data.getHours() + ':' + data.getMinutes();
}

console.log(horaAtual());


// function print(mensagem){
//     console.log(mensagem)
//   }

let print = mensagem => "Olá, bom dia!";
   
console.log (print());
   
//   function soma(n1, n2){
//     return n1 + n2
//   }

let soma = (n1,n2) => n1 + n2;

console.log (soma(5,4));
   
console.log(soma(10, 10));


// Treinando Callback

let andar = () => "O carro está andando!";

let parar = () => "O carro está parado!";

let acaoCarro = (callback) => {
    return callback();
}
   
console.log(acaoCarro(andar));
console.log(acaoCarro(parar));

setTimeout(function () {
    console.log('Olá, mundo!')},
    1000);