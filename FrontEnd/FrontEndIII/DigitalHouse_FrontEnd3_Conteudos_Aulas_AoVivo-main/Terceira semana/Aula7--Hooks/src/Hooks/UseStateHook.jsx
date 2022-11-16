import React, { useState } from "react";

function UseStateHook(props) {

    //Demonstrar a definição de estado para tipos diferentes de variáveis (obtidas através das props)
    
    //Textual/String
    const [A, setA] = useState(props.a); //Recebe através de props o valor default de "a"
    
    //Numeric
    const [B, setB] = useState(props.b); //Recebe através de props o valor default de "b"

    //Definindo estado para um objeto literal JavaScript
    const [object, setObject] = useState(
        //Informação inicial/default deste objeto
        {
            city: "São Paulo",
            country: "BRA"
        }
    );

    //Definindo estado para um Array de elementos
    const [array, setArray] = useState([]); //Iniciando o estado como um Array vazio

    return (
        <div>

            {/* EXIBINDO AS VARIÁVEIS E SEUS ESTADOS ATUAIS */}

            <h3>Variáveis simples</h3>
            <p>Valor presente em A: {A}</p>
            <p>Valor presente em B: {B}</p>

            <br />  {/* Quebra de linha no layout */}

            <h3>Objeto literal JS</h3>
            <p>A cidade {object.city} pertence ao país {object.country}</p>

            <br />

            <h3>Array de elementos</h3>
            {array.map((itemArray, index) =>
                <li key={index}>
                    {itemArray}
                </li>
            )}

            <br />
            <br />

            <button onClick={() => {

                // MANIPULANDO OS ESTADOS DOS ELEMENTOS AO CLIAR NO BOTÃO

                //Variáveis simples
                setA("Nova descrição adicionada");
                setB(999);

                //Objeto JS e suas propriedades
                setObject(
                    previousState => ({
                        ...previousState, //Explicar o motivo de informar os valores antigos do objeto
                        //Sugere-se também, demonstrar a alteração de apenas 1 valor do objeto.
                        city: "Buenos Aires",
                        country: "AR"
                    })
                );

                //Array de elementos
                setArray(oldArray =>
                    //Similar a fazer um push(), porém, utilizando controle de estado no Array
                    [
                        ...oldArray, //Explicar a necessidade de se passar a ref para o array antigo
                        `Item ${oldArray.length + 1}` //Adicionando um novo elemento no array (equivalente ao push())
                    ]
                );
            }}>
                Clique aqui para alterar os estados
            </button>
        </div>
    )
}

export default UseStateHook;