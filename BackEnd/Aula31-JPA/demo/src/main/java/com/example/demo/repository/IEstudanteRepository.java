package com.example.demo.repository;

import com.example.demo.entity.EstudanteEntity;
import com.example.demo.service.impl.EstudanteServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IEstudanteRepository extends JpaRepository<EstudanteEntity, Long> {


}
