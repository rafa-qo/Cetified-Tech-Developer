import { useState, useRef } from 'react'
import './App.css'

function App() {

  const [nomes, setNomes] = useState([]);
  
  const [valueNome, setValueNome] = useState("");
  const [valueIdade, setValueIdade] = useState("");
  const [valuePokemon, setValuePokemon] = useState("");
  // const [valueInput, setValueInput] = useState("");

  // const [errorInput, setErrorInput] = useState("");

  function handleSubmit(event){

    event.preventDefault();

    if(valueNome.trim()){
      setNomes([...nomes,valueNome, valueIdade, valuePokemon]);
      setErrorInput("");
      setValueIdade("");
      setValuePokemon("");
      setValueInput("");
    } else {
      setErrorInput("Digite um nome no campo!");
    }
  }
  
  return (
    <div>

      {
        nomes.map(
          (item)=>
          (
            <li>{item}</li>
          ) 
        )
      }

      <form onSubmit={handleSubmit}>
        <label>Nome:</label>
        <input value={valueNome} onChange={(event) => setValueNome(event.target.value)} />

        <label>Idade:</label>
        <input value={valueIdade} onChange={(event) => setValueIdade(event.target.value)} />

        <label>Pokemon:</label>
        <input value={valuePokemon} onChange={(event) => setValuePokemon(event.target.value)} />

        <input type="submit" />

      </form>

    </div>
  )
}

export default App
