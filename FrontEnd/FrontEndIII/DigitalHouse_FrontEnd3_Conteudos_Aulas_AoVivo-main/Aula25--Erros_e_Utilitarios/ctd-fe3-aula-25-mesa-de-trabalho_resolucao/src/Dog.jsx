/* Importando o Hook personalizado e os status */
import { statusList, useFetch } from "./UseFetch"

/* Importando os recursos da biblioteca Sweetalert2 */
import Swal from 'sweetalert2'
import withReactContent from 'sweetalert2-react-content'

function Dog({ breed }) {

    const MySwal = withReactContent(Swal);

    /* Utilizamos o custom Hook para acessar a API informando a URL */
    const { data, status } = useFetch(`https://dog.ceo/api/breed/${breed}/images/random`
    );

    /* De acordo com o status da conexão com a API apresenta uma informação ao usuário */
    if (status === statusList.LOADING) {
        return <p>Carregando...</p>;
    }
    if (status === statusList.SUCCESS) {
        /* Apresenta um alerta com as informações do Dog */
        MySwal.fire({
            imageUrl: `${data.message}`,
            imageWidth: 150,
            imageHeight: 150,
        });
    }
    if (status === statusList.ERROR) {
        return <p>Erro ao buscar uma imagem para a raça: {breed}</p>;
    }

    return (
        <div>
            <h2>Você buscou pela raça: {breed}</h2>
            <img src={data.message} />
        </div>
    );
}

export default Dog;