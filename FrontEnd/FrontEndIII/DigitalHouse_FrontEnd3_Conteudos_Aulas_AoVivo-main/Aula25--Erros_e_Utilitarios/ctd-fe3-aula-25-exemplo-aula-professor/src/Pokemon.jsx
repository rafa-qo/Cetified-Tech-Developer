/* Importando um Hook personalizado */
import { statusList, useFetch } from "./UseFetch"

/* Importando os recursos da biblioteca Sweetalert2 */
import Swal from 'sweetalert2'
import withReactContent from 'sweetalert2-react-content'

function Pokemon({ pokemon }) {

    const MySwal = withReactContent(Swal)

    /* Utilizamos o custom Hook para acessar a API informando a URL */
    const { data, status } = useFetch(
        `https://pokeapi.co/api/v2/pokemon/${pokemon}`
    );

    /* De acordo com o status da conexão com a API apresenta uma informação ao usuário */
    if (status === statusList.LOADING) {
        return <p>Carregando...</p>;
    }
    if (status === statusList.SUCCESS) {
        /* Apresenta um alerta com as informações do Pokemon */
        MySwal.fire({
            title: `${data.name}`,
            imageUrl: `${data.sprites.front_default}`,
            imageWidth: 150,
            imageHeight: 150,
            imageAlt: `${data.name}`,
        });
    }
    if (status === statusList.ERROR) {
        return <p>Erro ao busar o pokemon: {pokemon}</p>;
    }

    return (
        <div>
            <h3>{data.name}</h3>
            <img src={data.sprites.front_default} alt={data.name} />
        </div>
    );
}   

export default Pokemon;