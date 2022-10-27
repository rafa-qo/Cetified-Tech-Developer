/* 
    Custom Hook 
    Responsável por realizar a busca de Pokemon em uma API.
*/
import { useEffect, useState, useCallback } from "react";

/* Importando um Custom Hook que permite tratar erros/exceções assincronas ao utilizar o ErrorBounder */
import useAsyncError from "./Errors/useAsyncError";

/* Possíveis status ao fazer a busca(GET) na API */
export const statusList = {
    SUCCESS: "SUCCESS",
    ERROR: "ERROR",
    LOADING: "LOADING"
};

export const useFetch = (url) => {

    const [status, setStatus] = useState(statusList.LOADING);
    const [data, setData] = useState();
    const throwError = useAsyncError();

    const fetchData = useCallback(async () => {

        setStatus(statusList.LOADING);

        try {
            const response = await fetch(url);

            /* Caso a resposta não seja bem sucedida (equivale à status != 200) */
            if (!response.ok) {
                throw Error("Erro ao realizar a requisição na API");
            }

            const json = await response.json();

            setData(json);
            setStatus(statusList.SUCCESS);
        } catch (error) {
            setStatus(statusList.ERROR);
            /* Chamamos o Hook customizado para que o ErrorBoundary possa capturar esta exceção como esperado*/
            throwError(new Error(error))
        }
    }, [url]);

    useEffect(() => {
        fetchData();
    }, [fetchData]);

    return { data, status };
};