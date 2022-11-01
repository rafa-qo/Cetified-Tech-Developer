import { useRef, useState } from 'react'
import './App.css'

function App() {

  // const inputRef = useRef(null);

  const [valueInput, setValueInput] = useState("");

  const [errorInput, setErrorInput] = useState("");

  const [isChecked, setIsChecked] = useState(false);

  const [nomes, setNomes] = useState([]);

  function handleSubmit(event){
    // console.log(inputRef.current?.value);

    // alert(inputRef.current?.value);
    if(valueInput.trim()){
      setNomes([...nomes,valueInput]);
      setErrorInput("");
      setValueInput("");

      // alert("Formulário Válido!");
    } else {
      setErrorInput("Digite um nome no campo!");
    }

    event.preventDefault();
  }
  
  return (
    <div style={isChecked ? {background: "red"} : {}}>
      <h1>{valueInput}</h1>

      <h1>{isChecked.toString}</h1>

      { nomes.map((item)=>(
        <li>{item}</li>
      ))}

      <form onSubmit={handleSubmit}>
        {/* <input ref={inputRef} /> */}

        <input value={valueInput} onChange={(event) => setValueInput(event.target.value)} />
        <p>{errorInput}</p>

        <input type="submit" />

        <label>
          <input 
          value={isChecked}
          type="checkbox"
          onChange={(event) => setIsChecked(event.target.checked)}/>
        </label>
      </form>
    </div>
  )
}

export default App
