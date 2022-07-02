package MesaDeTrabalho;

public class Jogador{
    private String posicao, sobrenome;
    private int noCamisa;

    //construtor
    public Jogador(String posicao, String sobrenome, int noCamisa) {
        this.posicao = posicao;
        this.sobrenome = sobrenome;
        this.noCamisa = noCamisa;
    }

    //getter e setters
    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getNoCamisa() {
        return noCamisa;
    }

    public void setNoCamisa(int noCamisa) {
        this.noCamisa = noCamisa;
    }
}
