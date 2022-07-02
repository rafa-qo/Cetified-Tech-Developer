package ExercicioGuiado;

public class Sede {

    private Tamagochi t;

    public Sede(Tamagochi t) {
        this.t = t;
        System.out.println("Com Sede!");
    }

    public void come(){
        //Sem mudança
    }

    public void bebe(){
        t.setEstado(new Feliz(t));
    }

    public void carinho(){
        //Sem mudança
    }

}
