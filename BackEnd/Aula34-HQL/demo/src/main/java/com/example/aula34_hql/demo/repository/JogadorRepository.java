package com.example.aula34_hql.demo.repository;

import com.example.aula34_hql.demo.model.JogadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface JogadorRepository extends JpaRepository<JogadorModel, Long> {

    @Query("SELECT Jogador j FROM Jogador WHERE j.nome = ?1") //?1 vai pegar o nome que vai passar no findJogadorByName
    Optional<JogadorModel> findJogadorByName(String name);


}
