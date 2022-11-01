import { useState } from 'react'
import reactLogo from './assets/react.svg'
import './App.css'

function App() {
  const [item, setItem] = useState([]);

  const addItem = () => {

    item.push()
    setItem([...item, item.length + 1]);
  }
  return (
    <div>
      <ul>
          {item.map((val) => 
            (
              <li>{`O item ${val} foi adicionado à lista!`}</li>
            )
          )
            }
      </ul>
      <button onClick={addItem}>Aperte</button>
    </div>
  )
}

export default App
