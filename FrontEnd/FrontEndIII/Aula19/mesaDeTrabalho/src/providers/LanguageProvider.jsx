import React, { useState, useEffect, createContext } from "react";

export const LanguageContext = createContext({});

const LanguageProvider = ({children}) => {

  useEffect(()=>{
    handleLanguageID();
  },[])

  useEffect(()=>{
    handleLanguage();
  },[])

  const [languageID, setLanguageID] = useState("US");

  const [language, setLanguage] = useState({
    title: "",
    description: "",
    home: "",
    current: "",
    button: ""
  });

  function handleLanguageID() {
    if (languageID === "PT-BR") {
      setLanguageID("US");
      handleLanguage();
    } else {
      setLanguageID("PT-BR");
      handleLanguage();
    }
  }

  function handleLanguage() {
    if (languageID === "PT-BR") {
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
    <LanguageContext.Provider value={{ language, setLanguage, handleLanguage, languageID, handleLanguageID }}>
      {children}
    </LanguageContext.Provider>
  );
};

export default LanguageProvider;
