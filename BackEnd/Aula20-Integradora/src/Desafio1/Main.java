package Desafio1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <FileOuputStream> void main(String[] args) {
        Empresa empresa1 = new Empresa("17438049/0001-99", "Rafael Queiroz LTDA");

        Funcionario funcionario1 = new Funcionario("João", "Sousa", "34562347323", 4000.5);
        Funcionario funcionario2 = new Funcionario("Roberta", "Prado", "09834567283", 9000.5);
        Funcionario funcionario3 = new Funcionario("Pedro", "Oliveira", "12345678900", 10000.5);
        Funcionario funcionario4 = new Funcionario("Thais", "Silva", "20395489022", 15000.5);

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);

        // Criar o fluxo de Output Stream
        FileOutputStream fileOutputStreamEmpresa = null;
        FileOutputStream fileOutputStreamFuncionario = null;

        try {
            fileOutputStreamEmpresa = new FileOutputStream("empresa.txt");
            fileOutputStreamFuncionario = new FileOutputStream("funcionarios.txt");

            ObjectOutputStream objectOutputStreamEmpresa = new ObjectOutputStream(fileOutputStreamEmpresa);
            ObjectOutputStream objectOutputStreamFuncionario = new ObjectOutputStream(fileOutputStreamFuncionario);

            objectOutputStreamEmpresa.writeObject(empresa1);
            objectOutputStreamFuncionario.writeObject(funcionarios);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Criar fluxo de Input
        FileInputStream fileInputStreamEmpresa = null;
        FileInputStream fileInputStreamFuncionarios = null;
        ArrayList<Funcionario> listaFuncionarios = null;

        try{
            fileInputStreamEmpresa = new FileInputStream("empresa.txt");
            fileInputStreamFuncionarios = new FileInputStream("funcionarios.txt");

            ObjectInputStream objectInputStreamEmpresa = new ObjectInputStream(fileInputStreamEmpresa);
            ObjectInputStream objectInputStreamFuncionario = new ObjectInputStream(fileInputStreamFuncionarios);

            objectInputStreamEmpresa.readObject();
            listaFuncionarios = (ArrayList<Funcionario>) objectInputStreamFuncionario.readObject();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Funcionario funcionario: listaFuncionarios){
            System.out.println("Funcionário: "+funcionario.toString());
        }


    }
}
