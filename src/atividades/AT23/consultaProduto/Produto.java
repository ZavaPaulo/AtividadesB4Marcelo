package atividades.AT23.consultaProduto;

public class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        setNome(nome);
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalStateException("ERROR: O nome não pode estar vazio!");
        }
        this.nome = nome.trim();
    }

    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        if (preco < 0) {
            throw new IllegalStateException("ERROR: O valor tem que ser maior que zero!");
        }
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nPreço: " + preco;
    }
}
