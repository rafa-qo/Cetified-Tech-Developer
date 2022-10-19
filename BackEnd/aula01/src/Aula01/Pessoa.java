package Aula01;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


public class Pessoa {

    private String nome, sobrenome;
    LocalDate idade;

    List<String> colecao = new ArrayList<String>();

    //Construtores
    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    //Métodos
    public List<String> addNomes(Pessoa p) {
        int var = p.getNome().length();
        int idade = p.Idade();
        if (var > 4 && idade >= 18){
            colecao.add(p.getNome());
            System.out.println(colecao);
        }

        return null;
    }

    public int Idade() {
        int idade = Period.between(this.idade, LocalDate.of(2022,8,01)).getYears();
        return idade;
    }


    // Getters e Setters
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

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
