// function teste(nome) {
//     if (nome === "Rafael") {
//         return "meu nome é Rafael";
//     };
//     if (nome === "Pedro") {
//         return "Meu nome é Pedro";
//     }
// };

// console.log (teste("João"));

// let frutasAmarelas = ['Melão', 'Mamão', 'Limão Siciliano'];
// let frutasVermelhas = ['Morango', 'Cereja','Maçã red'];
// let frutasVerdes = ['Limão', 'Kiwi', 'Maçã Verde'];

// frutasVermelhas1 = frutasVermelhas.map(fruta => fruta.toUpperCase());
// let todasFrutas = [...frutasVermelhas1, ...frutasAmarelas, ...frutasVerdes];

// console.log (todasFrutas);

// let numeros= [10, 8, 7, 99, 0, 1, 6];

// console.log (numeros.sort(function(a,b){ return b-a;}));

// for (i = 0; i < 50; i+=10) {
//     console.log(i);
    
// }
// console.log(i);

// let x=5;
// let y = x++ + ++x;

// console.log("y = "+ y);

// x=3;
// y=x*(x+1)*x++;
// x=5;
// y=3;
// y*=x+1;
// console.log("x = "+ x);
// console.log("y = "+ y);

// let x=50;
// let resto=50%2;
// console.log(resto);
// resposta = resto==0 ? 'Par':'Impar';
// console.log(resposta);

// let frutasAmarelas = ['Melão', 'Mamão', 'Limão'];
// let [fruta1, fruta2, fruta3] = frutasAmarelas;

// console.log(fruta1);
// console.log(fruta2);
// console.log(fruta3);
// console.log(frutasAmarelas);

// var z=0;
// for (var i = 0; i < 50; i+=10) {
//     z+=i;
// }

// console.log(z);

// let valor =5;
// let fatorial=1;
// for (let i=valor; i>1; i--) {
//     fatorial*=i;
// }

// console.log("Fatorial = "+fatorial);

// let valor =5;
// let fatorial=1;
// for (let i=valor; i>1; i--) {
//     fatorial*=i;
// }

// console.log("Fatorial = "+fatorial);

function soma(a=1, b=3) {
    return a+b;
}

console.log(soma());
console.log(soma(3));
console.log(soma(1,2));
