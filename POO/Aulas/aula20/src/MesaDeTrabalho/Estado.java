package MesaDeTrabalho;

public interface Estado {

    void adicionarProduto(Produto produto);
    void cancelar();
    void voltar();
    void avancar();

}
