package DesignPatternsFactory;

public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa(1234904L);

        EmpregadoSingletonEFactory empregado = EmpregadoSingletonEFactory.getInstance();

        empresa.addEmpregados(empregado.criarEmpregado("EMP-INT", "José", 8000.0));
        empresa.addEmpregados(empregado.criarEmpregado("EMP-EXT", "Maria", 12000.0));

        empresa.calcularSalarioTotal(15);
        empresa.lerEmpregado();
    }
}
