package MesaTrabalho;

public class Bola extends Produto{
    private double raio;

    //construtor
    public Bola() { }

    public Bola(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularEspaco() {
        double area = 4*3.14*(this.raio*this.raio);
        return area;

    }

    //getters e setters
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
