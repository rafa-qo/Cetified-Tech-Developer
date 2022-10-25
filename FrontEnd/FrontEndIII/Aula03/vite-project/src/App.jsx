// import { useState } from 'react'
import "./styles.css";
import Button from "./Button";
import Container from "./Container";
import ListaCompras from "./ListaDeCompras";

function App() {

  const nome = "Rafael";


  function button1(){
    alert("BTN1");
  }

  return (
    <div>
      <h1 className="outraFonte">{nome}</h1>
      <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit.
        Animi, eaque sunt. Earum, laudantium, numquam corporis ipsum
        odit natus tempore nulla sunt officia nesciunt provident,
        animi eligendi porro itaque nemo soluta.
      </p>
      <Button name="Teste" color="red" click={button1}/>
      <Container>
        <h1>Título do Container 1</h1>
      </Container>
      <Container title="Texto do container 2"/>
      <Container title="Texto do container 3"/>
      <ListaCompras />
    </div>
  );
}

export default App;
