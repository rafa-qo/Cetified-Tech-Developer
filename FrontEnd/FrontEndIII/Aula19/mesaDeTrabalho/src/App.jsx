import './App.css'
import React, { useState } from 'react'
import LanguageContext, { languages } from './context';
import Navbar from './components/Navbar';
import Body from './components/Body';
import LanguageProvider from './providers/LanguageProvider';
import { BrowserRouter, Routes, Route } from "react-router-dom";

function App() {

  const [language, setLanguage] = useState(languages.US);

  const { id } = language;

  const handleChangeLA = () => {
    setLanguage(() => {
        if (id === "US") {
          setLanguage("PT-BR");
      } else {
          setLanguage("US");
      }
    })
  }

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