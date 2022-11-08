import { useState } from "react";
import "./styles.css";

function App() {

  const [formData, setFormData] = useState({ disciplina: "", nota: 0});

  const [entrada, setEntrada] = useState({ 
    bancoDeDados: {
      qtdeAlunos: 0,
      notaDisciplina: 0
    },
    frontEnd: {
      qtdeAlunos: 0,
      notaDisciplina: 0
    },
    backEnd: {
      qtdeAlunos: 0,
      notaDisciplina: 0
    },
  })

  const [formDataError, setFormDataError] = useState ("");


  function handleSubmit(event) {

    event.preventDefault();

    alert(formData.disciplina);

    if(formData.disciplina == 'database') {
      setEntrada({...entrada, bancoDeDados: 
        {
        qtdeAlunos: entrada.bancoDeDados.qtdeAlunos + 1,
        notaDisciplina: Number(entrada.bancoDeDados.notaDisciplina) + Number(formData.nota)
        }
      })
    } else if (formData.disciplina == 'backend') {
      setEntrada({...entrada, backEnd: {
        qtdeAlunos: entrada.backEnd.qtdeAlunos + 1,
        notaDisciplina: Number(entrada.backEnd.notaDisciplina) + Number(formData.nota)
      }})
    } else if (formData.disciplina == 'frontend') {
      setEntrada({...entrada, frontEnd: {
        qtdeAlunos: entrada.frontEnd.qtdeAlunos + 1,
        notaDisciplina: Number(entrada.frontEnd.notaDisciplina) + Number(formData.nota)
      }})
    } else {
      setFormDataError("Opção inválida");
    }
  }

  return (
    <div className="container">
      <h1>Média de Alunos por Disciplina</h1>
      <form className="form" onSubmit={handleSubmit}>
        <div className="container_input">
          <select value={formData.disciplina}
                  onChange={(event) =>
                  setFormData({ ...formData, disciplina: event.target.value })
          }>
            <option value="none">Selecione uma discplina</option>
            <option value="database">Banco de Dados</option>
            <option value="backend">Desenvolvimento Backend</option>
            <option value="frontend">Desenvolvimento Frontend</option>
            <option value="devops">Devops</option>
          </select>
          <input value={formData.nota} 
                 onChange={(evento)=>setFormData({...formData, nota: evento.target.value})
          }/>
        </div>
        <p>{formDataError}</p>
        <input type="submit" value="Salvar" />
      </form>

      <div className="container">
        
        <table border="1" className="line_title">
          <thead>
            <tr>
              <th>Disciplina</th>
              <th>Quantidade de Alunos</th>
              <th>Média das notas dos alunos</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>Banco de Dados</td>
              <td>{entrada.bancoDeDados.qtdeAlunos > 0 ? entrada.bancoDeDados.qtdeAlunos : 0}</td>
              <td>{entrada.bancoDeDados.notaDisciplina > 0 ? entrada.bancoDeDados.qtdeAlunos : 0}</td>
            </tr>

            <tr>
              <td>Desenvolvimento Frontend</td>
              <td>{entrada.frontEnd.qtdeAlunos || 0}</td>
              <td>{entrada.frontEnd.nota / entrada.frontEnd.qtdeAlunos || 0}</td>
            </tr>

            <tr>
              <td>Desenolvimento Backend</td>
              <td>{entrada.backEnd.qtdeAlunos || 0}</td>
              <td>{entrada.backEnd.nota / entrada.backEnd.qtdeAlunos || 0}</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default App;
