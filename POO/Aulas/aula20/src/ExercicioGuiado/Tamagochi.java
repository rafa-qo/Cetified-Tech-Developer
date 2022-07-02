package ExercicioGuiado;

public class Tamagochi {

    private Estado estado;

    //construtor
    public Tamagochi() {
        this.estado = new Fome(this);
    }

    public void come(){
        getEstado().come();
    }

    public void bebe(){
        getEstado().bebe();
    }

    public void carinho(){
        getEstado().carinho();
    }

    //getters e setters
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
