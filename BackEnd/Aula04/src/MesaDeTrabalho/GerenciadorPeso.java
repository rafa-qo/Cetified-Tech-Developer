package MesaDeTrabalho;

public class GerenciadorPeso extends Gerenciador {

    @Override
    public void verificar(Produto p) {
        if ((p.getPeso() < 1200 || p.getPeso() > 1300))
        {
            System.out.println("Peso Rejeitado!");
        } else {
            if(this.getSeguinte() != null){
                this.getSeguinte().verificar(p);
            }
        }
    }
}
