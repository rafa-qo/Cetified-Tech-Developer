package checkpoin01;

public class Clientes {
    private String nomeCompleto, email;
    private static Integer CPF;
    private Integer celular;

    public Clientes (String nomeCompleto, String email, Integer CPF, Integer celular){
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.CPF = CPF;
        this.celular = celular;
    };

    public String getNomeCompleto() {
        return nomeCompleto;
    };

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    };

    public String getEmail() {
        return email;
    };

    public void setEmail(String email) {
        this.email = email;
    };

    public static Integer getCPF() {
        return CPF;
    };

    public Integer getCelular() {
        return celular;
    };

    public void setCelular(Integer celular) {
        this.celular = celular;
    };


}
