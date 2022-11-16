import './App.css'
import React, { useState } from 'react'
import LanguageContext, { languages } from './context';
import Navbar from './components/Navbar';
import Body from './components/Body';

function App() {

  const [language, setLanguage] = useState(languages.portuguese);

  const handleChangeLA = () => {
    setLanguage(() => language.id === languages.portuguese.id ? languages.english : languages.portuguese)
  }

  return (
    <div className="App">
      <LanguageContext.Provider value={{ language, handleChangeLA }}>
        <Navbar />
        <Body />
      </LanguageContext.Provider>
    </div>
  )
}

export default App