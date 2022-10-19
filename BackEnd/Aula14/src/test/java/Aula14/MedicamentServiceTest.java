package Aula14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class MedicamentServiceTest {

    MedicamentoService medicamentoService;

    @BeforeEach
    void doBefore(){
        medicamentoService = new MedicamentoService(new MedicamentoDaoH2(new ConfigJDBC()));

    }

    @Test
    public void guardarMedicamento(){
        Medicamento medicamento = new Medicamento("Ibuprofeno", "Aché", 35,3.5);
        medicamentoService.salvar(medicamento);
        assertTrue(medicamento.getId()!=null);

        Medicamento medicamento1 = new Medicamento("Tylenol", "EMS", 246,7.5);
        medicamentoService.salvar(medicamento1);
        assertTrue(medicamento1.getId()!=null);
    }

}
