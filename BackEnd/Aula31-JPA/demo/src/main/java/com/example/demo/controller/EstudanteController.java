package com.example.demo.controller;

import com.example.demo.entity.EstudanteEntity;
import com.example.demo.service.impl.EstudanteServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstudanteController {

    private final EstudanteServiceImpl estudanteService;

    public EstudanteController (EstudanteServiceImpl estudanteService){
        this.estudanteService = estudanteService;
    }

    @GetMapping("/estudantes")
    public List<EstudanteEntity> buscarTodosEstudantes(){
        return estudanteService.findAllStudents();
    }

    @GetMapping("/estudantes/{id}")
    public Optional<EstudanteEntity> buscarEstudantePorId(@PathVariable Long id){
        return estudanteService.findStudentsById(id);
    }

    @PostMapping("/estudante/adicionar")
    public EstudanteEntity adicionarEstudante(@RequestBody EstudanteEntity estudanteEntity){
        return estudanteService.addStudent(estudanteEntity);
    }

    @DeleteMapping("estudante/deletar/{id}")
    public String deleteEstudante(@PathVariable Long id){
        estudanteService.deleteStudent(id);
        return "Estudante deletado";
    }

    @PutMapping("estudante/atualizar")
    public String atualizarEstudante(@RequestBody EstudanteEntity estudanteEntity){
        estudanteService.updateStudent(estudanteEntity);
        return "Estudante atualizado!";
    }

}
