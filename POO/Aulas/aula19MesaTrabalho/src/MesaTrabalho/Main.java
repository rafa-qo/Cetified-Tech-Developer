package MesaTrabalho;

public class Main {

    public static void main(String[] args) {
        Armazem armazem = new Armazem("Armazém do seu João");

        CaixaFactoryESingleton produto = CaixaFactoryESingleton.getInstance();

        armazem.addProduto(produto.criarProduto("CAIXA10X10"));
        armazem.addProduto(produto.criarProduto("FUTEBOL"));
        armazem.addProduto(produto.criarProduto("BOLATENIS"));
        armazem.addProduto(produto.criarProduto("CAIXA10X10"));
        armazem.addProduto(produto.criarProduto("FUTEBOL"));
        armazem.addProduto(produto.criarProduto("BOLATENIS"));

        armazem.calcularEspacoNecessario();
        System.out.println("O espaço necessário total é de: " + armazem.calcularEspacoNecessario());
    }
}
