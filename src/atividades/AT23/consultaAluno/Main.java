package atividades.AT23.consultaAluno;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {
        //Criando a lista com os alunos, nome + nota
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Ana", 8.5),
                new Aluno("Bruno", 6.0),
                new Aluno("Carlos", 7.0),
                new Aluno("Diana", 9.0),
                new Aluno("Eduardo", 4.5)
        );

        //Criando a lista com mensagem para os alunos aprovados
        List<String> mensagemAprovados =
                alunos.stream()
                        .filter(aluno -> aluno.getNota() >= 7.0)
                        .map(aluno -> "Parabéns " + aluno.getNome() + "! Você passou com nota " + aluno.getNota() + "\n")
                        .toList();

        //Imprimindo a mensagem no console
        System.out.println(mensagemAprovados);
    }
}
