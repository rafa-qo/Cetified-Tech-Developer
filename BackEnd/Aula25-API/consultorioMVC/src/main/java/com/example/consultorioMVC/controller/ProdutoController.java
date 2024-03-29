package com.example.consultorioMVC.controller;

import com.example.consultorioMVC.model.Produto;
import com.example.consultorioMVC.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    ProdutoService service;

    @PostMapping
    public Produto salvaProduto(@RequestBody Produto produto) throws SQLException{
        return service.salvar(produto);
    }

    @GetMapping
    public List<Produto> buscarTodos() throws SQLException{
        return service.buscarTodos();
    }

    @RequestMapping(value = "/buscaID")
    public Produto buscarPorId(@RequestParam("id") int id) throws SQLException {
        return service.buscarPorId(id).isEmpty() ? new Produto() : service.buscarPorId(id).get();
    }

//    @PatchMapping
//    public void alterar(@RequestBody Produto produto) throws SQLException {
//        System.out.println();
//        service.alterar(produto);
//    }

    @PutMapping
    public ResponseEntity<Produto> alterar(@RequestBody Produto produto) throws SQLException {
        ResponseEntity responseEntity = null;
        if (service.buscarPorId(produto.getId())==null){
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }

    @DeleteMapping
//    public void excluir(@RequestParam("id") int id) throws SQLException{
//        service.excluir(id);
//    }
    public ResponseEntity excluir(@PathVariable Integer id) throws SQLException{
        ResponseEntity responseEntity = null;
        if (service.buscarPorId(id)==null){
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            responseEntity = new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return responseEntity;
    }
}
