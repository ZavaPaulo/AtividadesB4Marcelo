package atividades.AT19;

public class Caixa<T> {
    private T conteudo;

    public void guardar(T valor) {
        if (valor != null) {
            this.conteudo = valor;
        } else {
            System.out.println("O valor não pode estar vazio!");
        }
    }

    public T obter() {
        return conteudo;
    }
}