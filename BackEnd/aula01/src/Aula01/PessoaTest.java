package Aula01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PessoaTest {

    Pessoa p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;

    List<String> colecao = new ArrayList<String>();

    @BeforeEach
    void doBefore(){
        p1 = new Pessoa("Ivo", "Ganda");
        p1.setIdade(LocalDate.of(2016, 3, 23));

        p2 = new Pessoa("Ana", "Musk");
        p2.setIdade(LocalDate.of(1966, 6, 12));

        p3 = new Pessoa("Rodolfo", "Riboldi");
        p3.setIdade(LocalDate.of(1992, 6, 8));

        p4 = new Pessoa("Rafa", "Queiroz");
        p4.setIdade(LocalDate.of(1985, 11, 6));

        p5 = new Pessoa("Tato", "Dal Molin");
        p5.setIdade(LocalDate.of(1988, 3, 26));

        p6 = new Pessoa("Julia", "Beat");
        p6.setIdade(LocalDate.of(1997, 9, 11));

        p7 = new Pessoa("Cristiane", "Souza");
        p7.setIdade(LocalDate.of(1950, 3, 21));

        p8 = new Pessoa("John", "Silva");
        p8.setIdade(LocalDate.of(2015, 12, 31));

        p9 = new Pessoa("Gabriela", "Riboldi");
        p9.setIdade(LocalDate.of(2004, 01, 13));

        p10 = new Pessoa("Renata", "Gomes");
        p10.setIdade(LocalDate.of(2005, 7, 6));
    }

    @Test
    void ImprimirObjetos(){
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());
        System.out.println(p9.toString());
        System.out.println(p10.toString());
    }

    @Test
    void addColecao(){
        p1.addNomes(p1);
        p2.addNomes(p2);
        p3.addNomes(p3);
        p4.addNomes(p4);
        p5.addNomes(p5);
        p6.addNomes(p6);
        p7.addNomes(p7);
        p8.addNomes(p8);
        p9.addNomes(p9);
        p10.addNomes(p10);
    }
}
