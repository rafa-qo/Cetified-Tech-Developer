package Aula02;

public class Efetivo extends Funcionario{

    private double salarioBase, descontos, bonificacoes;

    public Efetivo(String nome, String sobrenome, String noConta, double salarioBase, double descontos, double bonificacoes) {
        super(nome, sobrenome, noConta);
        this.salarioBase = salarioBase;
        this.descontos = descontos;
        this.bonificacoes = bonificacoes;
    }

    @Override
    public double calcularSaldo() {
        return (salarioBase + bonificacoes) - descontos;
    }

    @Override
    public void imprimirRecibo(double valor) {
        System.out.println("Gerado o recibo do funcionário efetivo!");
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Foi depositado o valor de R$ "+valor);
    }
}
