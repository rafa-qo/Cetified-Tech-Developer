let peliculas = ["star wars", "totoro", "rocky", "pulp fiction", "la vida es bella"]
let animacoes = ["toy story", "nemo", "como treinar seu dragão", "meu malvado favorito"]

for (let i=0; i<=4; i++) {    
    console.log (peliculas[i].toUpperCase());
}

function passagemFilmes(peliculas, animacoes) {
    let limit = animacoes.length
    for (let i=0; i < limit; i++) {
        peliculas.push(animacoes.pop().toUpperCase());
    }

    return peliculas;
}

console.log(passagemFilmes(peliculas, animacoes));


