package Aula05;

import java.util.Date;

public class Pessoa {
    String nome, sobrenome, rg, tipoVacina;
    Date dataVacina;

    public Pessoa(String nome, String sobrenome, String rg, String tipoVacina, Date dataVacina) {
        this.nome = nome;
        this.sobrenome = nome;
        this.rg = rg;
        this.tipoVacina = tipoVacina;
        this.dataVacina = dataVacina;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTipoVacina() {
        return tipoVacina;
    }

    public void setTipoVacina(String tipoVacina) {
        this.tipoVacina = tipoVacina;
    }

    public Date getDataVacina() {
        return dataVacina;
    }

    public void setDataVacina(Date dataVacina) {
        this.dataVacina = dataVacina;
    }
}
