package aula16;

public class Main {
    public static void main(String[] args) {
        try{
            Data newData = new Data(06,11,1985);
            System.out.println("O dia selecionado é: " + newData);
        } catch (DataException e){
            e.printStackTrace();
        }

        try{
            Data newData2 = new Data(45,11,1985);
            System.out.println(String.format("O dia selecionado é: " + newData2));
        } catch (DataException e){
            e.printStackTrace();
        }
    }
}
