package AT09.curso;

import AT09.contrato.Certificavel;

public class CursoPresencial extends Curso implements Certificavel {
    public CursoPresencial(String nome, int cargaHoraria) {
        super(nome, cargaHoraria);
    }

    @Override
    public void emitirCertificado(String nomeAluno) {
        System.out.println("O Aluno " + nomeAluno + " se formou!");
        System.out.println("No curso " + getNome() + " de forma Presencial!");
    }

    @Override
    public double calcularValor() {
        return 1700.00;
    }

    @Override
    public String modalidade() {
        return "Presencial";
    }
}
