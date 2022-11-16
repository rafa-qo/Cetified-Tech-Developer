import { useState, useEffect } from 'react'
import Box from './Box';

const pizzasList = [
  {
    id: 1, 
    nome: "Portuguesa",
    preco:24.9
  },
  {
    id: 2, 
    nome: "Frango",
    preco:34.9
  }
]

function App() {
  
  const [pizzas, setPizzas] = useState([]);

  const [update, setUpdate] = useState([]);

  useEffect(()=>{
    setUpdate(()=>{

      setTimeout(()=>{
        setPizzas(pizzasList);
       }, 2000)

    },[]);
    
  })

  return (
    <>
      {update ? <p> Carregando...</p> :
      (<ul>
        {pizzas.map( (pizza) => 
          (
            <li>
              <h1>{pizza.nome}</h1>
              <h2>{pizza.preco}</h2>
            </li>
          )
        )}
      </ul>)}
        
      )
    </>
  )
}

export default App
