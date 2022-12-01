import { createContext, useState } from "react";

import { languages, LanguageContext } from "../context";


const LanguagueProvider = ({ children }) => {
  const [language, setLanguage] = useState("US");

  function handleLanguage() {
    if (language === "PT-BR") {
        setLanguage("US");
    } else {
        setLanguage("PT-BR");
    }
  }

  return (
    <LanguageContext.Provider value={{ language, handleLanguage }}>
      {children}
    </LanguageContext.Provider>
  );
};

export default LanguagueProvider;
