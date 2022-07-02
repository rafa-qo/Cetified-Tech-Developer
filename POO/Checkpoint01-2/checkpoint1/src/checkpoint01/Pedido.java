package checkpoint01;

public class Pedido{
    private Produto produtos;
    private int noPedido;


    // Construtor
    public Pedido(int noPedido, Produto produtos) {
        this.noPedido = noPedido;

    }

    // Getters e Setters
    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }

    public int getNoPedido() {
        return noPedido;
    }

    public void setNoPedido(int noPedido) {
        this.noPedido = noPedido;
    }
}
