package Aula04;

public class ProcessaMail {

    public static void main(String[] args) {
        CheckMail processo = new CheckMail();

        processo.verificar(new Mail("email@email.com","tecnica@colmeia.com","Tá tudo dando errado!"));
        processo.verificar(new Mail("email@email.com","roliveira@colmeia.com","Gerência"));
        processo.verificar(new Mail("email@email.com","comercial@colmeia.com","Proposta Comercial!"));
        processo.verificar(new Mail("email@email.com","tecnica@comeia.com","Tá tudo dando errado!"));
        

    }
}
