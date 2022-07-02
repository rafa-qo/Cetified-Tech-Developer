package aula05;

public class ObjetoBancoDigital {
    public static void main(String[] args) {
        BancoDigital cliente1 = new BancoDigital(1, "Rafael Queiroz");
        BancoDigital cliente2 = new BancoDigital(2, "Diana Tolotti");

        cliente1.aumentarDivida(500D);
        cliente1.pagarDivida(500.00);
        cliente1.pagarDivida(300.00);
        cliente2.setNome("Dollitle");
    }
}
