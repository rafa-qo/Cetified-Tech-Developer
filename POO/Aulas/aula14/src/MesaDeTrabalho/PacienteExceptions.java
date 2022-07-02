package MesaDeTrabalho;

public class PacienteExceptions extends Exception{

    public PacienteExceptions() {
    }

    public PacienteExceptions(String message) {
        super(message);
    }

    @Override
    public String toString(){
        return getMessage();
    }
}
