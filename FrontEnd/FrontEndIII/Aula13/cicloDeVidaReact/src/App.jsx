import { useLayoutEffect, useState, useEffect } from 'react'
import Box from './Box';

function App() {
  const [count, setCount] = useState(0)

  const [visibleBox, setVisibleBox] = useState(true);

  // useLayoutEffect(() => {
  //   console.log("Executei a inicialização")
  // }, []);

  useEffect(() => {
    setCount(count + 1);
    console.log("Executei após a inicialização")
  }, []);

  return (
    <div className="App">
      { console.log("Executei a inicialização dentro do componente") }
      {visibleBox ? <Box /> : null}
      <button onClick={() => setVisibleBox(!visibleBox)}>Handle Box</button>
      <h1>{count}</h1>
    </div>
  )
}

export default App
