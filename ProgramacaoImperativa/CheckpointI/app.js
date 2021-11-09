/* Pratos
Pipoca: 1
Macarrão: 2
Carne: 3
Feijão: 4
Brigadeiro: 5 */


function microondas(prato, tempo) {
    switch (prato){
        case 1:
            if (tempo >19 && tempo < 30){
                console.log ("Pipoca Queimou");
            } else if (tempo <10){
                console.log ("Tempo Insuficiente para Pipoca")
            } else if (tempo >= 30) {
                console.log ("Pipoca fez Kabumm!!");
            } else {
                console.log("Pipoca pronta, bom apetite!!!")
            }
        break;
        case 2:
            if (tempo > 15 && tempo < 24){
                console.log ("Macarrão Queimou");
            } else if (tempo <8){
                console.log ("Tempo Insuficiente para Macarrão")
            } else if (tempo >= 24) {
                console.log ("Macarrão fez Kabumm!!");
            } else {
                console.log("Macarrão pronto, bom apetite!!!")
            }
        break;
        case 3:
            if (tempo >29 && tempo < 45){
                console.log ("Carne Queimou");
            } else if (tempo <15){
                console.log ("Tempo Insuficiente para Carne")
            } else if (tempo >= 45) {
                console.log ("Carne fez Kabumm!!");
            } else {
                console.log("Carne pronta, bom apetite!!!")
            }
        break;
        case 4:
            if (tempo >23 && tempo < 36){
                console.log ("Feijão Queimou");
            } else if (tempo <12){
                console.log ("Tempo Insuficiente para Feijão")
            } else if (tempo >= 36) {
                console.log ("Feijão fez Kabumm!!");
            } else {
                console.log("Feijão pronto, bom apetite!!!")
            }
        break;
        case 5:
            if (tempo > 15 && tempo < 24){
                console.log ("Brigadeiro Queimou");
            } else if (tempo <8){
                console.log ("Tempo Insuficiente para Brigadeiro")
            } else if (tempo >= 24) {
                console.log ("Brigadeiro fez Kabumm!!");
            } else {
                console.log("Brigadeiro pronto, bom apetite!!!")
            }
        break;
        default: 
            console.log ("Prato Inexistente");
    }
}

microondas(1, 20);
microondas(1, 30);
microondas(1, 9);
microondas(1, 10);
microondas(2, 16);
microondas(2, 5);
microondas(2, 25);
microondas(2, 10);
microondas(3, 30);
microondas(3, 46);
microondas(3, 14);
microondas(3, 15);
microondas(4, 24);
microondas(4, 36);
microondas(4, 11);
microondas(4, 12);