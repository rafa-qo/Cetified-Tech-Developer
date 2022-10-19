package Aula02;

public class Contratado extends Funcionario{

    private double valorHora;
    private int qtdeHoras;

    public Contratado(String nome, String sobrenome, String noConta, double valorHora, int qtdeHoras) {
        super(nome, sobrenome, noConta);
        this.valorHora = valorHora;
        this.qtdeHoras = qtdeHoras;
    }

    @Override
    public double calcularSaldo() {
        return valorHora * qtdeHoras;
    }

    @Override
    public void imprimirRecibo(double valor) {
        System.out.println("Gerado o recibo do funcionário contratado!");
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Foi depositado o valor de R$ "+valor);
    }
}
