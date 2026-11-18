package exemplos.lambda.arquivo03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {
        //Cria uma lista com várias palavras já
        List<String> palavras =
                Arrays.asList("Lambda",
                        "C#",
                        "Java",
                        "JavaScript",
                        "React",
                        "Intellij",
                        "Dart");
        //Imprimindo a lista inicial
        System.out.println(palavras);

        //Criando a lista para a selelção
        List<String> palavrasFiltradas = new ArrayList<>();
        //Verificação para se a lista tem pelo menos cinco letras
        for (String palavra : palavras) {
            if (palavra.length() >= 5) {
                //Adicionando as palavras selecionadas
                palavrasFiltradas.add(palavra);
            }
        }
        //Imprimindo a lista selecionada
        System.out.println(palavrasFiltradas);

        //Criando a lista mais rápido
        List<String> pf = palavras
                .stream()
                .filter( (palavra) -> palavra.length() > 5 )
                .toList();
        //Imprimindo a lista pf (Palavras Filtradas com mais de cinco letras)
        System.out.println(pf);
    }
}
