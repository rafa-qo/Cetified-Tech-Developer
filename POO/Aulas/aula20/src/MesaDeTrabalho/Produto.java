package MesaDeTrabalho;

public class Produto {

    private String descricao;
    private float preco;

    // construtor
    public Produto(String descricao, float preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    //getters e setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
