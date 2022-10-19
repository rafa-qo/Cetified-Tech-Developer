package com.example.aula34_hql.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Treinador")
public class TreinadorModel {

    @Id
    @SequenceGenerator(name = "treinador_sequence", sequenceName = "treinador_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
    private Long id;
    private String nome;
    private int idade;

    @OneToMany(mappedBy = "treinadorModel", fetch = FetchType.LAZY)
    private Set<JogadorModel> jogadores = new HashSet<JogadorModel>();

}
