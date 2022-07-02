package aula06;

import java.time.LocalDate;

public class Executavel {

    public static void main(String[] args) {
        Cachorro cao1 = new Cachorro("Rex", "Vira-lata", LocalDate.of(2005, 5, 1), 6.2, true, false, true);
        Cachorro cao2 = new Cachorro("Amarelin", "Pincher", LocalDate.of(2010, 3, 1), 4.1, false, false, true);

        System.out.println("Nome: "+cao1.getNome());
        System.out.println("Raça: "+cao1.getRaca());
        System.out.println("Idade: "+cao1.getIdade());
        System.out.println("Peso: "+cao1.getPeso());
        System.out.println("Tem chip: "+cao1.getHasChip());
        System.out.println("Pode ir para adoção? "+cao1.encaminharAdocao());

        System.out.println("=============================");

        System.out.println("Nome: "+cao2.getNome());
        System.out.println("Raça: "+cao2.getRaca());
        System.out.println("Idade: "+cao2.getIdade());
        System.out.println("Peso: "+cao2.getPeso());
        System.out.println("Tem chip: "+cao2.getHasChip());
        System.out.println("Pode ir para adoção? "+cao2.encaminharAdocao());
    }

}