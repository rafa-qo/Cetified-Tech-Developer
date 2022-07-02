package aula16;

public class DataException extends Exception{
    public DataException(){ }

    public DataException(String message){
        super(message);
    }

    @Override
    public String toString(){
        return "A exceção ocorreu em: " + this.getClass().getName() + ". Mensagem: " + this.getMessage();
    }
}
