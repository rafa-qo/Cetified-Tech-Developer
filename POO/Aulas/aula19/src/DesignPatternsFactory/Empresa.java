package DesignPatternsFactory;

import java.util.ArrayList;

public class Empresa {
    private Long cnpj;
    ArrayList<Empregado> listaEmpregados = new ArrayList<>();

    //construtor
    public Empresa(Long cnpj) {
        this.cnpj = cnpj;
    }

    //métodos
    public double calcularSalarioTotal(int dias){
        double total = 0.0;
        for (Empregado empregado: listaEmpregados){
            System.out.println("O empregado " + empregado.getNome() + " tem um salário de R$"
                    + empregado.calcularSalario(dias));
        }
        return total;
    }

    public void addEmpregados(Empregado empregado){
        listaEmpregados.add(empregado);
    }

    public void lerEmpregado() {
        for(Empregado empregado: listaEmpregados) {
            System.out.println("Empregado: " + empregado.getNome());
        }
    }

    //getters e setters
    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }
}
