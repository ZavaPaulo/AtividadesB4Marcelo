package prova;

public class CursoPresencial extends Curso implements Iniciavel{
    private static final Nivel nivel = null;

    public CursoPresencial(String nome, int cargaHoraria, Nivel basico) {
        super(nome, cargaHoraria, nivel);
    }

    @Override
    public void iniciar() {
        System.out.println("O curso: " + getNome() + "\nTerão suas aulas na instutuição!");
    }
}
