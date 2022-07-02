package ExercicioGuiado;

public class ClientesException extends Exception{
    public ClientesException(){ }

    public ClientesException(String message){
        super(message);
    }


    @Override
    public String toString(){
        return "Erro em: " + this.getClass().getName() + ". Mensagem: " + this.getMessage();
    }
}
