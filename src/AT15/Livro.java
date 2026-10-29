package AT15;

public class Livro extends MaterialBiblioteca implements Emprestavel{
    private boolean emprestado;

    public Livro(String titulo, String codigo) {
        super(titulo, codigo);
        this.emprestado = false;
    }

    @Override
    public void emprestar() {
        if (!emprestado) {
            System.out.println("Você emprestou o livro " + getTitulo() + "!");
            emprestado = true;
        } else {
            throw new IllegalStateException(
                    "O livro não pode ser emprestado," +
                            "\nEle já está emprestado!"
            );
        }
    }

    @Override
    public void devolver() {
        if (emprestado) {
            System.out.println("você devolveu o livro " + getTitulo() + "!");
            emprestado = false;
        } else {
            throw new IllegalStateException(
                    "Você não pode devolver o livro," +
                            "\nO livro não estava emprestado!"
            );
        }
    }

    @Override
    public void exibirSituacao() {
        if (emprestado) {
            System.out.println("O livro " + getTitulo() + " está emprestado!");
        } else {
            System.out.println("O livro " + getTitulo() + " não está emprestado!");
        }
    }
}
