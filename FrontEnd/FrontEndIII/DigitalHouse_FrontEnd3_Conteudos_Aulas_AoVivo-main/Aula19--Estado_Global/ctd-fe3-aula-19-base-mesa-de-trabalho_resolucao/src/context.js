import { createContext } from 'react';
import PTBR from "./languages/portuguese.json"
import EN from "./languages/english.json"
import ES from "./languages/spanish.json"

export const languages = {
    portuguese: {
        id: "PTBR",
        text: PTBR
    },
    english: {
        id: "EN",
        text: EN
    },
    spanish: {
        id: "ES",
        text: ES
    }
};

const LanguageContext = createContext(languages.portuguese);

export default LanguageContext;