package checkpoin01;

public class Pedidos{
    private static Integer qtde;
    private Integer idPedido;

    // Construtor
    public Pedidos(Integer qtde, Integer idPedido) {
        this.qtde = qtde;
        this.idPedido = idPedido;
    };


    // Getters e Setters
    public static Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }


};