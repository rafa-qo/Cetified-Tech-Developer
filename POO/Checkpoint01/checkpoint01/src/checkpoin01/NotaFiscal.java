package checkpoin01;

public class NotaFiscal{
    private String nomeGarcom;
    private Integer idNota;

    public NotaFiscal(String nomeGarcom, Integer idNota){
        this.nomeGarcom = nomeGarcom;
        this.idNota = idNota;
    };

    public Integer totalSem10 (){
        Integer valorTotalSem10 = Produtos.valorPedido();
        return valorTotalSem10;
    };

    public void totalCom10 (Integer valor){
    };

    public double calcularDescCliente (Integer valor) {
        if (Clientes.getCPF() != null){
            double totalSem10DescCliente = totalSem10() - (0.05 * totalSem10());
            return totalSem10DescCliente;
        } else {
            return totalSem10();
        }
    };

    public String getNomeGarcom() {
        return nomeGarcom;
    }

    public void setNomeGarcom(String nomeGarcom) {
        this.nomeGarcom = nomeGarcom;
    }

    public Integer getIdNota() {
        return idNota;
    }

};