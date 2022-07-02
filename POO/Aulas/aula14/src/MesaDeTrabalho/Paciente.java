package MesaDeTrabalho;

import java.util.Date;

public class Paciente {
    private String nome, sobrenome, RG;
    private Date dataInternacao, dataAlta;

    //construtor
    public Paciente(String nome, String sobrenome, String RG, Date dataInternacao) throws PacienteExceptions{

        Date hoje = new Date();

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = RG;
        if (dataInternacao.before(hoje)){
            throw new PacienteExceptions("Data de internação retroativa não é aceita. Favor inserir uma data posterior a" + hoje);
        } else {
            this.dataInternacao = dataInternacao;
        }
        this.dataAlta=null;
    }

    //métodos
    public void darAlta(Date dataAlta) throws PacienteExceptions {
        if (dataAlta.after(dataInternacao)) {
            System.out.println("Alta liberada!");
        }
        else {
            throw new PacienteExceptions("Data de alta não permitida. Favor inserir data posterior à data de internação");
        }
    }

    //getters e setters
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

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Date getDataInternacao() {
        return dataInternacao;
    }

    public void setDataInternacao(Date dataInternacao) {
        this.dataInternacao = dataInternacao;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }
}
