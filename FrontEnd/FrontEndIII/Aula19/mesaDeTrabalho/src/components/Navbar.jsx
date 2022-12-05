import React, { useContext, useEffect } from 'react'
import "../App.css"
import { LanguageContext }  from '../providers/LanguageProvider'

const Navbar = () => {
    const { language, languageID, handleLanguageID } = useContext(LanguageContext);

    function handleLanguage(languageID) {
        if (languageID === "US") {
          setLanguage(
            {
              title: "Welcome to the translations project from Digital House",
              description: "You will learn how to use context to make your translations",
              home: "Home",
              current: "Current language",
              button: "Change language"
            }
          );
        } else {
          setLanguage({
            title: "Bem-vindo ao projeto de traduções da Digital House",
            description: "Você aprenderá como usar o contexto para fazer suas traduções",
            home: "Início",
            current: "Idioma atual",
            button: "Trocar Idioma"
          })
        }
      }
    
    return (
        <div className="navbar">
            <p>Início</p> 
            <p>{language.current}: {languageID}</p>
            <button onClick={handleLanguageID}>{language.button}</button>
        </div>
    )
}

export default Navbar;