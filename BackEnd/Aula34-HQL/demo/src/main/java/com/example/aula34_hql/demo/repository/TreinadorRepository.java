package com.example.aula34_hql.demo.repository;

import com.example.aula34_hql.demo.model.TreinadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TreinadorRepository extends JpaRepository<TreinadorModel, Long> {

    @Query("SELECT Treinador t FROM Treinador WHERE t.idade = ?1")
    Optional<TreinadorModel> findTreinadorByIdade(Integer idade);
}
