package MesaDeTrabalho;

import java.util.ArrayList;

public class Vazio implements Estado{
    Carrinho c;

    public Vazio(Carrinho c) {
        this.c = c;
        System.out.println("Carrinho Vazio!");
    }

    //Métodos
    //Métodos
    public void adicionarProduto(ArrayList<Produto> listaProdutos){
        System.out.println("O carrinho está vazio. Adicione seus produtos!");
        this.avancar();
    }

    public void cancelar(){
        this.c.setEstado(new Vazio(c));
    }

    public void voltar(){
        //Não tem mudança
    }

    public void avancar(){
        this.c.setEstado(new Carregando(c));
    }

    //getters e setters
    public Carrinho getC() {
        return c;
    }

    public void setC(Carrinho c) {
        this.c = c;
    }
}
