package MesaDeTrabalho;

import Aula04.Mail;

public class GerenciadorAceito extends Gerenciador{

    @Override
    public void verificar(Produto p) {
            System.out.println("Produto Aceito!");
    }
}