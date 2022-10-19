package MesaGuiada;

public class Main {

    public static void main(String[] args) {

        Instituto instituto = new Instituto("Digital House");

        OfertaAcademica frontEnd = OfertaAcademicaFactory.getInstance().criarOfertaAcademica(OfertaAcademicaFactory.CURSO);

        ((Curso)frontEnd).setCargaHoraria(16.0);
        ((Curso)frontEnd).setDuracao(2.0);
        ((Curso)frontEnd).setValorHora(1000.0);
        ((Curso)frontEnd).setNome("Front End");

        OfertaAcademica backEnd = OfertaAcademicaFactory.getInstance().criarOfertaAcademica(OfertaAcademicaFactory.CURSO);

        ((Curso)backEnd).setCargaHoraria(20.0);
        ((Curso)backEnd).setDuracao(2.0);
        ((Curso)backEnd).setValorHora(900.0);
        ((Curso)backEnd).setNome("Back End");

        instituto.adicionarOferta(frontEnd);
        instituto.adicionarOferta(backEnd);

        OfertaAcademica fullStack = OfertaAcademicaFactory.getInstance().criarOfertaAcademica(OfertaAcademicaFactory.PROGRAMA_INTENSIVO);

        ((ProgramaIntensivo)fullStack).setNome("Intensivão");
        ((ProgramaIntensivo)fullStack).setPorcentagemBoni(20.0);
        ((ProgramaIntensivo)fullStack).adicionar(backEnd);
        ((ProgramaIntensivo)fullStack).adicionar(frontEnd);

        instituto.adicionarOferta(fullStack);

        instituto.gerarInforme();


    }
}
