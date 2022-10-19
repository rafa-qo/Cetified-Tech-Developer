package com.aulasdepoo.integradoraaula23.exercicioguiado;

import com.aulasdepoo.integradoraaula23.exerciciomesa.Carreira;
import com.aulasdepoo.integradoraaula23.exerciciomesa.Workshop;

public class OfertaAcademicaFactory {

    private static OfertaAcademicaFactory factory = null;
    public static final String CURSO = "CURSO";
    public static final String PROGRAMA_INTENSIVO = "PROGRAMA_INTENSIVO";

    private OfertaAcademicaFactory(){

    }

    public static OfertaAcademicaFactory getInstancia(){
        if(factory == null){
            factory = new OfertaAcademicaFactory();
		}

        return factory;
    }

    public OfertaAcademica criarOfertaAcademica(String tipo){
        switch (tipo) {
            case OfertaAcademicaFactory.CURSO:
                return new Curso();
            case OfertaAcademicaFactory.PROGRAMA_INTENSIVO:
                return new ProgramaIntensivo();
        }
        return null;

    }


}

