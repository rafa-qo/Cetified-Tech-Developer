package mesaDeTrabalho;

public class UsuarioJogo {
    private String nome;
    private String nickname;
    private int pontuacao = 0;
    private int nivel = 1;

    public UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
    }

    public void aumentarPontuacao(int valor){
        this.pontuacao += valor;
        System.out.println("A pontuação atual do jogador " + this.nome + " é " + this.pontuacao);
    };

    public void subirNivel(int valor){
        this.nivel = valor;
        System.out.println("O nível atual do jogador " + this.nome + " é " + this.nivel);
    };

    public void bonus(int valor){
        this.pontuacao += valor;
        System.out.println("A pontuação atual do jogador " + this.nome + " após o bônus é " + this.pontuacao);
    };

}
