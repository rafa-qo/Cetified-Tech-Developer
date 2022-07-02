package DesignPatternsFactory;

public class EmpregadoSingletonEFactory {

    private static EmpregadoSingletonEFactory instance;

    private EmpregadoSingletonEFactory() { }

    public static EmpregadoSingletonEFactory getInstance(){
        if(instance==null){
            instance = new EmpregadoSingletonEFactory();
        }

        return instance;
    }

    //Padrão Factory pra criar novos objetos.
    public Empregado criarEmpregado (String tipo, String nome, double salario){
        if (tipo.equals("EMP-INT")){
            EmpregadoRelacaoDep empregado = new EmpregadoRelacaoDep();
            empregado.setNome(nome);
            empregado.setSalarioMensal(salario);
            return empregado;
        } else if (tipo.equals("EMP-EXT")){
            EmpregadoContratado empregado = new EmpregadoContratado();
            empregado.setNome(nome);
            empregado.getValorPorHora(2.0);
            empregado.setImposto(30.0);
            return empregado;
        }
        return null;

    }
}
