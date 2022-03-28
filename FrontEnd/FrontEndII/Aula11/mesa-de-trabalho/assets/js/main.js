let formulario = document.getElementById('formularioDeCadastro');
let listaDados = document.getElementById('listaItems');

function createLiElement(conteudo){
    let liElement =  document.createElement('li');
    liElement.classList.add('c-lista__item');

    let contentLi = document.createTextNode(conteudo);
    liElement.appendChild(contentLi);

    listaDados.appendChild(liElement);
}

formulario.addEventListener('submit', (e) => {
    e.preventDefault();

    let textoNaoTratado = e.target['item'].value;
    if(verificaCaracteresEspeciais(textoNaoTratado)){
        alert('Não é permitido o uso de caracteres especiais em sua lista.')
    }
    else{
        let textoTratado = textoNaoTratado.replace(" ", '');
        textoTratado = textoTratado.replace(/\d/g, '');
        createLiElement(textoTratado);
    
        e.target['item'].value="";
    }  
})

//  Aula 11

let botaoSubmit = document.getElementById('botaoSubmit');
let campoFormulario = document.getElementById('campoItem');

console.log(campoFormulario)

function verificaCaracteresEspeciais(texto){
    let regex = /\W/g
    let validaCaracteresEspeciais = regex.test(texto)
    console.log(validaCaracteresEspeciais)
    return validaCaracteresEspeciais
}

function verificaCampoVazio(texto){
    let respostaCampoVazio = texto === ""
    console.log("campo vazio: "+respostaCampoVazio)
    
    return respostaCampoVazio;
}

campoFormulario.addEventListener('blur', (e) => {
    let conteudoCampo = e.target.value
    console.log("conteudo do campo: "+conteudoCampo)
    if(verificaCampoVazio(conteudoCampo)){
        botaoSubmit.disabled = true
    }else{
        botaoSubmit.disabled = false
    }
    verificaCaracteresEspeciais(conteudoCampo)
})
