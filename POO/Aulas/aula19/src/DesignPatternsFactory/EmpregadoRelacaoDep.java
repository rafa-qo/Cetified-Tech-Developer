package DesignPatternsFactory;

public class EmpregadoRelacaoDep extends Empregado{
    private double salarioMensal;

    public EmpregadoRelacaoDep() { }

    @Override
    public double calcularSalario(int dias) {
        return (this.salarioMensal / 30);
    }


    //getters e setters

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
