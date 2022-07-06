package MesaDeTrabalho;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Shampoo", 7.9f);
        Produto p2 = new Produto("Condicionador", 10.6f);
        Produto p3 = new Produto("Sabonete líquido", 5.7f);

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);

        carrinho.mostrarProduto();

        carrinho.avancar();
        carrinho.avancar();

        carrinho.voltar();

    }
}
