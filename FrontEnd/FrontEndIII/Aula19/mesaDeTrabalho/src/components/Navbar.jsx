import React, { useContext, useEffect } from 'react'
import "../App.css"
import { LanguageContext }  from '../providers/LanguageProvider'

const Navbar = () => {
    const { language, languageID, handleLanguageID } = useContext(LanguageContext);
    
    return (
        <div className="navbar">
            <p>Início</p> 
            <p>{language.current}: {languageID}</p>
            <button onClick={handleLanguageID}>{language.button}</button>
        </div>
    )
}

export default Navbar;