package MesaIntegradora;

import java.util.ArrayList;

public class Funcionario extends Vendedor{

    private int anosServico;
    private ArrayList<Vendedor> afiliados = new ArrayList<>();

    public Funcionario(String nome, int anosServico) {
        super.nome = nome;
        super.pontosPorVenda = 5;
        this.anosServico = anosServico;
    }

    public void addAfiliado(Vendedor afiliado){
        this.afiliados.add(afiliado);
        System.out.println(afiliado.nome + " agora é afiliado de " + this.nome);
    }

    @Override
    public int calcularPontos(){
        return (this.afiliados.size()*10)+(this.anosServico*5);
    }
}
