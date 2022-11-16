import { Link } from 'react-router-dom';

function UnknownRoute() {
    return (
        <div>
            <h1 style={{fontSize: "200px"}}>404</h1>
            <h1 style={{fontSize: "30px"}}>Recurso não encontrado!</h1>
            <p style={{ textAlign: "center" }}>
                <Link to="/home">Voltar para o início </Link>
            </p>
        </div>

    );
}

export default UnknownRoute;