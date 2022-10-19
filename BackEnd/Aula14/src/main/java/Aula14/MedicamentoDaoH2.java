package Aula14;

import jdk.jfr.Experimental;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class MedicamentoDaoH2 implements IDao<Medicamento>{

    private ConfigJDBC configJDBC;

    final static Logger log = Logger.getLogger(String.valueOf(MedicamentoDaoH2.class));

    public MedicamentoDaoH2(ConfigJDBC configJDBC){
        this.configJDBC = configJDBC;
    }


    @Override
    public Medicamento salvar(Medicamento medicamento) {
        log.info("Registrando um novo medicamento: "+ medicamento.toString());
        Connection connection = configJDBC.conectarComBD();

        Statement statement = null;
        String query = String.format("INSERT INTO medicamentos(nome,lab,qtde,preco) values ('%s','%s','%s','%s')",
                medicamento.getNome(),medicamento.getLab(), medicamento.getQtde(), medicamento.getPreco());

        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

                if (keys.next()){
                    medicamento.setId(keys.getInt(1));
                    statement.close();
                    connection.close();
                }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medicamento;
    }

    @Override
    public Medicamento buscar(int id) {
        log.info("Buscando medicamento pelo ID "+ id);
        Connection connection = configJDBC.conectarComBD();
        Statement statement = null;

        String query = String.format("SELECT id,nome,lab,qtde,preco FROM medicamentos WHERE id='%s", id);

        Medicamento medicamento = null;

        try{
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                medicamento = new Medicamento(resultSet.getInt("id"),
                resultSet.getString("nome"), resultSet.getString("lab"),
                resultSet.getInt("qtde"), resultSet.getDouble("preco"));
            }
            statement.close();
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return medicamento;

    }
}
