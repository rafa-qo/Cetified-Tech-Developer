package com.aulasdepoo.integradoraaula23.exercicioguiado;

import java.util.ArrayList;

public class Instituto {
	
    private String nome;
    private ArrayList<OfertaAcademica> ofertas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionar(OfertaAcademica o){
        ofertas.add(o);
    }

    public void gerarOferta(){
        for(OfertaAcademica oferta :ofertas)
            System.out.println(oferta.getNome() + " Preço R$:" + oferta.calcularPreco());
    }
}
