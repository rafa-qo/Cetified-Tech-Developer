// 1. Selecione o formulário
var selectForm = document.getElementById("formularioDeCadastro");
var selectCampo = document.querySelector(".c-form__campo")
var selectButton = document.querySelector(".c-form__botao")

selectButton.addEventListener("click", function(evento){
    var selectCampoValue = selectCampo.value.trim();

    // 2.2. Valide se existem caracteres especiais
    // if (verificaCampoVazio(selectCampoValue)){
    //     selectButton.innerHTML = "<button class="c-form__botao u-my" type="button">Adicionar item</button>";
    // };
    
    if (verificaCaracterEsp(selectCampoValue)) {
        alert("Esse campo não aceita caracteres especiais.");
    };


})

// Funções
function verificaCaracterEsp(valor) {
    var valorVerificado = /\W/g.test(valor);
     return valorVerificado;
};

function verificaCampoVazio(valor) {
    var valorVerificado = valor === "";
    return valorVerificado;
}




/* 


        - 2.3. Caso passe na validacão, apresente o item no elemento DOM `<li class="c-lista__item">`.

    

        - 2.2. Valide se existem caracteres especiais 

            - Se o campo possuir caracteres especiais, apresente a seguinte mensagem no console do navegador `"Não é permitido o uso de caracteres especiais em sua lista."`.
*/