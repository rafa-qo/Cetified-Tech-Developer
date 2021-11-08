let status = 10 < 15;

if (status){
    console.log(' O valor é true - verdadeiro');
} else {
    console.log('O valor é false - falso');
}

let linguagem = "javascript";

if (linguagem == "javascript") {
    console.log ("Estou aprendendo");
} else {
    console.log ("Aprenderei mais tarde");
}


// Mesa de trabalho

function podeSubir(altura, acompanhada) {
    let resposta = true;

    if (altura >= 1.4 && altura <2.0){
        console.log ("Acesso Autorizado");
        resposta = true;
    } else if ((altura < 1.4 && altura > 1.2) && acompanhada == true){
        console.log ("Acesso autorizado somente com acompanhante")
        resposta = true;
    } else {
        console.log ("Acesso negado");
        resposta = false;
    }
}

podeSubir (1.3,true);