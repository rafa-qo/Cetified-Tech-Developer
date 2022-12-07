import { useContext, useState } from "react";
import { useNavigate } from "react-router-dom";
import api from "../../services/api";
import AuthContext from "../../services/";

import styles from "./styles.module.css";

const Auth = () => {
  const navigate = useNavigate();

  const {userData, fillUserDataState} = useContext(AuthContext);

  const [emailForm, setEmailForm] = useState("");
  const [password, setPassword] = useState("");

  function submitForm(event) {
    event.preventDefault();

    auth();

    navigate("/home");
  }

  async function auth(){
    try {
      const response = await api.post("/auth",{
        email, 
        password,
      })
    } catch (error) {
      alert("Erro ao validar usuário. Erro: " + error.message);
    }
  }


  return (
    <div className={styles.container}>
      <div className={styles.card}>
        <h1>Login</h1>

        <p>Entre com seus dados corretamente para acessar o sistema</p>

        <form onSubmit={submitForm}>
          <input value = {emailForm} onChange={(event)=>setEmailForm(event.target.value)} placeholder="Digite seu e-mail" type="email" />
          <input value = {password} onChange={(event)=>setPassword(event.target.value)} placeholder="Digite sua senha" />

          <button className={styles.button}>Salvar</button>
        </form>
      </div>
    </div>
  );
};

export default Auth;
