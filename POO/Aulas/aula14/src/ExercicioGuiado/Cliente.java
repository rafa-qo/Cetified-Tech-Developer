package ExercicioGuiado;

public class Cliente {
    private String nome, sobrenome, RG;
    private double limite, saldoEmConta, divida;

    // construtor
    public Cliente(String nome, String sobrenome, String RG, double limite) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.limite = limite;
        this.saldoEmConta = 0;
        this.divida = 0;
    }

    //métodos
    public void compra(double valor) throws ClientesException {
        if ((saldoEmConta + limite) < valor){
            throw new ClientesException("Saldo insuficiente!");
        }
        saldoEmConta -= valor;
    }

    public void pagarDivida(double valor) throws ClientesException {
        if (divida <= 0){
            throw new ClientesException("Parabéns, você não possui dívidas a serem pagas. :)");
        }
        saldoEmConta -= valor;
    }

    @Override
    public String toString(){
        return "Cliente {" +
                nome + " " +
                sobrenome + ", "+
                "seu saldo é de: R$" + saldoEmConta;
    }

    // getters e setters
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

    public double getSaldoEmConta() {
        return saldoEmConta;
    }

    public void setSaldoEmConta(double saldoEmConta) {
        this.saldoEmConta = saldoEmConta;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }
}
