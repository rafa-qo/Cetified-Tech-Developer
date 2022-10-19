package Aula05;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class PessoaTest {

    Date data = new Date();

    @Test
    public void vacinar(){
        Pessoa p1 = new Pessoa("Juca", "Silva", "554432345","Pfizer", data);
        Vacinar vacinar = new ServicoVacinaProxy();

        vacinar.vacinarPessoa(p1.getRg(), p1.getDataVacina(), p1.getTipoVacina());
        System.out.println(p1.toString());

    }
}
