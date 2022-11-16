import React, { useState } from 'react'
import "./App.css"
import ThemeContext, { themes } from './context'
import Navbar from './components/Navbar'
import Body from './components/Body'
import Layout from './components/Layout'

function App() {

  const [theme, setTheme] = useState(themes.light);

  const handleChangeTheme = () => {
    theme === themes.dark ? setTheme(themes.light) : setTheme(themes.dark);
  }

  return (
    <div className="App">
      <ThemeContext.Provider value={{ theme, handleChangeTheme }}>
        <Layout>
          <Navbar />
          <Body />
        </Layout>
      </ThemeContext.Provider>
    </div>
  )
}

export default App