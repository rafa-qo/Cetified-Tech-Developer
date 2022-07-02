package checkpoin01;

public class Produtos extends NotaFiscal {
    private static Integer qtde;
    private Integer idPedido;

    public Pedidos (Integer qtde, Integer idPedido){
        this.qtde = qtde;
        this.idPedido = idPedido;
    };

    public static Integer valorPedido(Integer valor){
        Integer precoPrato = Pratos.getValorPrato();
        Integer valorPedidoTotal = precoPrato * qtde;
        return valorPedidoTotal;
    };
    
//    public void listaPratosPedidos (String lista){
//
//    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

};