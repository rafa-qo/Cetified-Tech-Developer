package MesaDeTrabalho;

public class GerenciadorLote extends Gerenciador{

    @Override
    public void verificar(Produto p) {
        if ((p.getLote() < 1000 || p.getLote() > 2000))
        {
            System.out.println("Lote Rejeitado!");
        } else {
            if(this.getSeguinte() != null){
                this.getSeguinte().verificar(p);
            }
        }
    }
}
