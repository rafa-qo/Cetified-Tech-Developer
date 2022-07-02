//Parte I
// 1. Criar um elemento (tag html)
let botao = document.createElement("a");

// 2. Criar um texto
let botaoTexto = document.createTextNode("Ir para o Google");

// 3. Adicionar o texto no elemento
botao.appendChild(botaoTexto);

// 4. Adicionar o elemento no documento
document.body.appendChild(botao);

//Parte II
// 5. Adicionar atributos e definir seus valores
botao.setAttribute("href", "https://www.google.com");

// 6. Revisar como adicionar estilos
botao.classList.add("botao");