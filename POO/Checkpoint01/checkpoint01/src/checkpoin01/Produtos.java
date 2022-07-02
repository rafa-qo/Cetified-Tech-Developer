package checkpoin01;

public class Pratos {
    private Integer idPrato;
    private static Integer valorPrato;
    private Integer valorImposto;
    private String nomePrato;

    public Pratos(Integer idPrato, Integer valorPrato, Integer valorImposto, String nomePrato){
        this.idPrato = idPrato;
        this.valorPrato = valorPrato;
        this.valorImposto = valorImposto;
        this.nomePrato = nomePrato;
    };

    public Integer getIdPrato() {
        return idPrato;
    }


    public static Integer getValorPrato() {
        return valorPrato;
    }

    public void setValorPrato(Integer valorPrato) {
        this.valorPrato = valorPrato;
    }

    public Integer getValorImposto() {
        return valorImposto;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public void valorComImposto(Integer valor){
        Integer valorComImpostoPrato = valorImposto + valorPrato;
    };
}
