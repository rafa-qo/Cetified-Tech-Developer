import App2 from "./App2";
import "./style.css";

function App() {
  return <>
    <h1>Hello World</h1>
    <h2 className="subtitle">Meu conteúdo</h2>
    <p>Texto 2</p>
    <button onClick={()=>alert('ok')}>Pressione</button>

    <App2 />
  </>
}

export default App;
