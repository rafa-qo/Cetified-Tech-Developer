package RedeHoteis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class FilialServiceTest {

    FilialService filialService;

    @BeforeEach
    void doBefore() {
        filialService = new FilialService(new FilialIDaoH2(new ConfigJDBC()));
    }

    @Test
    public void guardarFilial() throws SQLException {
        Filial filial = new Filial("Radisson Hotel", "Rua São João", 355, "São Paulo", "SP", 1);
        Filial filial2 = new Filial("Radisson Avenida Paulista", "Rua Rafael Queiroz", 234, "São Paulo", "SP", 0);
        Filial filial3 = new Filial("Radisson Higienópolis", "Rua Pedro Oliveira", 1564, "São Paulo", "SP", 1);
        Filial filial4 = new Filial("Radisson Ipiranga", "Avenida Ipiranga", 908, "São Paulo", "SP", 0);
        Filial filial5 = new Filial("Radisson Jardins", "Rua Oscar Freire", 765, "São Paulo", "SP", 1);

        filialService.salvar(filial);
        assertTrue(filial.getId()!=null);

        filialService.salvar(filial2);
        assertTrue(filial.getId()!=null);

        filialService.salvar(filial3);
        assertEquals(1, filial3.getCincoEstrelas());

        filialService.salvar(filial4);
        assertTrue(filial4.getId()!=null);


        filialService.salvar(filial5);
        assertTrue(filial5.getId()!=null);

    }
}