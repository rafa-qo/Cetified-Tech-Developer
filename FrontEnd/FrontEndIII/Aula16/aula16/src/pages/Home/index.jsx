import styles from ".";
import { useState } from "react";
import { Link, useNavigate } from "react-router-dom";

const Home = ()=> {

    // const navigate = useNavigate();

    const [nome, setNome ] = useState();

    // function handleNavigate() {
    //     navigate("/details");
        
    // }

    return (
        <div>
            <h1>Hello Home</h1>
            <Link to="/contact">Ir para Contact</Link>
            <Link to={`/details/${nome}`}>Ir para Detalhes com Nome</Link>

            {/* <button onClick={handleNavigate}>Ir para a Página de Details</button> */}

            <input onChange={(e) => setNome(e.target.value)} />
        </div>
    )
}

export default Home;
