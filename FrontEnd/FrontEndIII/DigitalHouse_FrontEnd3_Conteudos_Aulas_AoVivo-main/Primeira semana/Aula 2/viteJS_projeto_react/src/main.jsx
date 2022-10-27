/* Material de apoio e referência:
  -> https://vitejs.dev/guide/
  -> https://www.digitalocean.com/community/tutorials/how-to-set-up-a-react-project-with-vite
*/
import React from 'react'
import ReactDOM from 'react-dom/client'

import App from './App'
import './index.css'

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
)