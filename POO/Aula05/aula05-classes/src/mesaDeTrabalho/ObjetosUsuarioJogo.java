package mesaDeTrabalho;

public class ObjetosUsuarioJogo {

    public static void main(String[] args) {
        UsuarioJogo usuario1 = new UsuarioJogo("Luiza", "Lulu");
        UsuarioJogo usuario2 = new UsuarioJogo("Daniel", "DanMartins");

        usuario1.aumentarPontuacao(30);
        usuario2.subirNivel(3);
        usuario2.bonus(500);
        usuario1.bonus(600);
    }
}

/*
Luiza Zilio
Daniel Martins
Rafael Oliveira
Rodrigo Rodrigues
João Victor
Alexander Bandeira
 */
