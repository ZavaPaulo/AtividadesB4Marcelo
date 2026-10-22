package AT09.curso;

import AT09.contrato.Certificavel;

public class CursoOnline extends Curso implements Certificavel {
    public CursoOnline(String nome, int cargaHoraria) {
        super(nome, cargaHoraria);
    }

    @Override
    public void emitirCertificado(String nomeAluno) {
        System.out.println("O Aluno " + nomeAluno + " se formou!");
        System.out.println("No curso " + getNome() + " de forma Online!");
    }

    @Override
    public double calcularValor() {
        return 249.99;
    }

    @Override
    public String modalidade() {
        return "Online";
    }
}