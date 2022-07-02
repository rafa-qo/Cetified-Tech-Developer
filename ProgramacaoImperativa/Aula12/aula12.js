let alicia = [23, 67, 32];
let bob = [12, 67, 43];

let Alicia1 = [34, 56, 78];
let Bob1 = [30, 53, 99];

let Alicia2 = [34, 56, 78];
let Bob2 = [70, 80, 99];

function encontrarGanhador(a, b) {
    let pontosPrimeiroParticipante = 0;
    let pontosSegundoParticipante = 0;

    // console.log(a.length);
    
    for (i=0; i < a.length; i++) {
        // console.log(a[i]);
        // console.log(b[i]);

        if (a[i] > b[i]) {
            pontosPrimeiroParticipante++;
        } else if (a[i] < b[i]){
            pontosSegundoParticipante++;
        }
    }
    
    // console.log(pontosPrimeiroParticipante);
    // console.log(pontosSegundoParticipante);

    if (pontosPrimeiroParticipante > pontosSegundoParticipante) {
        return "Alicia";
    } else if (pontosPrimeiroParticipante < pontosSegundoParticipante) {
        return "Bob";
    } else {
        return "Empate";
    }
};

console.log (encontrarGanhador(Alicia1, Bob1));
console.log (encontrarGanhador(alicia, bob));
console.log (encontrarGanhador(Alicia2, Bob2));
