package MesaDeTrabalho2;

import java.util.ArrayList;

public class ListaReservas {

    private String nome;
    ArrayList<Reserva> listaDeReservas = new ArrayList<>();


    // construtor
    public ListaReservas(String nome) {
        this.nome = nome;
    }

    // métodos
    public void addReserva(Reserva r){
        listaDeReservas.add(r);
    }

    public double valorTotal() {

        double total = 0;
        for(Reserva reserva : listaDeReservas){
            total += reserva.getPrecoPassagem();
        }
        return total;
    }

    public int quantVezesVisitada(String estacao){
        int quant = 0;
        for(Reserva reserva: listaDeReservas) {
            if(reserva.getEstacaoDestino() == estacao ||
                    reserva.getEstacaoPartida() == estacao){
                quant++;
            }
        }
        return quant;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
