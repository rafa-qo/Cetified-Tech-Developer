package com.example.consultorioMVC.dao;

import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@AllArgsConstructor
public class ConfigJDBC {

    private String jdbcDriver;
    private String dbUrl;
    private String usuario;
    private String senha;

    public Connection getConnection(){

        Connection connection = null;

        try{
            Class.forName(this.jdbcDriver);
            connection = DriverManager.getConnection(this.dbUrl, this.usuario, this.senha);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
