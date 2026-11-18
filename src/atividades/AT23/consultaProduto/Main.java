package atividades.AT23.consultaProduto;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {

        //Criando a lista com os Produtos
        List<Produto> produtos =
                Arrays.asList(
                        //Lembrar que para criar a lista, é como criar um objeto comum
                        new Produto("Caderno", 25.00),
                        new Produto("Mochila", 150.00),
                        new Produto("Caneta", 5.00),
                        new Produto("Teclado", 100.00),
                        new Produto("Monitor", 800.00)
                );

        //Usando a Função em Flecha para escrever todos os itens da lista
        produtos.forEach(produto -> System.out.println("\n" + produto));

        //Criando uma lista para os Produtos que tem o valor menor ou igual que 100 reais
        List<String> nomeMaisIgualCem =
                //Pega a lista de Produtos
                produtos.stream()
                        //Filtra os produtos pelo valor
                        .filter(produto -> produto.getPreco() <= 100.00)
                        //Pega os Produtos já filtrados e seleciona somente o nome deles
                        .map(produto -> produto.getNome())
                        //Adiciona os nomes na lista
                        .toList();

        //Imprime a lista com os nomes
        System.out.println(nomeMaisIgualCem);
    }
}