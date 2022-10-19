package Aula02;

public abstract class Funcionario {

    private String nome, sobrenome, noConta;

    public Funcionario(String nome, String sobrenome, String noConta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.noConta = noConta;
    }

    //Métodos
    public void pagamentoSalario(){
        double valor;
        valor = calcularSaldo();
        imprimirRecibo(valor);
        depositar(valor);
    }

    public abstract double calcularSaldo();

    public abstract void imprimirRecibo(double valor);

    public abstract void depositar(double valor);

    //Getters e Setters
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

    public String getNoConta() {
        return noConta;
    }

    public void setNoConta(String noConta) {
        this.noConta = noConta;
    }
}
