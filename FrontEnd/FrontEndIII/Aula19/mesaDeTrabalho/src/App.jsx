import './App.css'
import React, { useState } from 'react'
import LanguageContext, { languages } from './context';
import Navbar from './components/Navbar';
import Body from './components/Body';
import LanguagueProvider from './providers/LanguageProvider';

function App() {

  const [language, setLanguage] = useState(languages.US);

  const handleChangeLA = () => {
    setLanguage(() => {
        if (language === "US") {
          setLanguage("PT-BR");
      } else {
          setLanguage("US");
      }
    })
  }

  return (
    <LanguagueProvider>
      <BrowserRouter>
          <Navbar />
          <Routes>
            <Route path="/" element={<Body />} />
          </Routes>
        </BrowserRouter>
      </LanguagueProvider>
  )
}

export default App