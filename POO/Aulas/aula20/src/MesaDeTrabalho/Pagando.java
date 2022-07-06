package MesaDeTrabalho;

import java.util.ArrayList;

public class Pagando implements Estado{

    Carrinho c;

    //Construtor
    public Pagando(Carrinho c) {
        this.c = c;
        System.out.println("Pronto para pagar!");
    }

    //Métodos
    public void adicionarProduto(ArrayList<Produto> listaProdutos){
        System.out.println("Não é possível adicionar produtos. Volte para a etapa anterior.");
    }

    public void cancelar(){
        // Sem mudanças
    }

    public void voltar(){
        // Sem mudanças
    }

    public void avancar(){
        // Sem mudanças
    }
}
