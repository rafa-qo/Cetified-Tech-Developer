package ExercicioAula;

public class Cartao {

    private String banco, noCartao;

    public Cartao(String banco, String noCartao) {
        this.banco = banco;
        this.noCartao = noCartao;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNoCartao() {
        return noCartao;
    }

    public void setNoCartao(String noCartao) {
        this.noCartao = noCartao;
    }
}
