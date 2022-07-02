package MesaDeTrabalho2;

public class Main {

    public static void main(String[] args) {
        //Criamos um objeto do tipo Empresa
        ListaReservas empresa = new ListaReservas("Empresa de Trem 1");


        //Criamos as reservas

        Reserva r1 = new Reserva();
        r1.setCodigo(478304);
        r1.setNoPessoas(2);
        r1.setEstacaoPartida("BUENOS AIRES");
        r1.setEstacaoDestino("MERCEDES");

        Reserva r2 = new Reserva();
        r2.setCodigo(478304);
        r2.setNoPessoas(2);
        r2.setEstacaoPartida("BUENOS AIRES");
        r2.setEstacaoDestino("BRAGADO");

        //Adicionamos as reservas a empresa
        empresa.addReserva(r1);
        empresa.addReserva(r2);

        //Chamamos os mÃ©todos solicitados
        System.out.println("Valor Total: " + empresa.valorTotal());
        System.out.println("Quantidade de vezes que passaram por : BUENOS AIRES: " + empresa.quantVezesVisitada("BUENOS AIRES"));
    }
}
