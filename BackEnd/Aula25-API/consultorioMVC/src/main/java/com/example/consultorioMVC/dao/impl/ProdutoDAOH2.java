package com.example.consultorioMVC.dao.impl;

import com.example.consultorioMVC.dao.ConfigJDBC;
import com.example.consultorioMVC.dao.Idao;
import com.example.consultorioMVC.model.Produto;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.LogManager.getLogger;


@Configuration
public class ProdutoDAOH2 implements Idao<Produto> {

    private ConfigJDBC configJDBC;

    final static Logger log = getLogger(ProdutoDAOH2.class);

    @Override
    public Produto salvar(Produto produto) throws SQLException {
        log.info("Abrindo Conexão");

        String SQLInsert = String.format("INSERT INTO produto (nomeProduto, valor)"+
                "VALUES ('%s','%s')", produto.getNomeProduto(), produto.getValor());

        Connection connection = null;

        try {
            log.info("Salvando o produto: "+produto.getNomeProduto());
            configJDBC = new ConfigJDBC("org.h2.Driver", "jdbc:h2:~/ecommerce;"+
                    "INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");
            connection = configJDBC.getConnection();

            Statement statement = (Statement) connection.createStatement();
            statement.execute(SQLInsert,Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();

            if (resultSet.next()){
                produto.setId(resultSet.getInt(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            log.info("Fechando a conexão");
            connection.close();
        }
        return produto;
    }

    @Override
    public List<Produto> buscarTodos() throws SQLException {
        log.debug("Abrindo Conexão com o Banco");
        Connection connection = null;
        Statement stmt = null;
        Produto produto = null;

        String query = String.format("SELECT * FROM produto where id = '%s'",
                produto.getNomeProduto(), produto.getValor());

        List<Produto> produtos = new ArrayList<>();

        try {
            configJDBC = new ConfigJDBC("org.h2.Driver", "jdbc:h2:~/ecommerce;" +
                    "INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");
            connection = configJDBC.getConnection();
            log.debug("Buscando todos os produtos");

            stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);

            while(resultSet.next()){
                produto = criarObjetoProduto(resultSet);
            }

        } catch (SQLException throwables){
            throwables.printStackTrace();
        } finally {
            log.debug("Fechando conexão");
            stmt.close();
        }

        return produtos;
    }

    @Override
    public void alterar(Produto produto) throws SQLException {

        String SQLUpdate = String.format("UPDATE produto set valor = '%s' where id = '%s';",
                produto.getValor(), produto.getId());
        Connection connection = null;

        try {
            log.info("Atualizando o valor do produto: "+produto.getNomeProduto());
            configJDBC = new ConfigJDBC("org.h2.Driver", "jdbc:h2:~/ecommerce;"+
                    "INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");
            connection = configJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQLUpdate);
        } catch (Exception e){
            e.printStackTrace();
            log.error("Erro ao alterar o produto: "+e.getMessage());
        } finally {
            log.info("Fechando Conexão");
            connection.close();
        }
    }

    @Override
    public Optional<Produto> buscarPorId(int id) throws SQLException {
        log.debug("Abrindo Conexão com o Banco");
        Connection connection = null;
        Statement stmt = null;

        String query = String.format("SELECT * FROM produto where id = %s", id);
        Produto produto = null;

        try {
            configJDBC = new ConfigJDBC("org.h2.Driver", "jdbc:h2:~/ecommerce;" +
                    "INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");
            connection = configJDBC.getConnection();
            log.debug("Buscando produto por id: " + id);

            stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);

            while(resultSet.next()){
                produto = criarObjetoProduto(resultSet);
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        } finally {
            log.debug("Fechando conexão");
            stmt.close();
        }
        return produto != null ? Optional.of(produto) : Optional.empty();
    }

    @Override
    public void excluir(int id) throws SQLException {
        log.info("Abrindo a conexão");
        Connection connection = null;
        Statement stmt = null;

        String SQLDelete = String.format("DELETE FROM produto where id = %s", id);

        try {

            configJDBC = new ConfigJDBC("org.h2.Driver", "jdbc:h2:~/ecommerce;" +
                    "INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");
            connection = configJDBC.getConnection();
            log.debug("Deletando produto: " + id);

            stmt = connection.createStatement();
            stmt.executeQuery(SQLDelete);

        } catch (SQLException throwables){
            throwables.printStackTrace();
        } finally {
            log.debug("Fechando conexão");
            connection.close();
        }
    }

    private Produto criarObjetoProduto(ResultSet resultSet) throws SQLException{
        Integer id = resultSet.getInt("ID");
        String nomeProduto = resultSet.getString("nomeProduto");
        double valor = resultSet.getDouble("valor");

        return new Produto(id, nomeProduto, valor);
    }
}
