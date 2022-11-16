import './App.css'
import React from 'react'

import ErrorBoundary from './Errors/ErrorBoundary'
import Pokemon from './Pokemon'

import { ToastContainer } from "react-toastify"
import "react-toastify/dist/ReactToastify.css"

function App() {

  return (
    <div className="App">
      {/* Importa no nível mais alto da árvore (APP) o container do Toast. 
      Assim, todos os demais componentes, poderão utilizar o recurso (apenas importando 'toast') */}
      <ToastContainer />

      {/* Deixa o ErrorBoundary controlando as demais rotas/componentes(filhos) da aplicação */}
      <ErrorBoundary>
        <Pokemon pokemon="charizard" /> {/* Sucesso na requisição */}
        {/* <Pokemon pokemon="charizards" /> */} {/* Erro na requisição */}
      </ErrorBoundary>
    </div>
  )
}

export default App