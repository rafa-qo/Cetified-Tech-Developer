package MesaDeTrabalho;

public class ProcessaQuality {

    public static void main(String[] args) {
        CheckQuality processo = new CheckQuality();

        processo.verificar(new Produto("Coca cola", "quase saudável", 1250,1250));
        processo.verificar(new Produto("Pastel", "saudável", 950,4000));
        processo.verificar(new Produto("Coca cola", "quase saudável", 1250,4000));
        processo.verificar(new Produto("Coca cola", "saudável", 4000,900));
        processo.verificar(new Produto("Coca cola", "nada", 1250,1250));

    }
}
