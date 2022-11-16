import React from "react";

/* Definindo um componente do tipo Classe */
class CounterClassComponent extends React.Component {

    constructor(props) {

        super(props);

        this.state = {
            /* Definindo o estado que será manipulado */
            count: props.totalClicks //Recebe o valor default pelas props
        }
    }
    render() {
        return (
            <div>
                {/* Exibindo o valor do estado da variável */}
                <p>Clicou o total de {this.state.count} vezes</p>

                <button onClick={() =>
                    
                    /*  Atualizando o estado da variável*/
                    this.setState(
                        {
                            count: this.state.count + 1,
                        }
                    )
                }>
                    Clique no botão (Comp Classe)
                </button>
            </div>
        )
    }

}

export default CounterClassComponent;