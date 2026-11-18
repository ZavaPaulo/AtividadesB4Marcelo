package exemplos.lambda.arquivo02;

public class Main {
    static void main(String[] args) {
        //Reescrevendo a soma comum
        Calculadora somaTradicional = new Calculadora() {
            @Override
            public int calcular(int a, int b) {
                return a + b;
            }
        };
        //Imprimindo a soma tradicional
        System.out.println("Soma comum: " + somaTradicional.calcular(5, 6));

        //Criando a soma em linha
        Calculadora somaLambda = (a, b) ->  a + b;
        //Imprimindo a soma em Lambda
        System.out.println(
            "Soma Lambda: " +
            somaLambda.calcular(7, 8)
        );
    }
}
