package MesaDeTrabalho2;

import java.util.ArrayList;

public class Reservas {
    private int codigo, noPessoas;
    private double precoPassagem = 50;
    private Rota rota;


    public Reservas(int codigo, int noPessoas, Rota rota) {
        this.codigo = codigo;
        this.noPessoas = noPessoas;
        this.rota = rota;
    }


    public double precoReserva (int noPessoas) {
        if (rota.getEstacaoPartida() == "Buenos Aires" && rota.getEstacaoDestino() == "Bragado") {
            return ((noPessoas * precoPassagem) * 0.8);
        } else if (rota.getEstacaoDestino() == "Buenos Aires" && rota.getEstacaoPartida() == "Bragado") {
            return (noPessoas * precoPassagem) * 0.8;
        } else {
            return noPessoas * precoPassagem;
        }
    }



}
