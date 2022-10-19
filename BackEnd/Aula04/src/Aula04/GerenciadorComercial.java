package Aula04;

public class GerenciadorComercial extends Gerenciador{

    @Override
    public void verificar(Mail mail){
        if (mail.getDestino().equalsIgnoreCase("comercial@colmeia.com") || (
                mail.getAssunto().equalsIgnoreCase("Comercial")))
        {
            System.out.println("Enviando ao departamento Comercial");
        } else {
            if(this.getSeguinte() != null){
                this.getSeguinte().verificar(mail);
            }
        }
    }
}
