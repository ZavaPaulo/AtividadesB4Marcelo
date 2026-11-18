package atividades.AT19;

public class Main {
    static void main(String[] args) {
        Caixa<String> nomeProduto = new Caixa<>();
        nomeProduto.guardar("Caderno");

        Caixa<Integer> quantidadeProduto = new Caixa<>();
        quantidadeProduto.guardar(10);

        Caixa<Double> valorProduto = new Caixa<>();
        valorProduto.guardar(25.50);

        System.out.println("Nome: " + nomeProduto.obter() +
                "\nQuantidade disponível: " + quantidadeProduto.obter() +
                "\nValor do produto: " + valorProduto.obter()
        );
    }
}
