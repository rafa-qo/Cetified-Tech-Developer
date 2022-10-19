package MesaDeTrabalho;

public class CheckQuality {

    Gerenciador inicial;

    public CheckQuality(){
        this.inicial = new GerenciadorLote();
        Gerenciador peso = new GerenciadorPeso();
        Gerenciador embalagem = new GerenciadorEmbalagem();
        Gerenciador aceito = new GerenciadorAceito();

        inicial.setSeguinte(peso);
        peso.setSeguinte(embalagem);
        embalagem.setSeguinte(aceito);

    }

    public void verificar(Produto p){
        inicial.verificar(p);
    }
}
