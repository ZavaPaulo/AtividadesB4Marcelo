package atividades.AT20.emprestimoLivro;

public class Livro {
    private String titulo;
    private SituacaoLivro situacao;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.situacao = SituacaoLivro.DISPONIVEL;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalStateException(
                    "ERROR: O título do livro não pode estar vazio"
            );
        }
        this.titulo = titulo;
    }

    public SituacaoLivro getSituacao() {
        return situacao;
    }
    public void setSituacao(SituacaoLivro situacao) {
        this.situacao = situacao;
    }

    public boolean emprestar() {
        if (situacao == SituacaoLivro.DISPONIVEL) {
            situacao = SituacaoLivro.EMPRESTADO;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolver() {
        if (situacao == SituacaoLivro.EMPRESTADO) {
            situacao = SituacaoLivro.DISPONIVEL;
            return true;
        } else {
            return false;
        }
    }
}
