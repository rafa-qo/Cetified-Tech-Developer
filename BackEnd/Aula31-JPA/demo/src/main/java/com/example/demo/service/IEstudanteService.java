package com.example.demo.service;

import com.example.demo.entity.EstudanteEntity;

import java.util.List;
import java.util.Optional;

public interface IEstudanteService<T> {

    public List<T> findAllStudents();
    public Optional<T> findStudentsById(Long id);
    public  T addStudent(T t);
    public String deleteStudent(Long id);
    public String updateStudent(T t);



}
