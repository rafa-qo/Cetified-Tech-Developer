// Alerta na abertura da página;
// window.onload = function criarUmAlerta() {
//     alert("Página Carregada...");
//     return criarUmAlerta;
// };

let documento = document.body;

let formSelector = document.getElementById("form1");

// Botão Enviar
let botao = document.createElement("button");

let botaoTexto = document.createTextNode("Enviar");

botao.appendChild(botaoTexto);

formSelector.appendChild(botao);


// Botão Reset
let botaoReset = document.createElement("button");

let botaoResetTexto = document.createTextNode("Limpar");

botaoReset.appendChild(botaoResetTexto);

formSelector.appendChild(botaoReset);


let textoCor = document.querySelectorAll("#form1");

textoCor.onmouseover = function() {
    this.classList.toggle("red");
};
