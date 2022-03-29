


// Capturar o form
var formulario = document.forms['formularioDeCadastro'];

// Capturar o Array
var listaTarefas = [];


function listarTodasTarefas() {

    // Capturar a lista onde vão ser criadas as tarefas
    var lista = document.querySelector(".c-lista");

    // Para não zerar a lista toda vez
    lista.innerHTML = "";


    // Mapear as tarefas que vão ser criadas
    listaTarefas.map(tarefas => {

        // Criar um novo <li> no HTML
        var novoItem = document.createElement("li");

        // Criar o texto do <li>
        var novoItemTexto = document.createTextNode(tarefas);

        // Append dos elementos na lista
        novoItem.appendChild(novoItemTexto);
        lista.appendChild(novoItem);
        


    });

    addNoLocalStorage(listaTarefas);

}

function adicionarTarefas(descTarefa) {

    listaTarefas.push(descTarefa);
    
}

function addNoLocalStorage(listaTarefas) {

    localStorage.setItem("Lista", listaTarefas);
    
};

// Captura o evento de envio do form
formulario.addEventListener('submit', function(evento) {
    
    // Previne de atualizar a página
    evento.preventDefault();

    // Capturar a descrição da Tarefa
    var descTarefa = evento.target['item'].value.trim();

    adicionarTarefas(descTarefa);

    listarTodasTarefas();
    
    // 1. Crie um objeto literal para armazenar os itens considerando as propriedades: id, tarefa, autor.
    
    // 2. Converta o objeto literal em um json.

    // 3. Armazene o json no localStorage ou sessionStorage.

});


