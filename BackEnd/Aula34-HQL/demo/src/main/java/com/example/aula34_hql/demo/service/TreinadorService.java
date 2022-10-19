package com.example.aula34_hql.demo.service;

import com.example.aula34_hql.demo.model.TreinadorModel;
import com.example.aula34_hql.demo.repository.TreinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TreinadorService {

    private TreinadorRepository treinadorRepository;

    @Autowired
    public TreinadorService(TreinadorRepository treinadorRepository){
        this.treinadorRepository= treinadorRepository;
    }

    public List<TreinadorModel> buscarTodos(){
        return treinadorRepository.findAll();
    }

    public Optional<TreinadorModel> buscaPorIdade(Integer idade){
        return treinadorRepository.findTreinadorByIdade(idade);
    }
}
