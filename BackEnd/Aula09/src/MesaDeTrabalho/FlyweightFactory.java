package MesaDeTrabalho;

import AulaIntegradora.Triangulo;

import java.util.HashMap;

public class FlyweightFactory {

    static final HashMap<String, Roupa> tamanhos = new HashMap<>();
    static final HashMap<String, Roupa> tipoMap = new HashMap<>();
    static final HashMap<Boolean, Roupa> novoMap = new HashMap<Boolean, Roupa>();
    static final HashMap<Boolean, Roupa> importadaMap = new HashMap<Boolean, Roupa>();


    public static Roupa inserirRoupa(String tamanho, String tipo, boolean eNovo, boolean importada){
        Roupa roupa = new Roupa(tamanho, tipo, eNovo, importada);

        Roupa roupa1 = tamanhos.get(roupa.getTamanho());

        if(roupa1 == null){
            tamanhos.put(tamanho, roupa1);
        }

        Roupa roupa2 = importadaMap.get(roupa.isImportada());

        if (roupa2 == null){
            importadaMap.put(importada, roupa2);
        }

        Roupa roupa3 = novoMap.get(roupa.iseNovo());

        if (roupa3 == null){
            novoMap.put(eNovo, roupa3);
        }

        Roupa roupa4 = tipoMap.get(roupa.getTipo());
        if (roupa4 == null){
            tipoMap.put(tipo, roupa4);
        }

        return roupa;
    }
}
