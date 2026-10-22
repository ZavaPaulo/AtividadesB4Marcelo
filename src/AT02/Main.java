package AT02;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Entrega entregaLocal = new EntregaLocal("123");
        System.out.println("= = = = Entrega Local = = = =");
        entregaLocal.exibirResumo();
        pularLinha();

        System.out.print("Informe a distância para calcular o valor do frete: ");
        double distancia = leitor.nextDouble();

        Entrega entregaNacional = new EntregaNacional("456", distancia);
        System.out.println("= = = = Entrega Nacional = = = =");
        entregaNacional.exibirResumo();
        pularLinha();

        leitor.close();
    }

    public static void pularLinha() {
        System.out.println();
        System.out.println();
    }
}
