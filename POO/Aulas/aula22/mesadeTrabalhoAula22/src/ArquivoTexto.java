public class ArquivoTexto extends Arquivo {

    public ArquivoTexto(String nome) {
        super(nome);
    }

    public void ArquivoTexto(String nome){
        this.setNome(nome);
    }

    @Override
    public void mostrar() {
        System.out.println(this.getNome());
    }
}
