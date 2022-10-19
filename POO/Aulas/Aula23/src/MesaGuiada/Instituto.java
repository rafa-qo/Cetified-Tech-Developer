package MesaGuiada;

import java.util.ArrayList;

public class Instituto{

    private String nome;
    private ArrayList<OfertaAcademica> ofertas = new ArrayList<>();

    public Instituto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarOferta (OfertaAcademica o){
        ofertas.add(o);
    }

    public void gerarInforme(){
        for (OfertaAcademica o: ofertas){
            System.out.println("Nome: " + o.getNome() + ". Preço: " + o.calcularPreco());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
