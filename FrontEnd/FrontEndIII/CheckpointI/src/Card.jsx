import './app.css';

function Card(props) {

    const bgColor = {
        padding: 30,
        marginRight: 20,
        marginBottom: 20,
        // position: 'relative',
        float: 'left',
        backgroundColor: '#'+props.hexadecimal,
        height: 200,
        width: 370,
        borderRadius: 10,

    }

    return(
        <div key={props.hexadecimal} style={bgColor}>
            <h1>{props.nome}</h1>
            <h2>#{props.hexadecimal}</h2>
        </div>
    );

}

export default Card;