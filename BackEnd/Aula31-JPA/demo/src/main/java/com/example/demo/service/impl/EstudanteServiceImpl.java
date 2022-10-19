package com.example.demo.service.impl;

import com.example.demo.entity.EstudanteEntity;
import com.example.demo.repository.IEstudanteRepository;
import com.example.demo.service.IEstudanteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteServiceImpl implements IEstudanteService<EstudanteEntity> {
    private final IEstudanteRepository estudanteRepository;

    public EstudanteServiceImpl(IEstudanteRepository estudanteRepository){
        this.estudanteRepository = estudanteRepository;
    }


    @Override
    public List<EstudanteEntity> findAllStudents(){
        return estudanteRepository.findAll();
    }

    @Override
    public Optional<EstudanteEntity> findStudentsById(Long id) {
        return estudanteRepository.findById(id);
    }

    @Override
    public EstudanteEntity addStudent(EstudanteEntity estudanteEntity){
        if (estudanteEntity != null){
            return (EstudanteEntity) estudanteRepository.save(estudanteEntity);
        }
        return new EstudanteEntity();
    }

    @Override
    public String deleteStudent(Long id) {
        if (estudanteRepository.findById(id).isPresent()){
            estudanteRepository.deleteById(id);
            return "Estudante deletado";
        }
        return "Estudante não encontrado";
    }

    @Override
    public String updateStudent(EstudanteEntity estudanteEntity) {
        if (estudanteEntity != null && estudanteRepository.findById(estudanteEntity.getId()).isPresent()){
            estudanteRepository.saveAndFlush(estudanteEntity);
            return "Estudante atualizado";
        }
        return "Não foi possível atualizar o estudante!";
    }

}
