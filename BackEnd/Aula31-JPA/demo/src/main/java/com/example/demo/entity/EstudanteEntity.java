package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EstudanteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String codEstudante, nome, sobrenome;

    public EstudanteEntity(Long id, String codEstudante, String nome, String sobrenome) {
        this.id = id;
        this.codEstudante = codEstudante;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public EstudanteEntity(String codEstudante, String nome, String sobrenome) {
        this.codEstudante = codEstudante;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public EstudanteEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodEstudante() {
        return codEstudante;
    }

    public void setCodEstudante(String codEstudante) {
        this.codEstudante = codEstudante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
