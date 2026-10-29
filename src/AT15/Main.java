package AT15;

public class Main {
    static void main(String[] args) {
        Livro livro = new Livro(
                "Mob Dick",
                "tw-n3t-2n8-1tmu"
        );

        try {
            livro.emprestar();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            livro.exibirSituacao();
        }

        try {
            livro.emprestar();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            livro.exibirSituacao();
        }

        try {
            livro.devolver();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            livro.exibirSituacao();
        }

        try {
            livro.devolver();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            livro.exibirSituacao();
        }
    }
}
