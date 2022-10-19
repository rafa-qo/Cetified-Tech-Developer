package Aula14;

public class Medicamento {
    private Integer id;
    private String nome, lab;
    private Integer qtde;
    private double preco;

    public Medicamento(Integer id, String nome, String lab, Integer qtde, double preco) {
        this.id = id;
        this.nome = nome;
        this.lab = lab;
        this.qtde = qtde;
        this.preco = preco;
    }

    public Medicamento(String nome, String lab, Integer qtde, double preco) {
        this.nome = nome;
        this.lab = lab;
        this.qtde = qtde;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", lab='" + lab + '\'' +
                ", qtde=" + qtde +
                ", preco=" + preco +
                '}';
    }
}
