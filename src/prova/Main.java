package prova;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Catalogo<Curso> cursos = new Catalogo<>();

        int escolha = -1;
        int quantidadeEAD = 0;
        int quantidadePresencial = 0;
        int quantidadeAvancado = 0;

        do {
            String nome = null;
            int horas = -1;
            int nivel = 0;

            menu();
            escolha = leitor.nextInt();

            try {
                if (escolha == 1) {
                    System.out.println("Você escolheu CURSO EAD");
                    System.out.print("Informe o nome do Curso: ");
                    nome = leitor.next();
                    System.out.print("Informe a quantidade de horas do Curso: ");
                    horas = leitor.nextInt();

                    do {
                        System.out.println("Selecione o NÍVEL do curso: ");
                        System.out.println(
                                " 1 - BÁSICO" +
                                        "\n 2 - AVANÇADO"
                        );
                        System.out.print("Nível: ");
                        nivel = leitor.nextInt();
                    } while (nivel != 1 && nivel != 2);

                    if (nivel == 1) {
                        cursos.adicionar(new CursoEAD(nome, horas, Nivel.BASICO));
                    } else if (nivel == 2) {
                        cursos.adicionar(new CursoEAD(nome, horas, Nivel.AVANCADO));
                    }
                    System.out.println("Curso " + nome + " foi cadastrado com sucesso");
                    quantidadeEAD++;
                } else if (escolha == 2) {
                    System.out.println("Você escolheu CURSO PRESENCIAL");

                    System.out.print("Informe o nome do Curso: ");
                    nome = leitor.next();

                    System.out.print("Informe a quantidade de horas do Curso: ");
                    horas = leitor.nextInt();

                    do {
                        System.out.println("Selecione o NÍVEL do curso: ");
                        System.out.println(
                                " 1 - BÁSICO" +
                                "\n 2 - AVANÇADO"
                        );
                        System.out.print("Nível: ");
                        nivel = leitor.nextInt();
                    } while (nivel != 1 && nivel != 2);

                    if (nivel == 1) {
                        cursos.adicionar(new CursoPresencial(nome, horas, Nivel.BASICO));
                    } else if (nivel == 2) {
                        cursos.adicionar(new CursoPresencial(nome, horas, Nivel.AVANCADO));
                    }

                    System.out.println("Curso " + nome + " foi cadastrado com sucesso");
                    quantidadePresencial++;
                } else if (escolha == 0) {
                    System.out.println("Saindo...");
                } else {
                    System.out.println("Opção inválida!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Opcção Inválida!");
            }
        } while (escolha != 0);


        //Imprimindo os cursos
        System.out.println("\n" + "\n" + "\nIMPRIMINDO OS CURSOS");
        if (cursos.getElementos().size() == 0) {
            System.out.println("Nenhum curso foi cadastrado!");
        } else {
            for (Curso curso : cursos.getElementos()) {
                System.out.println(curso);
                System.out.println();
            }
        }

        //Informando os Cursos Avançados
        System.out.println("\n" + "\n" + "\nIMPRIMINDO OS CURSOS AVANÇADOS");
        for (Curso curso : cursos.getElementos()) {
            if (curso.getNivel() == Nivel.AVANCADO) {
                System.out.println(curso);
                quantidadeAvancado++;
            }
            if (quantidadeAvancado == 0) {
                System.out.println("nenhum curso avançado foi adicionado!");
            }
        }


        System.out.println();
        System.out.println();

        System.out.println("= = = = RESULTADO FINAL = = = =" +
                "\nTotal de Cursos EAD: " + quantidadeEAD +
                "\nTotal de Cursos Presenciais: " + quantidadePresencial +
                "\nTotal de Cursos Cadastrados: " + (quantidadeEAD + quantidadePresencial));

    }

    public static void menu() {
        System.out.println(
                " 1 - Cadastrar Curso EAD." +
                "\n 2 - Cadastrar Curso Presencial." +
                "\n 0 - Encerrar Cadastro."
        );
    }
}
