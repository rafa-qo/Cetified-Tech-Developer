package checkpoin01;

public class objetosCheckpoint {
    public static void main(String[] args) {
        NotaFiscal NF1 = new NotaFiscal("João",12345);
        Produtos prato1 = new Produtos(35, 35, 13,"Strogonoff");
        Pedidos pedido1 = new Pedidos(3,134);
        Clientes cliente1 = new Clientes("Rafael Oliveira","rafa.qo@gmail.com", 32643647,1999999999);

        System.out.println("Nome do Cliente: " + cliente1.getNomeCompleto());
        System.out.println("Nome do prato: " + prato1.getNomeProduto());
        System.out.println("Quantidade: " + pedido1.getQtde());
        System.out.println("Nome do garçom que atendeu: " + NF1.getNomeGarcom());
    }
}
