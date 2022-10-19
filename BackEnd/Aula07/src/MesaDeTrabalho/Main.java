package MesaDeTrabalho;

public class Main {

    public static void main(String[] args) {
        ArvoreFactory arvore = new ArvoreFactory();

        Arvore ornamental1 = arvore.getArvore("Ornamental", 200,400,"Verde");
        Arvore ornamental2 = arvore.getArvore("Ornamental", 200,400,"Verde");
        Arvore ornamental3 = arvore.getArvore("Ornamental", 200,400,"Verde");

        Arvore frutifera1 = arvore.getArvore("Frutífera", 500,300,"Vermelho");
        Arvore frutifera2 = arvore.getArvore("Frutífera", 500,300,"Vermelho");
        Arvore frutifera3 = arvore.getArvore("Frutífera", 500,300,"Vermelho");

        Arvore florifera1 = arvore.getArvore("Florífera", 100,200,"Azul");
        Arvore florifera2 = arvore.getArvore("Florífera", 100,200,"Azul");
        Arvore florifera3 = arvore.getArvore("Florífera", 100,200,"Azul");

        System.out.println(ornamental1.toString());
        System.out.println(frutifera1.toString());
        System.out.println(florifera1.toString());

    }
}
