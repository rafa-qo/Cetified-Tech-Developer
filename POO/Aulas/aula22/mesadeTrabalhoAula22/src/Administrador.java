import java.util.Scanner;

public class Administrador {
    public static void main(String[] args) {

        Pasta p = new Pasta("ArquivosGuardados");

        Arquivo arquivo1 = new ArquivoTexto("TCC");
        Arquivo arquivo2 = new ArquivoTexto("Lista de músicas");
        Arquivo arquivo3 = new ArquivoVideo("Doutor Estranho 2");
        Arquivo arquivo4 = new ArquivoVideo("Homem Aranha");

        p.inserirArquivo(arquivo1);
        p.inserirArquivo(arquivo2);
        p.inserirArquivo(arquivo3);
        p.inserirArquivo(arquivo4);

        p.mostrar();

        p.eliminarArquivo(arquivo2);

        System.out.println("");
        System.out.println("Lista de músicas excluída!");
        System.out.println("");

        Scanner arq = new Scanner(System.in);

        System.out.println("Digite um novo arquivo Texto");
        String texto = arq.nextLine();
        p.inserirArquivo(new ArquivoTexto(texto));
        System.out.println("Digite um novo arquivo Video");
        String video = arq.nextLine();
        p.inserirArquivo(new ArquivoVideo(video));

        p.mostrar();

    }
}
