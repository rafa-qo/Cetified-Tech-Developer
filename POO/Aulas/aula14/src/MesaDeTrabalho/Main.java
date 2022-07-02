package MesaDeTrabalho;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            Paciente paciente1 = new Paciente("Rafael",
                    "Queiroz",
                    "38573904",
                    new Date(2022, 05,15));
            paciente1.darAlta(new Date(2022, 06, 01));
        } catch (PacienteExceptions e) {
            e.printStackTrace();
        }

    }
}
