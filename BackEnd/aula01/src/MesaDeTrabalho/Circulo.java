package MesaDeTrabalho;

public class Circulo extends Figura{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        super.calcularPerimetro();
        double perimetro = 2*Math.PI*raio;
        if (this.raio > 0) {
            return perimetro;
        }
        return 0;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
