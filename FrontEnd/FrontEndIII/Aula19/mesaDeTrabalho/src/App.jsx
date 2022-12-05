import './App.css'
import React, { useState, useContext } from 'react'
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Navbar from './components/Navbar';
import Body from './components/Body';
import LanguageProvider from './providers/LanguageProvider';



function App() {

  // const [language, setLanguage] = useState('Teste');

  // const { id } = language;

  // const handleChangeLA = () => {
  //   setLanguage(() => {
  //       if (id === "US") {
  //         setLanguage("PT-BR");
  //     } else {
  //         setLanguage("US");
  //     }
  //   })
  // }

  return (
    <LanguageProvider>
      <BrowserRouter>
          <Navbar />
          <Routes>
            <Route path="/" element={<Body />} />
          </Routes>
        </BrowserRouter>
    </LanguageProvider>
  )
}

export default App