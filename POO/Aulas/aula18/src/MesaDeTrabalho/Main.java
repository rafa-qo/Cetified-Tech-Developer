package MesaDeTrabalho;

public class Main {

    public static void main(String[] args) {

        Time t1 = new Time("Timão da Porra");

        Jogador j1 = new Jogador("Atacante", "José", 77);
        Jogador j2 = new Jogador("Meio Campista", "João", 21);
        Jogador j3 = new Jogador("Defensor", "Pelé", 17);
        Jogador j4 = new Jogador("Goleiro", "Ricadrão", 6);
        Jogador j5 = new Jogador("Atacante", "Alemão", 12);
        Jogador j6 = new Jogador("Meio Campista", "Cristiano",9);
        Jogador j7 = new Jogador("Defensor", "Rafinha", 04);
        Jogador j8 = new Jogador("Meio Campista", "Jair", 14);
        Jogador j9 = new Jogador("Goleiro", "Rodolfo", 17);
        Jogador j10 = new Jogador("Atacante", "Quincas", 01);
        Jogador j11 = new Jogador("Meio Campista", "Pedro", 99);
        Jogador j12 = new Jogador("Meio Campista", "Diogo", 69);
        Jogador j13 = new Jogador("Atacante", "Arnon", 51);
        Jogador j14 = new Jogador("Atacante", "Alison", 9);
        Jogador j15 = new Jogador("Atacante", "Almir", 11);
        Jogador j16 = new Jogador("Atacante", "Juninho", 10);
        Jogador j17 = new Jogador("Defensor", "Raí", 5);
        Jogador j18 = new Jogador("Atacante", "Juan", 23);
        Jogador j19 = new Jogador("Atacante", "Paulo", 43);
        Jogador j20 = new Jogador("Atacante", "Tato", 19);
        Jogador j21 = new Jogador("Defensor", "Bruno", 4);
        Jogador j22 = new Jogador("Meio Campista", "Thiago", 2);
        Jogador j23 = new Jogador("Goleiro", "Walmir", 13);

        t1.addJogador(j1);
        t1.addJogador(j2);
        t1.addJogador(j3);
        t1.addJogador(j4);
        t1.addJogador(j5);
        t1.addJogador(j6);
        t1.addJogador(j7);
        t1.addJogador(j8);
        t1.addJogador(j9);
        t1.addJogador(j10);
        t1.addJogador(j11);
        t1.addJogador(j12);
        t1.addJogador(j13);
        t1.addJogador(j14);
        t1.addJogador(j15);
        t1.addJogador(j16);
        t1.addJogador(j17);
        t1.addJogador(j18);
        t1.addJogador(j19);
        t1.addJogador(j20);
        t1.addJogador(j21);
        t1.addJogador(j22);
        t1.addJogador(j23);

        System.out.println("Número de jogadores reservas: " + t1.obterReservas().size());

//        t1.obterReservas(t1.listaDeJogadores);

        try{
            System.out.println("O número de jogadores nessa posição é: " + t1.jogadoresPorPosicao("Atacante"));
        }catch (JogadorException e){
            System.err.println(e);
        }
    }

}
