import React from "react";

/* Importando o recurso de Toast */
import { toast } from "react-toastify";

/* Ainda não existem Hooks nativos que contemplem este recurso, assim, é necessário usar um componente de classe */
class ErrorBoundary extends React.Component {
    constructor(props) {
        super(props);

        /* Definição dos estados do componente*/
        this.state = {
            hasError: false,
            errorInfo: null
        };
    }

    /* Captura exceções de componentes filhos na ávore - Se não tratado, quebra a estrutura dos componentes */
    componentDidCatch(hasError, errorInfo) {

        /* Apresenta mensagem genérica ao encontrar um erro/exceção */
        toast("Ocorreu algum erro na aplicação");

        //DICA: Aqui também poderia ser executada uma função específica que trata/registra um erro específico.

        /* Atualiza os estados do componente. */
        this.setState({
            hasError: hasError,
            errorInfo: errorInfo,
        })
    }

    render() {
        /* Se existir algum erro/exceção... */
        if (this.state.hasError) {
            /* Interface renderizada quando um erro é encontrado*/
            return (<div>
                <h2>Ops...ocorreu algum erro!!!</h2>

                {/* Por padrão, apresenta nos navegadores a opção: "Saiba mais" */}
                <details style={{ whiteSpace: 'pre-wrap' }}>
                    <h4>Mais detalhes sobre esta situação (Stack Trace):</h4>
                    {/* Apresenta o erro principal que causou a exceção (e uma possível mensagem/causa) */}
                    {this.state.hasError.toString()}
                    <br />
                    <br />
                    {/* Apresenta a árvore de componentes relacionada a esta exceção (do componente mais próximo a exceção até o mais distante (<App />)) */}
                    {this.state.errorInfo.componentStack}
                </details>
            </div>)
        }
        /* Se NÃO existir algum erro/exceção... */
        /* Retorna normalmente os elementos/componentes filhos (de ErrorBoundary) */
        return this.props.children;
    }
}

export default ErrorBoundary;