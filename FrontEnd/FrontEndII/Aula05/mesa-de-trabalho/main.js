// Nomes: 
// Rafael Queiroz
// Rafael Vasconcelos
// Lucas Ferreira Nogueira
// Dario Olah
// Felipe Lopes


//1
let section = document.getElementById("carrinho");

//2
let lista = document.createElement("ul");
lista.classList.add("lista");

//3
section.appendChild(lista);

//4
let listaItem1 = document.createElement("li");
let listaItem2 = document.createElement("li");
let listaItem3 = document.createElement("li");
let listaItem4 = document.createElement("li");
let listaItem5 = document.createElement("li");

//5
listaItem1.classList.add("lista__item");
listaItem2.classList.add("lista__item");
listaItem3.classList.add("lista__item");
listaItem4.classList.add("lista__item");
listaItem5.classList.add("lista__item");

//6
let listaTexto1 = document.createTextNode("Carro");
let listaTexto2 = document.createTextNode("Bike");
let listaTexto3 = document.createTextNode("Patinete");
let listaTexto4 = document.createTextNode("Celular");
let listaTexto5 = document.createTextNode("Carregador");

//7
lista.appendChild(listaItem1);
lista.appendChild(listaItem2);
lista.appendChild(listaItem3);
lista.appendChild(listaItem4);
lista.appendChild(listaItem5);


//7
listaItem1.appendChild(listaTexto1);
listaItem2.appendChild(listaTexto2);
listaItem3.appendChild(listaTexto3);
listaItem4.appendChild(listaTexto4);
listaItem5.appendChild(listaTexto5);