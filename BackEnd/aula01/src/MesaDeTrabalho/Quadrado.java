package MesaDeTrabalho;

public class Quadrado extends Figura{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        super.calcularPerimetro();
        double perimetro = 4*lado;
        if (lado > 0 ){
            return perimetro;
        }
        return 0;
    }


    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
