package Aula14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigJDBC {

    private String jdbcDrive;
    private String dbURL;
    private String nomeUsuario;
    private String senha;

    public ConfigJDBC(String jdbcDrive, String dbURL, String nomeUsuario, String senha) {
        this.jdbcDrive = jdbcDrive;
        this.dbURL = dbURL;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public ConfigJDBC() {
        this.jdbcDrive = "org.h2.Driver";
        this.dbURL = "jdbc:h2:mem:medicamentos;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'";
        this.nomeUsuario = "sa";
        this.senha = "";
    }

    public Connection conectarComBD(){
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(dbURL, nomeUsuario, senha);
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return connection;
    }

}
