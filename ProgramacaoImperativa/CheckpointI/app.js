/* Pratos
Pipoca: 1
Macarrão: 2
Carne: 3
Feijão: 4
Brigadeiro: 5 */


/* function microondas(prato, tempo) {
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
microondas(4, 12); */


/* Opção 2

- Precisamos desenvolver um menu para um microondas super veloz, onde teremos 5 opções de comida com seus respectivos tempos pré-definidos. 

      1 - Pipoca – 10 segundos (padrão);
      2 - Macarrão – 8 segundos (padrão);
      3 - Carne – 15 segundos (padrão);
      4 - Feijão – 12 segundos (padrão);
      5 - Brigadeiro – 8 segundos (padrão); 

- O usuário poderá alterar o tempo padrão, aumentando ou diminuindo de acordo com sua vontade. Se o tempo informado for maior que 2x o necessário, exibir mensagem que a comida queimou.
- Se o tempo for menor que o padrão, exibir a mensagem: "tempo insuficiente"; 
- Opções não listadas no menu, devem exibir uma mensagem de erro: "Prato inexistente";
- Se o tempo for 3x maior que o necessário para o prato, o microondas deve exibir a mensagem: “kabumm”;
- No final de cada tarefa, o microondas deverá exibir a mensagem: "Prato pronto, bom apetite!!!". */

function microondas(prato, tempo) {
    let tempoPadrao = 0;

    if (prato == 1) {
        tempoPadrao == 10;
    } else if (prato == 2) {
        tempoPadrao == 8;
    } else if (prato == 3){
        tempoPadrao == 15;
    } else if (prato == 4){
        tempoPadrao == 12;
    } else if (prato == 5){
        tempoPadrao == 8;
    } else {
        return "Prato inexistente";
    }
    return verificaTempo(tempoPadrao, tempo);
}

function verificaTempo(tempoPadrao, tempoInput) {

    if ((tempoInput >= tempoPadrao * 2) && (tempoInput < tempoPadrao * 3)){
        return "Seu prato queimou";
    } else if (tempoInput < tempoPadrao){
        return "Tempo insuficiente";
    } else if (tempoInput >= tempoPadrao*3){
        return "KABUMMM!!";
    } else {
        return "Seu prato está pronto. Bom apetite!";
    }
}


console.log(microondas(1,30))