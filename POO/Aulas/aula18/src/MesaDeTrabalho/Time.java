package MesaDeTrabalho;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Time {
    private String nome;
    ArrayList<Jogador> listaDeJogadores = new ArrayList<>();

    public Time(String nome) {
        this.nome = nome;
    }

    public ArrayList<Jogador> obterReservas(){

        ArrayList<Jogador> reservas = new ArrayList<>();

        for(int i = listaDeJogadores.size()-1; i >= 18; i--){
            reservas.add(listaDeJogadores.get(i));
        }

        return reservas;
    }

    public int jogadoresPorPosicao(String valor) throws JogadorException {
        int contador = 0;

        for (Jogador j: listaDeJogadores){
            if (j.getPosicao() == valor){
                contador++;
            } else if ((valor != "Goleiro")  && (valor != "Defensor") && (valor != "Meio Campista") && (valor != "Atacante")){
                throw new JogadorException("Posição inválida!");
            }
        }
        return contador;
    }

    public void addJogador(Jogador j){
        listaDeJogadores.add(j);
    }

}
