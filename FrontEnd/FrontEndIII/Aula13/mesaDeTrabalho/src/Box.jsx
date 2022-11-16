import { useEffect } from "react";

const Box = () => {

    useEffect(() => () => {console.log("Executei depois que finalizei o componente")}, [])
    
    return(
        <div>
            <h1>
                Essa box será mostrada!
            </h1>
        </div>
    )
}

export default Box;