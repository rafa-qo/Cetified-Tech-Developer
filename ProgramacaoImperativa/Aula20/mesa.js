// Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e a sua opinião em relação ao filme: ótimo - 3, bom - 2, regular -1.
// Faça um programa que receba a idade e a opinião de 15 espectadores, calcule e imprima:

let espectadores = [
    { idade: 18, opiniao: 2 },
    { idade: 19, opiniao: 2 },
    { idade: 20, opiniao: 3 },
    { idade: 21, opiniao: 2 },
    { idade: 41, opiniao: 3 },
    { idade: 23, opiniao: 1 },
    { idade: 24, opiniao: 1 },
    { idade: 25, opiniao: 3 },
    { idade: 26, opiniao: 2 },
    { idade: 17, opiniao: 1 },
    { idade: 28, opiniao: 2 },
    { idade: 29, opiniao: 3 },
    { idade: 30, opiniao: 3 },
    { idade: 40, opiniao: 1 },
    { idade: 32, opiniao: 2 }
];


// - a média das idades das pessoas que responderam ótimo;

let medOtimo = (med) => {
    let filtro = espectadores.filter(opiniao => {
        return opiniao.opiniao === 3;
    }); 
    
    let soma = filtro.reduce(function(acumulador, item){
        // console.log("acumulador", acumulador.altura);
        // console.log ("item", item.altura);
        return acumulador + item.idade;
    },0);

    let totalOtimo = filtro.length;

    let final = soma / totalOtimo;

    return "A média de idade das pessoas que votaram ÓTIMO é: " + final;
};

console.log (medOtimo(espectadores));

// - a quantidade de pessoas que responderam regular;
let medReg = (med2) => 
{
    let filtroReg = espectadores.filter((espectador) => {
        return espectador.opiniao === 1;
    });
    // return filtroReg;

    let totalReg = filtroReg.length;

    return "O total de pessoas que votaram REGULAR é: " + totalReg;
};

console.log(medReg(espectadores));

// - a porcentagem de pessoas que responderam bom entre todos os espectadores analisados.
let porcReg = (porcBom) => 
{
    let filtroBom = espectadores.filter((espectador) => {
        return espectador.opiniao === 2;
    });
    // return filtroReg;

    let totalBOM = filtroBom.length;

    let totalEspec = espectadores.length;

    return "O percentual de pessoas que votaram BOM é: " + (totalBOM/totalEspec)*100 + "%";
};

console.log(porcReg(espectadores));