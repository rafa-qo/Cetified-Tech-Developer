import React, { useContext } from 'react'
import { LanguageContext } from '../providers/LanguageProvider';

const Body = () => {

    const { language } = useContext(LanguageContext);

    
    return (
        <div>
            {/* DICA: Utilize os valores capturados via contexto */}
            <h1>{language.title}</h1>
            <p>{language.description}</p>
        </div>
    )
}

export default Body