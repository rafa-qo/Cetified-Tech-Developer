package MesaDeTrabalho;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List<Contato> contatos = new ArrayList<>();

        Contato contato1 = new Contato("Jadson", "jadson@gmail.com","11874336573");
        Contato contato2 = new Contato("Rafael", "rafael@gmail.com","11434778532");
        Contato contato3 = new Contato("João", "jao@gmail.com","119887345784");

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);

        // Criar o fluxo de Output Stream

        FileOutputStream fo = null;

        try{
            fo = new FileOutputStream("contatos.txt");
            ObjectOutputStream os = new ObjectOutputStream(fo);

            os.writeObject(contatos);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Recuperar as listas
        ArrayList<Contato> contatos2 = null;
        FileInputStream is = null;

        try {
            is = new FileInputStream("contatos.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(is);

            contatos2 = (ArrayList<Contato>) objectInputStream.readObject();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Contato contato: contatos2){
            System.out.println("Nome: "+contato.getNome()+" - E-mail: "+contato.getEmail()+" - Telefone: "+contato.getTelefone());
        }


    }
}
