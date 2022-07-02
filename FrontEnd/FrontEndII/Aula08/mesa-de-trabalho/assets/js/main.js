// Utilize esse documento para implementar seu algorítimo...

let iniciarJogo = document.body;

let selecionaTelaInicial = document.getElementById("telaInicial");

iniciarJogo.addEventListener("keydown", function(event) {
    if (event.key == " "){
        selecionaTelaInicial.remove();
    } else if (event.key == "Escape"){
        document.location.reload(true);
    };
});


let selecao1 = document.getElementById("linha-1_coluna-1");
let selecao2 = document.getElementById("linha-1_coluna-2");
let selecao3 = document.getElementById("linha-1_coluna-3");
let selecao4 = document.getElementById("linha-2_coluna-1");
let selecao5 = document.getElementById("linha-2_coluna-2");
let selecao6 = document.getElementById("linha-2_coluna-3");
let selecao7 = document.getElementById("linha-3_coluna-1");
let selecao8 = document.getElementById("linha-3_coluna-2");
let selecao9 = document.getElementById("linha-3_coluna-3");

selecao1.addEventListener("click", function(event){
    event.target.innerText = "X";
});

selecao1.addEventListener("dblclick", function(event){
    event.target.innerText = "O";
});

selecao2.addEventListener("click", function(event){
    event.target.innerText = "X";
});

selecao2.addEventListener("dblclick", function(event){
    event.target.innerText = "O";
});

selecao3.addEventListener("click", function(event){
    event.target.innerText = "X";
});

selecao3.addEventListener("dblclick", function(event){
    event.target.innerText = "O";
});

selecao4.addEventListener("click", function(event){
    event.target.innerText = "X";
});

selecao4.addEventListener("dblclick", function(event){
    event.target.innerText = "O";
});

selecao5.addEventListener("click", function(event){
    event.target.innerText = "X";
});

selecao5.addEventListener("dblclick", function(event){
    event.target.innerText = "O";
});

selecao6.addEventListener("click", function(event){
    event.target.innerText = "X";
});

selecao6.addEventListener("dblclick", function(event){
    event.target.innerText = "O";
});

selecao7.addEventListener("click", function(event){
    event.target.innerText = "X";
});

selecao7.addEventListener("dblclick", function(event){
    event.target.innerText = "O";
});

selecao8.addEventListener("click", function(event){
    event.target.innerText = "X";
});

selecao8.addEventListener("dblclick", function(event){
    event.target.innerText = "O";
});

selecao9.addEventListener("click", function(event){
    event.target.innerText = "X";
});

selecao9.addEventListener("dblclick", function(event){
    event.target.innerText = "O";
});


