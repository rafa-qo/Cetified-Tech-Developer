import React, { useContext } from 'react'
import LanguageContext from '../context'

const Body = () => {

    const { language, handleLanguage } = useContext(LanguageContext);
    
    /* DICA: Utilize o useContext() */
    
    return (
        <div>
            {/* DICA: Utilize os valores capturados via contexto */}
            <h1>Título</h1>
            <p>Descrição</p>
        </div>
    )
}

export default Body