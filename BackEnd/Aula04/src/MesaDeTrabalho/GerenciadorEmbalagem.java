package MesaDeTrabalho;

public class GerenciadorEmbalagem extends Gerenciador{

    @Override
    public void verificar(Produto p) {
        if((!(p.getEmbalagem()).equalsIgnoreCase("saudável")) || (!(p.getEmbalagem()).equalsIgnoreCase("quase saudável"))){
            System.out.println("Embalagem rejeitada!");
        } else {
            if(this.getSeguinte() != null){
                this.getSeguinte().verificar(p);
            }
        }
    }
}
