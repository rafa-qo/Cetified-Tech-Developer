import React, { useContext } from 'react'
import "../App.css"
import LanguageContext, { languages } from '../context'

const Navbar = () => {
    // DICA: Descomente esse bloco de código, quando "App.jsx" tiver um provider
    const { language, handleLanguage } = useContext(LanguageContext);

    const { current, button } = language;
    
    return (
        <div className="navbar">
            {/* DICA: Deixe essas informações dinâmicas, utilize os valores capturados via contexto (veja 'text', na linha 8) */}
            <p>Início</p> 
            <p>{current}: {languages.text}</p>
            <button onClick={handleLanguage}>{button}</button>
        </div>
    )
}

export default Navbar