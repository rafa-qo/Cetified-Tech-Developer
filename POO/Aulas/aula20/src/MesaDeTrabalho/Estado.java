package MesaDeTrabalho;

import java.util.ArrayList;

public interface Estado {
    void adicionarProduto(ArrayList<Produto> listaProdutos);
    void cancelar();
    void voltar();
    void avancar();

}
