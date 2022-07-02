 package aula16;

public class Data{

    private int dia, mes, ano;

    public Data (int dia, int mes, int ano) throws DataException{
        if(dia < 1 || dia > 31){
            throw new DataException("Erro no dia");
        }
        this.dia = dia;
        if(mes < 1 || mes > 12){
            throw new DataException("Erro no mês");
        }
        this.mes = mes;
        if(ano < 1){
            throw new DataException("Erro no ano");
        }
        this.ano = ano;

    }
}
