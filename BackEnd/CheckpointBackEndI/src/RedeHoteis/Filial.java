package RedeHoteis;

public class Filial {
    private Integer id;
    private String nomeFilial;
    private String rua;
    private int numero;
    private String cidade;
    private String estado;
    private Integer cincoEstrelas;

    public Filial(Integer id, String nomeFilial, String rua, int numero, String cidade, String estado, Integer cincoEstrelas) {
        this.id = id;
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cincoEstrelas = cincoEstrelas;
    }

    public Filial(String nomeFilial, String rua, int numero, String cidade, String estado, int cincoEstrelas) {
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cincoEstrelas = cincoEstrelas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCincoEstrelas() {
        return cincoEstrelas;
    }

    public void setCincoEstrelas(Integer cincoEstrelas) {
        this.cincoEstrelas = cincoEstrelas;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "id=" + id +
                ", nomeFilial='" + nomeFilial + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cincoEstrelas=" + cincoEstrelas +
                '}';
    }
}
