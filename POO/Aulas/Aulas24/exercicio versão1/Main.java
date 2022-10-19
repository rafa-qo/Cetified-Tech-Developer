package com.aulasdepoo.integradoraaula23.exercicioguiado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

 
		/* O que conseguimos com a Factory é desacoplar a construção do objeto, ao invés de usar o
        * construtor em todos os lugares, o único lugar onde o construtor é usado é na Fábrica e se amanhã
        * alteramos o construtor, ou seja, removemos ou adicionamos parâmetros nele, apenas temos que modificar a fábrica */

        OfertaAcademica frontEnd =  OfertaAcademicaFactory.getInstancia()
                                    .criarOfertaAcademica(OfertaAcademicaFactory.CURSO);

        
		/* carregamos os dados da matéria pelo console */
        carregarCurso(frontEnd);

        /*Usamos uma fábrica para criar as diferentes ofertas acadêmicas, neste caso uma disciplina*/
        OfertaAcademica backEnd =  OfertaAcademicaFactory.getInstancia()
                                    .criarOfertaAcademica(OfertaAcademicaFactory.CURSO);

        /* carregamos os dados da matéria pelo console */
        carregarCurso(backEnd);

       
		/*Usamos uma fábrica para criar as diferentes ofertas acadêmicas, neste caso um programa*/
        OfertaAcademica programa = OfertaAcademicaFactory.getInstancia()
                                    .criarOfertaAcademica(OfertaAcademicaFactory.PROGRAMA_INTENSIVO);

        /* carregamos os dados da matéria pelo console */
        cargarProgramaIntensivo(programa);

        /*adiciona os cursos ao programa*/
        adicionarOferta(programa, frontEnd);
        adicionarOferta(programa, frontEnd);

        Instituto digitalHouse = new Instituto();
        digitalHouse.adicionar(backEnd);
        digitalHouse.adicionar(frontEnd);
        digitalHouse.adicionar(programa);
        digitalHouse.gerarOferta();

    }

    public static void carregarCurso(OfertaAcademica oferta){
        Scanner scanner = new Scanner(System.in);
        Curso curso = (Curso) oferta;

        System.out.println("Insira o nome do curso: ");
        oferta.setNome(scanner.nextLine());


        System.out.println("Insira a carga horária: ");
        curso.setCargaHoraria(scanner.nextDouble());

        System.out.println("Insira a duração: ");
        curso.setDuracao(scanner.nextDouble());

        System.out.println("Insira o valor da hora: ");
        curso.setValorHora(scanner.nextDouble());
    }

    public static void cargarProgramaIntensivo(OfertaAcademica oferta){
        Scanner scanner = new Scanner(System.in);
        ProgramaIntensivo programa = (ProgramaIntensivo) oferta;

        System.out.println("Insira o nome do programa: ");
        oferta.setNome(scanner.nextLine());

        System.out.println("Insira a porcentagem de bonificação: ");
        programa.setPorcentagemBonificacao(scanner.nextDouble());
    }


    public static void adicionarOferta(OfertaAcademica ofertaAcademica, OfertaAcademica oferta)
    {
        if(ofertaAcademica instanceof ProgramaIntensivo)
            ((ProgramaIntensivo)ofertaAcademica).adicionar(oferta);
    }

}
