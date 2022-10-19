package MesaDeTrabalho;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ClienteServiceTest {

    ClienteService clienteService;

    @BeforeEach
    void doBefore(){
        clienteService = new ClienteService(new ClinicaDaoH2(new ConfigJDBC()));
    }

    @Test
    public void guardarPacienteEndereco() throws SQLException {
        Endereco endereco = new Endereco("SMLN Trecho 7", "4", "Lago", "Brasilia");
        Paciente paciente = new Paciente("Marcelo", "Barbosa", "1098393", "10/08/2022", endereco);

        clienteService.salvar(paciente);
        assertTrue(paciente.getId()!=null);


        Endereco endereco2 = new Endereco("Avenida Brasil", "344", "Centro", "São Paulo");
        Paciente paciente2 = new Paciente("Carolina", "Alves", "BR273738", "25/03/2022", endereco2);

        clienteService.salvar(paciente2);
        assertTrue(paciente2.getId()!=null);

        Endereco endereco3 = new Endereco("Rua das Flores", "67", "Jardim", "Maringá");
        Paciente paciente3 = new Paciente("Rosa", "Gomes", "97808", "03/08/2022", endereco3);

        clienteService.salvar(paciente3);
        assertTrue(paciente3.getId()!=null);

        clienteService.buscarTodos();

        clienteService.excluir(paciente3.getId());
        clienteService.buscar(paciente3.getId());

        clienteService.buscarTodos();
    }

}