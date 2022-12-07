import { createContext, useState } from 'react';

const AuthContext = createContext({});

const AuthProvider = ({children}) => {

    const [userData, setUserData] = useState([]);

    function fillUserDataState(email, token, user) {
        setUserData[{...userData, email, token, user}]
        
    }

    return (
        <AuthContext.Provider 
        value = {{
            userData, 
            fillUserDataState
        }}>
            {children}
        </AuthContext.Provider>
    )
}

export default AuthProvider;