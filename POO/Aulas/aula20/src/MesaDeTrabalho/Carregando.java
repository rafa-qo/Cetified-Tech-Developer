package MesaDeTrabalho;

import java.util.ArrayList;

public class Carregando implements Estado{

    Carrinho c;

    public Carregando(Carrinho c) {
        this.c = c;
        System.out.println("Carregando o carrinho");
    }

    //Métodos
    public void adicionarProduto(ArrayList<Produto> listaProdutos){
        c.setEstado(new Carregando(c));
        // TODO this.c.adicionarProduto();
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
