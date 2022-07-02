package MesaDeTrabalho;

public class Fechado implements Estado {

    Carrinho c;

    //Construtor
    public Fechado(Carrinho c) {
        this.c = c;
    }

    //Métodos
    public void adicionarProduto(Produto produto){
        //Sem mudança
    }

    public void cancelar(){
        c.setEstado(new Vazio(c));
    }

    public void voltar(){
        this.c.setEstado(new Pagando(c));
    }

    public void avancar(){
        //Sem mudança
    }
}
