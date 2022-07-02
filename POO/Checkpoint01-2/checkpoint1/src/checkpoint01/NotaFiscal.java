package checkpoint01;

public class NotaFiscal extends Pedido{
    private String noNF;
    private Produto produtos;

    // Construtor
    public NotaFiscal(int noPedido, Produto produtos, String noNF) {
        super(noPedido, produtos);
        this.noNF = noNF;
    }

    // Getters e Setters
    public String getNoNF() {
        return noNF;
    }

    public void setNoNF(String noNF) {
        this.noNF = noNF;
    }

    // Métodos
    public void descCliente(Cliente CPF){
        String cpfCliente = Cliente.getCPF();
//        if(cpfCliente != null) {
//            Double valorComDescCliente = Pedido.valorPedido() * 0.9;
//        } else {
//            Pedido.valorPedido();
//        }
    }
}
