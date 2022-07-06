public class ArquivoVideo extends Arquivo{

    public ArquivoVideo(String nome) {
        super(nome);
    }

    public void ArquivoVideo(String nome){
        this.setNome(nome);
    }

    @Override
    public void mostrar() {
        System.out.println(this.getNome());
    }
}
