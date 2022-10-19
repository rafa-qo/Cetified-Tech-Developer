package Aula19;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();

        Cachorro cachorro1 = new Cachorro("Bidu", 2);
        Cachorro cachorro2 = new Cachorro("Jota", 6);
        Cachorro cachorro3 = new Cachorro("Rei", 12);
        Cachorro cachorro4 = new Cachorro("Tostado", 7);

        cachorros.add(cachorro1);
        cachorros.add(cachorro2);
        cachorros.add(cachorro3);
        cachorros.add(cachorro4);

        FileOutputStream fileOutputStream = null;

        try{
            fileOutputStream = new FileOutputStream("testeDeOutput.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(cachorros);
        } catch (FileNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Recuperar toda a coleção com cada uma das páginas do arquivo
        List<Cachorro> cachorros2 = null;
        FileInputStream fi = null;

        try{
            fi = new FileInputStream("testeDeOutput.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);

            cachorros2 = (ArrayList) oi.readObject();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Cachorro cachorro: cachorros2){
            System.out.println("Nome: "+cachorro.getNome()+" - Idade: "+cachorro.getIdade());
        }

    }
}
