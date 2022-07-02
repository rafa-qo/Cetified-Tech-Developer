
//    1. Capture o nome do usuário a partir do campo `<input name="usuario">`

var usuario = document.querySelector(".c-form__campo");

var button = document.querySelector(".c-form__botao");

//   - 1.1. Armazene esse valor em uma variável;

// var nomeUsuario = usuario[1].value;

if ( usuario == "") {
    button.setAttribute("disabled", "");
    button.classList.toggle("c-form__botao_disabled");
} else {
    button.removeAttribute("disabled");
    button.classList.toggle("c-form__botao_disabled");
};

//    - 2.2. Redirecione o usuário e envie o valor para rota `resultado/` com parametro `nome`.

button.addEventListener ("submit", function(event){


})

/*
    2. Crie um parametro `lang` e defina o valor `br`. 

    3. Capture o valor do parametro `usuario`:

        - 1.1. Se houver o parametro `usuario` apresente o valor no elemento `<h1 class="texto">`

        - 1.2. Caso contrário apresente apenas a saudação. 
        
            Nota: A saudação já esta presente no código HTML.

    4. Armaze as informações no `localStorage` e persista as informações.

    5. BONUS: Armazene as informações de linguagem, presente no parametro `lang`:

        - 4.1. Altere o idioma da saudação

            Exemplo: Olá, Hi, Holá, etc.

            Nota: O intuito é realizar uma prova de conceito, portanto, não se preocupe com a quantidade de idiomas suportados.

*/
