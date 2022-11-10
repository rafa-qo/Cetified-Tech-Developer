import './app.css';

function Card(props) {

    return(
        <div key={props.hexadecimal} className="card">
            <h1>{props.nome}</h1>
            <h2>{props.hexadecimal}</h2>
        </div>
    );

}

export default Card;