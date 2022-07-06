public abstract class Arquivo {

    private String nome;

    public abstract void mostrar();

    public Arquivo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
