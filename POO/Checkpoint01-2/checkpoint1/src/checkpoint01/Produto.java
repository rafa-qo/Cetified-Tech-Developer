package checkpoint01;

public class Produto {
    private String nomeProduto;
    private Double idProduto;
    private static Double valorProduto;

    // Construtor
    public Produto(String nomeProduto, Double idProduto, double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.idProduto = idProduto;
        this.valorProduto = valorProduto;
    }

    // Getters e Setters
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Double idProduto) {
        this.idProduto = idProduto;
    }

    public static Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }


}
