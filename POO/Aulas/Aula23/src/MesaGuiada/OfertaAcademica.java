package MesaGuiada;

public abstract class OfertaAcademica {

    private String nome, desc;

    public OfertaAcademica() { };

    public abstract double calcularPreco();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
