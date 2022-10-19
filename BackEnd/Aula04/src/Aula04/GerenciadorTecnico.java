package Aula04;

public class GerenciadorTecnico extends Gerenciador{

    @Override
    public void verificar(Mail mail){
        if (mail.getDestino().equalsIgnoreCase("tecnica@colmeia.com") || (
                mail.getAssunto().equalsIgnoreCase("Técnico")))
        {
            System.out.println("Enviando ao Técnico");
        } else {
            if(this.getSeguinte() != null){
                this.getSeguinte().verificar(mail);
            }
        }
    }


}
