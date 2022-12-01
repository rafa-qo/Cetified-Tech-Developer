import { useState } from "react";

import LanguageContext, { languages } from "../context";


const LanguageProvider = ({ children }) => {
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

export default LanguageProvider;