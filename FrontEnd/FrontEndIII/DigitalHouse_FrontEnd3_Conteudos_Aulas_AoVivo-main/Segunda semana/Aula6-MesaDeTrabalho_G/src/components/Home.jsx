import React from 'react';

import City from './City';

/* Componente do tipo funcional */
function HomeComponent(props) {
    return (<div>
        {props.items.map((itemIteracao) => {
            if (itemIteracao.country == "BRA") {
                
                /* Retorna o item/objeto de cada iteração para o componente "City" que constroi o componente */
                return <City item={itemIteracao} />
            }
        })}
    </div>)
}
export default HomeComponent;