package Aula04;

public class GerenciadorSpam extends Gerenciador{

    @Override
    public void verificar(Mail mail){
        System.out.println("Marcado como SPAM!");
    }
}