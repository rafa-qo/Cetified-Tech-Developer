import './App.css'
import React from 'react'

import ErrorBoundary from './Errors/ErrorBoundary'
import Dog from './Dog'

import { ToastContainer } from "react-toastify"
import "react-toastify/dist/ReactToastify.css"

function App() {

  return (
    <div className="App">
      {/* Importa no nível mais alto da árvore (APP) o Container do Toast. 
      Assim, todos os demais componentes, poderão utilizar o recurso (apenas importando 'toast') */}
      <ToastContainer />

      {/* Deixa o ErrorBoundary monitorando as demais rotas/componentes(filhos) da aplicação */}
      <ErrorBoundary>
        <Dog breed={"husky"}/> {/* Caso de sucesso na API */}
        {/* <Dog breed={"ruffles"}/> */}  {/* Caso de erro na API */}
        
        {/* Veja todas as raças disponíveis pela API: https://dog.ceo/dog-api/breeds-list */}
      </ErrorBoundary>
    </div>
  )
}

export default App;