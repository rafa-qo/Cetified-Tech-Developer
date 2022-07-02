package DesignPatternsFactory;

public class EmpregadoContratado extends Empregado{
    private double valorPorHora, imposto;

    //construtor

    public EmpregadoContratado() { }

    @Override
    public double calcularSalario(int dias) {
        double salarioTotal = (this.valorPorHora*8)*dias;
        return salarioTotal - (salarioTotal * (salarioTotal - (this.imposto/100)));
    }

    // getters e setters
    public double getValorPorHora(double v) {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
