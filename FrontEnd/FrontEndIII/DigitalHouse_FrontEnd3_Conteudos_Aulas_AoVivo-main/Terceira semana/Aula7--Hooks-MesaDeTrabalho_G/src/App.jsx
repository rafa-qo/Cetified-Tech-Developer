/* 
  - Prof Marcos V. Martins
  - Possível solução para a mesa de trabalho da Aula 7
*/

import './App.css'
import React, { useState } from 'react'

/* Importando um novo componente */
import Item from './components/Item';

function App() {

  /* Definindo um novo array que possui estado gerenciável */
  const [items, setItems] = useState([]);

  return (
    <div className="App">
      <button onClick={
        /* Executa a função ao clicar no botão */
        () =>
          /* Atualiza os valores, gerando um novo array a cada iteração */
          setItems(
            oldItemsArray => [...oldItemsArray, `O item ${oldItemsArray.length + 1} foi adicionado à lista!`]
          )
      }>Clique para adicionar um item</button>
      <br />
      <h1>Itens da lista</h1>
      <div>
        {/* Exibindo os elementos da lista */}
        {
          /* Utiliza um componente (Item) para renderizar os itens do Array */
          items.map((element, index) => <Item key={index} descricao={element} />)
        }
      </div>
    </div>
  )
}

export default App