package MesaTrabalho;

import java.util.ArrayList;

public class Armazem {
    private String nome;

    ArrayList <Produto> listaProdutos = new ArrayList<>();

    public Armazem(String nome) {
        this.nome = nome;
    }

    public double calcularEspacoNecessario(){
        double total = 0.0;
        for(Produto produto: listaProdutos){
           total += produto.calcularEspaco();
        }
        return total;
    }

    public void addProduto(Produto produto){
        listaProdutos.add(produto);
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
