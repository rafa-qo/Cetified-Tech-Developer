package ExercicioGuiado;

public class Triste implements Estado {

    Tamagochi t;

    public Triste(Tamagochi t) {
        this.t = t;
        System.out.println("Triste!");
    }


    @Override
    public void come() {
        System.out.println("Beep. Beep! O Tamagochi está vomitando!");
    }

    @Override
    public void bebe() {
        System.out.println("Pisca pisca! Beep. Beep. Beep!");
    }

    @Override
    public void carinho() {
        t.setEstado(new Feliz(t));
    }
}
