package checkpoint01;

public class Main {

    public static void main(String[] args) {
        Cliente client1 = new Cliente("Rafa Queiroz", "rafa.qo@gmail.com","19997454353", "327.333.345-00");
        System.out.println("Nome do Cliente: " + client1.getNomeCompleto());
        System.out.println("E-mail do Cliente: " + client1.getEmail());
        System.out.println("Celular do Cliente: " + client1.getCelular());
        System.out.println("CPF do Cliente: " + client1.getCPF());

        Produto cocaCola = new Produto("Coca-cola", 345.0, 6.5d);
        System.out.println("Produto: " + cocaCola.getNomeProduto());
        System.out.println("Valor: R$" + cocaCola.getValorProduto());

        Produto burger = new Produto("Hamburger", 332.0, 17.0d);
        System.out.println("Produto: " + burger.getNomeProduto());
        System.out.println("Valor: R$" + burger.getValorProduto());

        Produto fritas = new Produto("Batata Frita", 303.0, 12.5d);
        System.out.println("Produto: " + fritas.getNomeProduto());
        System.out.println("Valor: R$" + fritas.getValorProduto());

        Pedido pedido1 = new Pedido(456, cocaCola);
        System.out.println("Número do pedido: " + pedido1.getNoPedido());

        Pedido pedido2 = new Pedido(426, burger);
        System.out.println("Número do pedido: " + pedido2.getNoPedido());

        Pedido pedido3 = new Pedido(421, fritas);
        System.out.println("Número do pedido: " + pedido3.getNoPedido());

        NotaFiscal nf1 = new NotaFiscal(pedido1.getNoPedido(), cocaCola,"333");
        System.out.println("Número da NF: " + nf1.getNoNF());
        System.out.println("Número do pedido: " + nf1.getNoPedido());

        NotaFiscal nf2 = new NotaFiscal(pedido2.getNoPedido(), burger,"233");
        System.out.println("Número da NF: " + nf1.getNoNF());
        System.out.println("Número do pedido: " + nf1.getNoPedido());

        NotaFiscal nf3 = new NotaFiscal(pedido3.getNoPedido(), cocaCola,"333");
        System.out.println("Número da NF: " + nf1.getNoNF());
        System.out.println("Número do pedido: " + nf1.getNoPedido());
    }
}
