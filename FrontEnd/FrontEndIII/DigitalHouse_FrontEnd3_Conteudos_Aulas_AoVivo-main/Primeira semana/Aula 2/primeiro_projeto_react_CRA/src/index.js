/* Importações obrigatórias */
import React from 'react';
import ReactDOM from 'react-dom/client';

/* Importando a estilização geral da página */
import './index.css';

/* Importando um componente */
import App from './App';

//Capturando o contêiner root do HTML
const root = ReactDOM.createRoot(document.getElementById('root'));

/* STRICT-MODE: ferramenta que sinaliza potenciais problemas em uma aplicação. */
/* REF: https://pt-br.reactjs.org/docs/strict-mode.html */
root.render(
  <React.StrictMode> 
    <App /> 
  </React.StrictMode>
);