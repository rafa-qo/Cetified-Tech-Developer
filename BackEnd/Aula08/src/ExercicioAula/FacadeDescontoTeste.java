package ExercicioAula;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacadeDescontoTeste {

    private FacadeDesconto facadeDesconto = new FacadeDesconto();
    private Cartao cartao;
    private Produto produto;

    @BeforeEach
    void doBerofe(){
        cartao = new Cartao("Star Bank", "1234123456785678");
        produto = new Produto("Ervilha", "Lata");
    }

    @Test
    void validarDescontoBancoTest(){
        produto.setTipo("enlatado");

        int desconto = facadeDesconto.desconto(cartao, produto, 1);
        assertEquals(20,desconto);
    }

    @Test
    void validarDescontoProdutoTest(){
        cartao.setBanco("Outro Banco");

        int desconto = facadeDesconto.desconto(cartao, produto, 1);
        assertEquals(10,desconto);
    }

    @Test
    void validarDescontoQuantidadeTest(){
        produto.setTipo("Enlatado");
        cartao.setBanco("Outro Banco");

        int desconto = facadeDesconto.desconto(cartao, produto, 13);
        assertEquals(15,desconto);
    }

    @Test
    void validarDescontoTotalTest(){

        int desconto = facadeDesconto.desconto(cartao, produto, 13);
        assertEquals(45,desconto);

    }
}
