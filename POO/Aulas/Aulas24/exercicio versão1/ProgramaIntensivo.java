package com.aulasdepoo.integradoraaula23.exercicioguiado;

import java.util.ArrayList;

public class ProgramaIntensivo extends OfertaAcademica {

    private double porcentagemBonificacao;
    private ArrayList<OfertaAcademica> ofertasAcademicas = new ArrayList<>();

    public double getPorcentagemBonificacao() {
        return porcentagemBonificacao;
    }

    public void setPorcentagemBonificacao(double porcentagemBonificacao) {
        this.porcentagemBonificacao = porcentagemBonificacao;
    }

    public void adicionar(OfertaAcademica oferta) {
        ofertasAcademicas.add(oferta);
    }


    @Override
    public double calcularPreco() {
        double total = 0;

        for(OfertaAcademica oferta: ofertasAcademicas)
            total += oferta.calcularPreco();

        double desconto = total * porcentagemBonificacao / 100;

        return total - desconto;
    }
}
