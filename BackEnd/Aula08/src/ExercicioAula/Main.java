package ExercicioAula;

public class Main {

    public static void main(String[] args) {
        FacadeDesconto facadeDesconto = new FacadeDesconto();

        Cartao cartao = new Cartao("Star Bank", "1234123456785678");
        Produto produto = new Produto("Ervilha", "Lata");

        System.out.println("Desconto 1: "+facadeDesconto.desconto(cartao, produto, 1));
        System.out.println("Desconto 2: "+facadeDesconto.desconto(cartao, produto, 12));

    }
}
