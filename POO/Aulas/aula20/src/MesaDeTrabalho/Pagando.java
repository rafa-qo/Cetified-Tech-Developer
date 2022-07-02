package MesaDeTrabalho;

public class Pagando implements Estado{

    Carrinho c;

    //Construtor
    public Pagando(Carrinho c) {
        this.c = c;
        System.out.println("Pronto para pagar!");
    }

    //Métodos
    public void adicionarProduto(Produto produto){
        //Sem mudança
    }

    public void cancelar(){
        this.c.setEstado(new Vazio(c));
    }

    public void voltar(){
        this.c.setEstado(new Carregando(c));
    }

    public void avancar(){
        c.setEstado(new Fechado(c));
    }
}
