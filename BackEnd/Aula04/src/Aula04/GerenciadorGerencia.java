package Aula04;

public class GerenciadorGerencia extends Gerenciador{

    @Override
    public void verificar(Mail mail){
        if (mail.getDestino().equalsIgnoreCase("gerencia@colmeia.com") || (
                mail.getAssunto().equalsIgnoreCase("Gerência")))
        {
            System.out.println("Enviando à Gerência");
        } else {
            if(this.getSeguinte() != null){
                this.getSeguinte().verificar(mail);
            }
        }
    }
}
