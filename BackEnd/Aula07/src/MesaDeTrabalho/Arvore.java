package MesaDeTrabalho;

public class Arvore {

    private int altura, largura;
    private String tipoArvore, cor;
    private static int contador;

    public Arvore(String tipoArvore, int altura, int largura, String cor) {
        super ();
        this.tipoArvore = tipoArvore;
        this.altura = altura;
        this.cor = cor;
        contador++;
        System.out.println("\n contador: "+contador);
    }

    public Arvore(){
        super();
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getTipoArvore() {
        return tipoArvore;
    }

    public void setTipoArvore(String tipoArvore) {
        this.tipoArvore = tipoArvore;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Arvore.contador = contador;
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", tipoArvore='" + tipoArvore + '\'' +
                ", cor='" + cor + '\'' +
                ", contador='" + contador + '\'' +
                '}';
    }
}
