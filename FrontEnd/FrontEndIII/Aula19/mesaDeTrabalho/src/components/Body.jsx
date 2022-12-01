import React, { useContext } from 'react'
import LanguageContext, { languages } from '../context'

const Body = () => {

    const { language } = useContext(LanguageContext);

    const { title, description } = language;

    
    /* DICA: Utilize o useContext() */
    
    return (
        <div>
            {/* DICA: Utilize os valores capturados via contexto */}
            <h1>{title}</h1>
            <p>{description}</p>
        </div>
    )
}

export default Body