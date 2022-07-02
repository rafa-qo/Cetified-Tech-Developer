package aula05;

public class BancoDigital {
    private int numeroCliente;
    private String nome;
    private Double divida;

    public BancoDigital(int numeroCliente, String nome) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.divida = 0.0;
    }

    public void aumentarDivida(Double valor) {
        // Calcula o valor da dívida + aumento da dívida
        this.divida += valor;
        System.out.println("O saldo devedor do(a) cliente " + this.nome + " é de R$ " + this.divida);
    }

    public void pagarDivida (Double valor) {
        // Calcula o valor do que sobrou da dívida
        if (this.divida == 0) {
            System.out.println("Não há valores em dívida para serem quitados");
        } else {
            this.divida -= valor;
            System.out.println("O saldo devedor do(a) cliente " + this.nome + " é de R$ " + this.divida);
        }
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDivida() {
        return divida;
    }


/*
    public void setDivida(Double divida) {
        this.divida = divida;
    }
 */

}
