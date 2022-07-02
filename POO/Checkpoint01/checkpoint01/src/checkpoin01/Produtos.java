package checkpoin01;



public class Produtos{
    private Integer idProduto;
    private static Integer valorProduto;
    private static String nomeProduto;

    // Construtor
    public Produtos(Integer idProduto, Integer valorProduto, String nomeProduto){
        this.idProduto = idProduto;
        this.valorProduto = valorProduto;
        this.nomeProduto = nomeProduto;
    };

    // Getters e Setters
    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public static Integer getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Integer valorProduto) {
        this.valorProduto = valorProduto;
    }

    public static String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    // Métodos
    public static Integer valorPedido(Integer valor) {
        valor = getValorProduto() * Pedidos.getQtde();
        return valor;
    }
}
