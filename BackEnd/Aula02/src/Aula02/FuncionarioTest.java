package Aula02;

import org.junit.jupiter.api.Test;

public class FuncionarioTest {
    @Test
    void calculos(){
        Funcionario f1 = new Efetivo("Lucas","Silva","49503",10000d, 700d, 1200d);
        f1.pagamentoSalario();
        Funcionario f2 = new Contratado("Rafael", "Oliveira", "4820205", 400d,172);
        f2.pagamentoSalario();


    }

}
