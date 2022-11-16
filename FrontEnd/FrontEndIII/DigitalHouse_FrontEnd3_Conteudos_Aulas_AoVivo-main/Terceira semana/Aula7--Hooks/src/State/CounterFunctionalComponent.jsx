import React, { useState } from "react";

/* Definindo um componente do tipo Funcional */
function CounterFunctionalComponent(props) {

    /* Definindo o estado do contador de clicks */
    const [count, setCount] = useState(props.totalClicks); //Recebe o valor default pelas props

    return (
        <div>
            {/* Exibindo o estado atual da variável */}
            <p>Clicou o total de {count} vezes</p>

            <button onClick={() =>

                /* Atualizando o estado da variável */
                setCount(count + 1) //Altera o estado da variável "count"
            }>
                Clique no botão (Comp Funcional)
            </button>
        </div>
    )
}

export default CounterFunctionalComponent;