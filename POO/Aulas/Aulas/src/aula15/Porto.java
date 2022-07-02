package aula15;

import java.util.ArrayList;
import java.util.Collections;

public class Porto {
    private String nome;


    public Porto(String nome) {
        this.nome = nome;
    }

    ArrayList<Container> listaContainers = new ArrayList<Container>();

    public void addContainer(Container container) {
        listaContainers.add(container);
    }

    public void mostrarContainer(Container container){
        
        Collections.sort(listaContainers);

//        for(Container contadorcontainer: listaContainers){
//                System.out.println("O Número de identificação do navio é: " + container.getId());
//        }
    }


    public void calcularQtdeContainers(){
        int qtde = 0;
        for(Container container: listaContainers){
            if(container.getPaisOrigem() == "Desconhecido" && container.isMaterialPerigoso()){
                qtde++;
            }
        }
        System.out.println("A quantidade total de containeres desconhecidos e com material perigoso é de: " + qtde);
    }
}
