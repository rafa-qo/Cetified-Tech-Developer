package MesaDeTrabalho;
import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {
    private static Map<String, Arvore> floresta = new HashMap<>();

    public Arvore getArvore(String tipoArvore, int altura, int largura, String cor){
        String id = "id: "+tipoArvore+", altura: "+altura+", largura: "+largura+", cor: "+cor;
        System.out.println(id);

        if (!floresta.containsKey(id)){
            floresta.put(id, new Arvore(tipoArvore, altura, largura, cor));
            System.out.println("\n Árvore plantada com sucesso!");
            return floresta.get(id);
        }
        System.out.println("\n A árvore" + floresta.get(id) +" já está plantada!");
        return floresta.get(id);
    }
}
