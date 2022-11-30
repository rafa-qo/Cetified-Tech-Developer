import { useNavigate } from "react-router-dom";

const Contact = ()=> {

    const navigate = useNavigate();

    function handleNavigate() {
        navigate("/");
    };


    return (
        <div>
            <h1>Hello Contact</h1>
        

            <button onClick={handleNavigate}>Ir para a Página Home</button>

        </div>
    )
}

export default Contact;