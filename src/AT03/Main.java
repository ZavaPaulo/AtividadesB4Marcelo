package AT03;
import java.util.Timer;

public class Main {
    static void main(String[] args) throws InterruptedException {
        //Instanciando a classe Guerreiro:
        Personagem guerreiro = new Guerreiro("São Jorge");

        //Instanciando o Mago
        Personagem mago = new Mago("Merlin");

        //= = = = = = = = = = = = =
        //       STATUS BASE
        //= = = = = = = = = = = = =
        System.out.println("= = = = = STATUS BASE = = = = =");

        //= = = = = = = = = = =
        //     GUERREIRO
        //= = = = = = = = = = =
        System.out.println("= = = = GUERREIRO = = = =");

        //Exibindo os status do guerreiro
        guerreiro.exibirStatus();
        System.out.println();
        Thread.sleep(1500);

        //Guerreiro subindo de nível
        guerreiro.subirNivel();
        System.out.println();
        Thread.sleep(1500);

        //Exibindo os status do guerreiro depois de subir de nível
        guerreiro.exibirStatus();
        Thread.sleep(1500);

        System.out.println();
        System.out.println();

        Thread.sleep(3000);

        //= = = = = = = = = = =
        //        MAGO
        //= = = = = = = = = = =
        System.out.println("= = = = MAGO = = = =");

        //Exibindo os status do mago
        mago.exibirStatus();
        System.out.println();
        Thread.sleep(1500);

        //Mago subindo de nível
        mago.subirNivel();
        System.out.println();
        Thread.sleep(1500);

        //Exibindo os status do mago depois de subir de nível
        mago.exibirStatus();
        System.out.println();
        Thread.sleep(1500);

        //= = = = = = = = = = =
        //   DEPOIS DE ATACAR
        //= = = = = = = = = = =
        System.out.println("= = = = = ATAQUES = = = = =");

        //= = = = = = = = = = =
        //     GUERREIRO
        //= = = = = = = = = = =
        System.out.println("= = = GUERREIRO ATACA = = =");

        //Guerreiro usando o seu ataque
        guerreiro.atacar(mago);
        System.out.println();
        Thread.sleep(1500);

        //Status do mago depois do ataque
        mago.exibirStatus();
        System.out.println();
        Thread.sleep(3000);

        //= = = = = = = = = = =
        //        MAGO
        //= = = = = = = = = = =
        System.out.println("= = = MAGO ATACA = = =");

        //Mago atacando o guerreiro
        mago.atacar(guerreiro);
        System.out.println();
        Thread.sleep(1500);

        //Exibindo status do guerreiro depois do ataque
        guerreiro.exibirStatus();
        System.out.println();
        Thread.sleep(1500);
    }
}