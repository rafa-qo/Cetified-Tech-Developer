import { useState } from 'react'
import reactLogo from './assets/react.svg'
import './App.css'

function App() {

  const [numero, setNumero] = useState(0);

  const [valores, setValores] = useState([10, 20, 30, 40]);

  const handleButton = () => {
    setNumero(numero + 1);
    setValores([...valores, numero + 1]);
  }
  return (
    <div>
      <h1>{numero}</h1>
        {valores.map((val) => 
          (
            <h2>{val}</h2>
          )
        )
        }
      <button onClick={handleButton}>Aperte</button>
    
    </div>
  )
}

export default App
