package MesaGuiada;

import java.util.ArrayList;

public class ProgramaIntensivo extends OfertaAcademica{

    private double porcentagemBoni;
    private ArrayList<OfertaAcademica> ofertasAcademicas = new ArrayList<>();

//    public ProgramaIntensivo(String nome, String desc) {
//        super(nome, desc);
//    }

    @Override
    public double calcularPreco() {
        double valorTotal = 0;
        for (OfertaAcademica o: ofertasAcademicas){
            valorTotal += o.calcularPreco();
        }

        double desconto = (porcentagemBoni/100) * valorTotal;

        return valorTotal - desconto;
    }

    public void adicionar(OfertaAcademica o){
        ofertasAcademicas.add(o);
    }

    public double getPorcentagemBoni() {
        return porcentagemBoni;
    }

    public void setPorcentagemBoni(double porcentagemBoni) {
        this.porcentagemBoni = porcentagemBoni;
    }
}
