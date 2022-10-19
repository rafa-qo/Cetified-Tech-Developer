package com.example.consultorioMVC.service;

import com.example.consultorioMVC.dao.Idao;
import com.example.consultorioMVC.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    Idao<Produto> produtoIdaoH2;

    public Produto salvar(Produto p) throws SQLException{
        return produtoIdaoH2.salvar(p);
    }

    public List<Produto> buscarTodos() throws SQLException{
        return produtoIdaoH2.buscarTodos();
    }

    public void alterar(Produto p) throws SQLException{
        produtoIdaoH2.alterar(p);
    }

    public void excluir(int id) throws SQLException{
        produtoIdaoH2.excluir(id);
    }

    public Optional<Produto> buscarPorId(int id) throws SQLException{
        return produtoIdaoH2.buscarPorId(id);
    }

}
