package Aula05;

import java.util.Date;

public class ServicoVacinaProxy implements Vacinar{

    @Override
    public void vacinarPessoa(String rg, Date dataVacina, String tipoVacina) {
        if (dataVacina.before(new Date())){
            ServicoVacinar vacinar = new ServicoVacinar();
            vacinar.vacinarPessoa(rg, dataVacina, tipoVacina);
            System.out.println("Cidadão(ã) vacinado(a) com sucesso!");
        } else {
            System.out.println("Data de hoje é anterior à data marcada.");
        }
    }
}
