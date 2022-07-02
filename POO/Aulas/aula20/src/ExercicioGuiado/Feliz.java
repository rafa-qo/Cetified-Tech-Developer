package ExercicioGuiado;

public class Feliz implements Estado{

    Tamagochi t;

    public Feliz(Tamagochi t) {
        this.t = t;
        System.out.println("Feliz!");
    }

    @Override
    public void come() {
        System.out.println("----");
    }

    @Override
    public void bebe() {
        System.out.println("Beep. Beep. Beep. Beep. Beep!");
    }

    @Override
    public void carinho() {
        System.out.println("----");
    }
}
