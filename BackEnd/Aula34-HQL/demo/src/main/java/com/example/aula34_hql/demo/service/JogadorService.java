package com.example.aula34_hql.demo.service;

import com.example.aula34_hql.demo.model.JogadorModel;
import com.example.aula34_hql.demo.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JogadorService {

    private JogadorRepository jogadorRepository;

    @Autowired
    public JogadorService(JogadorRepository jogadorRepository){
        this.jogadorRepository = jogadorRepository;
    }

    public List<JogadorModel> buscarTodos(){
        return jogadorRepository.findAll();
    }

    public JogadorModel buscarPorNome(String nome){
        return jogadorRepository.findJogadorByName(nome).get();
    }
}
