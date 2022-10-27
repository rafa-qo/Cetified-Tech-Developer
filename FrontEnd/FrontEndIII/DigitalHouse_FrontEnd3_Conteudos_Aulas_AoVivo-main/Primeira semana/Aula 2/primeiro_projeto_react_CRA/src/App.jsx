/* Criando um objeto JS */
let professor = {
  nome: "Nome do Professor",
}

/* Criando componente do tipo funcional - Usando JSX */
function App() {
  return (
    <div>
      <h1>Bem-vindo(a) ao front end 3</h1>
      <h3>Olá, meu nome é {professor.nome}.</h3>
    </div>
  );
}

/* Exportando o componente para que possa ser acessado por "index.js" */
export default App;