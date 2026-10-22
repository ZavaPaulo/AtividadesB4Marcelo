package AT05;

public class Main {
    public static void main(String[] args) {
        //Instanciando o retângulo.
        FormaGeometrica retangulo = new Retangulo("Azul", 5.0, 3.0);

        //Intanciando o círculo.
        FormaGeometrica circulo = new Circulo("Vermelho", 2.0);

        //Apresentando os dados do retângulo.
        retangulo.apresentar();

        //Apresentando os dados do círculo.
        circulo.apresentar();
    }
}
