package checkpoint01;

public class Cliente {
    private String nomeCompleto;
    private String email;
    private static String CPF;
    private String celular;

    // Construtor
    public Cliente(String nomeCompleto, String email, String celular, String CPF) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.celular = celular;
        this.CPF = CPF;
    }

    // Getters e Setters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public static String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
