package MesaDeTrabalho;

public class Vazio implements Estado{
    Carrinho c;

    public Vazio(Carrinho c) {
        this.c = c;
        System.out.println("Carrinho Vazio!");
    }

    //Métodos
    //Métodos
    public void adicionarProduto(Produto produto){
        System.out.println("O carrinho está vazio. Adicione seus produtos!");
        this.avancar();
    }

    public void cancelar(){
        //Não tem mudança
    }

    public void voltar(){
        //Não tem mudança
    }

    public void avancar(){
        this.c.setEstado(new Carregando(c));
    }

}
