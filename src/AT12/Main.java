package AT12;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String nome = leitor.next();

        System.out.print("Informe a idade do aluno: ");
        String idade = leitor.next();



        try {
            int idadeInteira = Integer.parseInt(idade);

            Aluno aluno = new Aluno(
                    nome,
                    idadeInteira
            );
            System.out.println("Aluno cadastrado com sucesso!");
            aluno.exibirDados();
        } catch (Exception e) {
            System.out.println("A idade tem que ser um número inteiro!");
        } finally {
            leitor.close();
        }

    }
}
