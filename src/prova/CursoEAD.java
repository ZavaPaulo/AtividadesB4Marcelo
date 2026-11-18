package prova;

public class CursoEAD extends Curso implements Iniciavel{
    public CursoEAD(String nome, int cargaHoraria, Nivel nivel) {
        super(nome, cargaHoraria, nivel);
    }

    @Override
    public void iniciar() {
        System.out.println("O curso: " + getNome() + "\nTem que ser acessado pela plataforma virtual!");
    }
}
