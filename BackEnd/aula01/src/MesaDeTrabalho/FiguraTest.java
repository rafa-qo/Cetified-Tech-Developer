package MesaDeTrabalho;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FiguraTest {


    @Test
    void calcularRaio(){
        Circulo c1 = new Circulo(2.0);
        Quadrado q1 = new Quadrado(5.4);
        Quadrado q2 = new Quadrado(0);

        c1.calcularPerimetro();
        q1.calcularPerimetro();
        q2.calcularPerimetro();

        System.out.println("Perimetro do círculo: "+c1.calcularPerimetro());
        System.out.println("Perimetro do quadrado: "+q1.calcularPerimetro());
        System.out.println("Perimetro do círculo: "+q2.calcularPerimetro());

    }
}
