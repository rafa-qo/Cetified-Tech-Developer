package MesaDeTrabalho;

public class Carregando implements Estado{

    Carrinho c;

    public Carregando(Carrinho c) {
        this.c = c;
        System.out.println("Carregando o carrinho");
    }

    //Métodos
    public void adicionarProduto(Produto produto){
        this.c.adicionarProduto(produto);
    }

    public void cancelar(){
        this.voltar();
    }

    public void voltar(){
        this.c.setEstado(new Vazio(c));
    }

    public void avancar(){
        c.setEstado(new Pagando(c));
    }

}
