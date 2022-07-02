package MesaTrabalho;

public abstract class Produto {
    private double peso;

    public Produto() { }

    public abstract double calcularEspaco();

    //getters e setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
