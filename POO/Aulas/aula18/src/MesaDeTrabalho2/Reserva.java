package MesaDeTrabalho2;

public class Reserva {
    private int codigo, noPessoas;
    private double precoPassagem = 50d;
    private String estacaoPartida, estacaoDestino;

    // construtor
    public Reserva() {

    }

    // métodos
    public double precoReserva(int noPessoas) {
        double precoTotal;
        if (estacaoPartida == "Buenos Aires" && estacaoDestino == "Bragado") {
            precoTotal = ((noPessoas * precoPassagem) * 0.8);
        } else if (estacaoPartida == "Bragado" && estacaoDestino == "Buenos Aires") {
            precoTotal = (noPessoas * precoPassagem) * 0.8;
        } else {
            precoTotal = noPessoas * precoPassagem;
        }
        return precoTotal;
    }

    private boolean estavaCompleto(){
        return estacaoPartida == "BUENOS AIRES" && estacaoDestino == "BRAGADO";
    }

    // getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNoPessoas() {
        return noPessoas;
    }

    public void setNoPessoas(int noPessoas) {
        this.noPessoas = noPessoas;
    }

    public double getPrecoPassagem() {
        return precoPassagem;
    }

    public void setPrecoPassagem(double precoPassagem) {
        this.precoPassagem = precoPassagem;
    }

    public String getEstacaoPartida() {
        return estacaoPartida;
    }

    public void setEstacaoPartida(String estacaoPartida) {
        this.estacaoPartida = estacaoPartida;
    }

    public String getEstacaoDestino() {
        return estacaoDestino;
    }

    public void setEstacaoDestino(String estacaoDestino) {
        this.estacaoDestino = estacaoDestino;
    }
}
