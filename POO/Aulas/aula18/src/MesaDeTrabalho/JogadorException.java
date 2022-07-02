package MesaDeTrabalho;

public class JogadorException extends Exception {
    public JogadorException() {
    }

    public JogadorException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
