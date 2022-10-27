import './App.css'
import React from 'react'

/* Componentes para a comparação entre os tipos de manipulação de estado no React */
import CounterClassComponent from './State/CounterClassComponent'
import CounterFunctionalComponent from './State/CounterFunctionalComponent'

/* Componente que aprofunda na utilização do useState() */
import UseStateHook from './Hooks/UseStateHook'

function App() {
  return (
    <div className="App">

      {/* PRIMEIRA PARTE:
        Apresentar a comparação entre a utilização de "estado" em componentes de classe e componentes funcionais
        Destacando as principais difirenças entre ambos.
      */}
      <h2>State - Diferenças entre componentes de classe e componentes funcionais(Hooks)</h2>
      <CounterClassComponent totalClicks={0} />
      <br />
      <br />
      <CounterFunctionalComponent totalClicks={0} />

       {/* SEGUNDA PARTE:
          Demonstrar aos alunos as diversas formas de se trabalhar com estados utilizando o Hook useState()
          Abordando o estado de: variáveis simples, objetos JS e Array de Objetos.
        */}
        <br />
        <br />
        <br />
        <h2>useState() - Conhecendo e praticando</h2>
      <UseStateHook a={"Exemplo textual"} b={89} />
    </div>
  )
}

export default App