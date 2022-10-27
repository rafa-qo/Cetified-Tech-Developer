/* MATERIAIS DE APOIO:
  -> https://pt-br.reactjs.org/docs/add-react-to-a-website.html
  -> https://malcolmkee.com/intro-to-react-js/vanilla-react/
*/

//Buscando o contêiner root do HTML
const root = document.getElementById('root');

//// Sem utilizar JSX para criar componentes

//Criando novo componente que representa uma DIV
function App() {
  return React.createElement(
    'div', null, 'Hello World!'
  );
}

//// Utilizando JSX para criar componentes
function ComponenteJSX() {
  return <div>
    Hello World!
  </div>

}

const main = React.createElement(App);
//Retirar comentário para exibir o componente JSX
//const main = React.createElement(ComponenteJSX);
ReactDOM.render(main, root);