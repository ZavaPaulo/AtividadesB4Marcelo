package exemploInterface;

public class Main {
    static void main(String[] args) {
//        Animal a1 = new Animal();
//        a1.info();

        Retangulo r1 = new Retangulo(
                10.0,
                7.0
        );

        r1.imprimirInformacoes();
        System.out.println();

        Circulo c1 = new Circulo(
                10
        );

        c1.imprimirInformacoes();
    }
}
