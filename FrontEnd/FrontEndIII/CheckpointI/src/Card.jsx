function Card(props) {

    return(
        <div>
            <h1>{props.cor}</h1>
            <h2>{props.nome}</h2>
        </div>
    ); 
}

export default Card;