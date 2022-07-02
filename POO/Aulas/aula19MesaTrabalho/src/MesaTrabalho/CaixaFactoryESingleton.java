package MesaTrabalho;

public class CaixaFactoryESingleton {

    private static CaixaFactoryESingleton instance;

    private CaixaFactoryESingleton() { }

    public static CaixaFactoryESingleton getInstance(){
        if(instance==null){
            instance = new CaixaFactoryESingleton();
        }

        return instance;
    }

    public Produto criarProduto(String tipo){
        if (tipo.equals("CAIXA10X10")){
            Caixa caixa = new Caixa();
            caixa.setAltura(10.0);
            caixa.setComprimento(10.0);
            caixa.setLargura(10.0);
            return caixa;
        } else if (tipo.equals("FUTEBOL")){
            Bola futebol = new Bola();
            futebol.setRaio(11.0);
            return futebol;
        } else if (tipo.equals("BOLATENIS")){
            Bola bolatenis = new Bola();
            bolatenis.setRaio(0.32);
            return bolatenis;
        }
        return null;

    }
}
