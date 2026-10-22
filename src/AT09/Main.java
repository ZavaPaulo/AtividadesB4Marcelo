package AT09;

import AT09.curso.*;

public class Main {
    static void main(String[] args) {
        CursoOnline cursoOnline = new CursoOnline(
                "Engenharia de Software",
                3200
        );

        cursoOnline.exibirDados();
        cursoOnline.emitirCertificado("Paulo José");

        linha();

        CursoPresencial cursoPresencial = new CursoPresencial(
                "Ciência da Computação",
                3200
        );

        cursoPresencial.exibirDados();
        cursoPresencial.emitirCertificado("Luiz Felipe");

        linha();
    }

    public static void linha() {
        System.out.println();
        System.out.println();
    }
}
