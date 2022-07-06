package MesaDeTrabalho;

import java.util.ArrayList;

public class Carrinho {

    private Estado estado;

    ArrayList<Produto> listaProdutos = new ArrayList<>();

    //Construtor
    public Carrinho() {
        this.estado = new Vazio(this);
    }

    //Métodos
    public void adicionarProduto(Produto produto){
        this.listaProdutos.add(produto);
        getEstado().adicionarProduto(listaProdutos);
    }

    public void cancelar(){
        getEstado().cancelar();
        this.listaProdutos.clear();
        //this.listaProdutos.removeAll(listaProdutos);
    }

    public void voltar(){
        getEstado().voltar();
    }

    public void avancar(){
        System.out.println("Você avançou!");
        getEstado().avancar();
    }

    public void mostrarProduto(){
        for (Produto p: listaProdutos){
            System.out.println("Descrição: " + p.getDescricao() + "\n" +
                    "Preço: R$ " + p.getPreco());
        }
    }

    //Getters e Setters
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


}
