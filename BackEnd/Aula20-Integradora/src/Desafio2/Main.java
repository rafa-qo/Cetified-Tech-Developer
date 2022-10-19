package Desafio2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Funcionario funcionario1 = new Funcionario("João", "Sousa", "34562347323", 4000.5);
        Funcionario funcionario2 = new Funcionario("Roberta", "Prado", "09834567283", 9000.5);
        Funcionario funcionario3 = new Funcionario("Pedro", "Oliveira", "12345678900", 10000.5);
        Funcionario funcionario4 = new Funcionario("Thais", "Silva", "20395489022", 15000.5);

        List<Funcionario> listaFuncionarios = new ArrayList<>();

        listaFuncionarios.add(funcionario1);
        listaFuncionarios.add(funcionario2);
        listaFuncionarios.add(funcionario3);
        listaFuncionarios.add(funcionario4);

        FileWriter listaFuncionariosArq = new FileWriter("funcionarios2.txt");
        PrintWriter gravarFuncionarios = new PrintWriter(listaFuncionariosArq);

        for (Funcionario funcionario: listaFuncionarios){
            gravarFuncionarios.println(funcionario.toString());
            System.out.println(funcionario.toString());
        }

        listaFuncionariosArq.close();

    }
}
