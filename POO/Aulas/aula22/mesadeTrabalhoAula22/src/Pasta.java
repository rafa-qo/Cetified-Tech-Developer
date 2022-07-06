
import java.util.ArrayList;

public class Pasta extends Arquivo{

    private ArrayList<Arquivo> arquivos = new ArrayList<>();

    public Pasta(String nome) {
        super(nome);
    }

    public void Pasta(String nome){
        this.setNome(nome);
    }

    public void inserirArquivo(Arquivo arquivo){
        arquivos.add(arquivo);
    }

    public void eliminarArquivo(Arquivo arquivo){
        arquivos.remove(arquivo);
    }

    @Override
    public void mostrar() {
        for (Arquivo arquivo: arquivos) {
            System.out.println(arquivo.getNome());
        }
    }
}
