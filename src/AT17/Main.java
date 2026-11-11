package AT17;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //ARRAY
        String[] nomeArray = new String[3];

        //Preenchendo o nome do array
        System.out.println("Informe os nomes para o ARRAY");
        for (int i = 0; i < 3; i++) {
            System.out.print("informe o " + (i + 1) + "° nome: ");
            nomeArray[i] = leitor.next();
        }

        //Informando como ficou a lista
        System.out.println("\nO Array ficou: ");
        for (String nomes : nomeArray) {
            System.out.println(nomes);
        }

        System.out.println();
        System.out.println();

        //ARRAYLIST
        ArrayList<String> nomeList = new ArrayList<>();

        //Preenchendo os nomes da lista
        System.out.println("Informe os nomes da Lista");
        for (int i = 0; i < 3; i++) {
            System.out.print("informe o " + (i + 1) + "° nome: ");
            nomeList.add(leitor.next());
        }

        //Informando como ficou a lista
        System.out.println("\nA lista ficou: ");
        for (String nomes : nomeList) {
            System.out.println(nomes);
        }

        //Adicionando o quarto aluno a lista
        System.out.print("\nInforme o nome do quarto aluno: ");
        nomeList.add(leitor.next());

        //Informando como está a lista
        System.out.println("A lista está com " + nomeList.size() + " nomes.");
        System.out.println("Os nomes na lista são: ");
        for (String nomes : nomeList) {
            System.out.println(nomes);
        }

        //Trocando os nomes 2 e 4
        System.out.println("\nLista com os nomes 2 e 4 trocados: ");
        String nome = nomeList.get(3);
        nomeList.set(3, nomeList.get(1));
        nomeList.set(1, nome);
        for (String nomes : nomeList) {
            System.out.println(nomes);
        }
    }
}
