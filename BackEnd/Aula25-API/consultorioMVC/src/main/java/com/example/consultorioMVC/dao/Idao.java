package com.example.consultorioMVC.dao;

import com.example.consultorioMVC.model.Produto;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface Idao<T> {

    Produto salvar(Produto produto) throws SQLException;
    public List<T> buscarTodos() throws SQLException;
    public void alterar (T t) throws SQLException;
    public Optional<T> buscarPorId (int id) throws SQLException;
    public void excluir(int id) throws SQLException;

}
