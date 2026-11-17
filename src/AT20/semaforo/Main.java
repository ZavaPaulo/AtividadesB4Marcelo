package AT20.semaforo;

import javax.swing.plaf.IconUIResource;

public class Main {
    static void main(String[] args) {
        orientacaoSemaforo(CorSemaforo.VERDE);
        orientacaoSemaforo(CorSemaforo.AMARELO);
        orientacaoSemaforo(CorSemaforo.VERMELHO);

    }

    public static void orientacaoSemaforo(CorSemaforo corSemaforo) {
        switch (corSemaforo) {
            case VERDE:
                System.out.println("Siga.");
                break;

            case AMARELO:
                System.out.println("Atenção.");
                break;

            case VERMELHO:
                System.out.println("Pare");
                break;
        }
    }
}
