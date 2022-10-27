import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App'
import './index.css'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Characters from './components/Characters'
import Locations from './components/Locations'
import Episodes from './components/Episodes'
import Character from './components/Character'

import NotFound from './components/NotFound'

ReactDOM.createRoot(document.getElementById('root')).render(
  <BrowserRouter>
    <Routes>
      <Route path='/' element={<App />}>

        {/* Rotas aninhadas ao '/' */}
        <Route path='characters' element={<Characters />} />

        {/* Rota com parametro/dinâmica */}
        <Route path='characters/:name' element={<Character />} />
        <Route path='locations' element={<Locations />} />
        <Route path='episodes' element={<Episodes />} />
        
        {/* Rota padrão em caso de rota desconhecida */}
        <Route path='*' element={<NotFound />} />
      </Route>
    </Routes>
  </BrowserRouter>
)
