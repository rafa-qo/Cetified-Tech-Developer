package MesaTrabalho;

public class Caixa extends Produto{

    private double comprimento, altura, largura;

    //construtor


    public Caixa() { }

    public Caixa(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularEspaco() {
        double area = this.comprimento * this.largura;
        return area;
    }

    //getters e setters
    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
