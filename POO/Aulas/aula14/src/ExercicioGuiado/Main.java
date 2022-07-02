package ExercicioGuiado;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Rafael", "Queiroz", "29.674.388-00",500);

        try {
            //cliente1.compra(700.00);
            cliente1.compra(300.00);
            System.out.println("Compra realizada! :)");
        } catch (ClientesException e) {
            e.printStackTrace();
        }


    }
}
