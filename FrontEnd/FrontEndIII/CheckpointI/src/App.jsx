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

    ]
  );

  const [error,setError] = useState();
  
  const handleSubmit = (event) => {
    event.preventDefault();

    if(formData.hexadecimal.length != 6 || formData.nome.length < 3){

      setError("Opção inválida");
      alert("Formato inválido. Digite o nome da cor e o Hexadecimal com 6 dígitos e sem o #");

    } else {
      
      setCard([...card, 
        {
          nome: formData.nome, 
          hexadecimal: formData.hexadecimal
        }
      ])

      setError("");
      setFormData(
        {
          nome: "", 
          hexadecimal: ""
        }
      );

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
          <span className='errorLine'>{error}</span>
        </form>
      </div>

      <h1 style={{paddingLeft:30}}>Cores selecionadas</h1>

      {card.map((card)=>{
        return(

          <Card key={card.hexadecimal} nome={card.nome} hexadecimal={card.hexadecimal}/>

        )
      })}

    

    </div>
  );

}

export default App
