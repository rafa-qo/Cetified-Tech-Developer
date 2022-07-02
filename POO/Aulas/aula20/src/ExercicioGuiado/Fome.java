package ExercicioGuiado;

public class Fome implements Estado{

    Tamagochi t;

    public Fome(Tamagochi t) {
        this.t = t;
        System.out.println("Com Fome!");
    }

    @Override
    public void come() {
        t.setEstado(new Feliz(t));
    }

    @Override
    public void bebe() {
        System.out.println("----");
    }

    @Override
    public void carinho() {
        System.out.println("----");
    }
}
