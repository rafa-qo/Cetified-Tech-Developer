import styles from ".";
import { Link, useNavigate, useParams } from "react-router-dom";

const Details = ()=> {

    const navigate = useNavigate();

    const { nome } = useParams();

    function handleNavigate() {
        navigate("/contact");
    }

    return (
        <div>
            <h1>Hello Details</h1>
            <p>{JSON.stringify(nome)}</p>
            <Link to="/">Ir para Home</Link>
            <button onClick={handleNavigate}>Ir para a Página de Contato</button>
        </div>
    )
}

export default Details;
