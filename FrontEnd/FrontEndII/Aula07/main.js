// 1. Selecionar elementos HTML
let campo = document.querySelector(".campo");

let botao = document.querySelector(".botao");

// 2. O que fazer com cada elemento - criar funções
function addOuRemoveDisabled() {

    let valorDoCampo = campo.value;
    // console.log(campo.value);

    if (valorDoCampo == "") {
        //Add atributo Disabled
        botao.setAttribute("disabled", true);
        botao.classList.add("grey");
    } else {
        //Add atributo Enabled
        botao.removeAttribute("disabled");
        botao.classList.add("verde");
    }
};

// 3. Determinar os eventos que virão do usuário
campo.addEventListener("change", addOuRemoveDisabled);
