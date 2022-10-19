package MesaIntegradora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VendedorTest {

    Funcionario f1, f2;
    Afiliado afi1, afi2, afi3;

    @BeforeEach
    public void doBefore(){
        f1 = new Funcionario("Pedro", 4);
        f1.vender(2);
        f2 = new Funcionario("Julia", 7);
        f2.vender(8);

        afi1 = new Afiliado("João");
        afi1.vender(4);
        afi2 = new Afiliado("Joana");
        afi2.vender(5);
        afi3 = new Afiliado("Paula");

        f1.addAfiliado(afi1);
        f1.addAfiliado(afi2);
        f2.addAfiliado(afi3);
    }

    @Test
    public void mostrarVendedores(){
        System.out.println(f1.mostrarCategoria());
        System.out.println(f2.mostrarCategoria());
        System.out.println(afi1.mostrarCategoria());
        System.out.println(afi2.mostrarCategoria());
        System.out.println(afi3.mostrarCategoria());
    }

}
