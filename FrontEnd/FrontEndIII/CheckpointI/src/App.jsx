import { useState } from 'react'
import './App.css'
import Card from './Card'

function App() {

  const [formData, setFormData] = useState(
    {
      nome: "", 
      hexadecimal: ""
    }
  );

  const [card, setCard] = useState(
    [
      {
        nome: "",
        hexadecimal: ""
      }
    ]
  );
  
  const handleSubmit = (event) => {
    event.preventDefault();

    if(formData.hexadecimal.length == 6 || formData.nome != ""){

      setCard([...card, 
        {
          nome: formData.nome, 
          hexadecimal: formData.hexadecimal
        }
      ])

    } else {
    
      alert("Formato inválido. Digite o nome da cor e o Hexadecimal com 6 dígitos e sem o #");
      
    }

  };

  return (
    <div className="App">
      <div className='header-form'>
        <h1>Escolha sua cor</h1>
        <form>
          <input className='formInput' value={formData.nome}
            onChange={(evento)=>setFormData({...formData, nome: evento.target.value})}
            placeholder='Digite o nome da cor'/>
          <input className="formInput" value={formData.hexadecimal}
            onChange={(evento)=>setFormData({...formData, hexadecimal: evento.target.value})}
            placeholder='Digite o Hexadecimal sem o #'/>
          <input className='formButton' type="submit" onClick={handleSubmit} />
        </form>
      </div>

      <h1>Cores selecionadas</h1>

      {card.map((card)=>{
        return(

          <Card key={card.hexadecimal} nome={card.nome} hexadecimal={card.hexadecimal}/>

        )
      })}

    

    </div>
  );

}

export default App
