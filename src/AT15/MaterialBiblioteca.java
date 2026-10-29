package AT15;

public abstract class MaterialBiblioteca {
    private String titulo;
    private String codigo;

    public MaterialBiblioteca(String titulo, String codigo) {
        setTitulo(titulo);
        setCodigo(codigo);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "O título não pode estar vazio!"
            );
        }

        this.titulo = titulo.trim();
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "O código não pode estar vazio!"
            );
        }

        this.codigo = codigo.trim();
    }

    @Override
    public String toString() {
        return "Livro" +
                "\nTítulo: " + titulo +
                "\nCódigo: " + codigo;
    }

    public void exibirDados() {
        System.out.println(toString() + "\n");
    }

    public abstract void exibirSituacao();
}