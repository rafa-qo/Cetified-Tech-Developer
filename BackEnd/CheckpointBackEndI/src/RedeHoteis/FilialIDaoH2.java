package RedeHoteis;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class FilialIDaoH2 implements IDao<Filial>{
    private ConfigJDBC configJDBC;

    final static Logger log = Logger.getLogger(String.valueOf(FilialIDaoH2.class));

    public FilialIDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    };

    @Override
    public Filial salvar(Filial filial) throws SQLException {
        log.info("Gravando a filial " + filial.toString());
        Connection connection = configJDBC.conectarComBD();
        Statement statement = null;

        String query = String.format("INSERT INTO redehoteis (nomeFilial, rua, numero, cidade, estado, cincoEstrelas) values ('%s', '%s', %d,'%s','%s', %d)",
                filial.getNomeFilial(), filial.getRua(), filial.getNumero(), filial.getCidade(), filial.getEstado(), filial.getCincoEstrelas());

        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if(keys.next()){
                filial.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
