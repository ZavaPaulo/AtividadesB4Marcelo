package atividades.AT20.emprestimoLivro;


public class Main {

    public static void main(String[] args) {

        Livro livro = new Livro("Dom Casmurro");

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Situação: " + livro.getSituacao());

        boolean resultadoEmprestimo = livro.emprestar();

        System.out.println("\nEmpréstimo realizado? " + resultadoEmprestimo);
        System.out.println("Situação: " + livro.getSituacao());

        boolean segundoEmprestimo = livro.emprestar();

        System.out.println("\nSegundo empréstimo? " + segundoEmprestimo);
        System.out.println("Situação: " + livro.getSituacao());

        boolean resultadoDevolucao = livro.devolver();

        System.out.println("\nDevolução realizada? " + resultadoDevolucao);
        System.out.println("Situação: " + livro.getSituacao());

    }

}
