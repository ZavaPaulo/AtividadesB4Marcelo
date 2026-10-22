package AT11;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    static void main(String[] args) throws InterruptedException {
        Carro carro = new Carro(
                "ABC1D23",
                "Onix",
                100.00,
                4
        );

        System.out.println("= = = CARRO = = =");
        carro.exibirDados();
        System.out.println();

        System.out.println("___ALUGANDO___");
        System.out.println("O valor da locação do carro ficou: R$" + carro.calcularLocacao(3));
        System.out.println();

        System.out.println("___QUANTIDADE DE PORTAS___");
        System.out.println(carro.getModelo() + " tem " + carro.getQuantidadePortas() + " portas!");
        System.out.println();

        System.out.println("___LIGANDO___");
        carro.ligar();
        carro.ligar();
        System.out.println();

        System.out.println("___DESLIGANDO___");
        carro.desligar();
        carro.desligar();
        System.out.println();

        System.out.println("___QUANTIDADE DE VEÍCULOS___");
        System.out.println("Foram criados " + Veiculo.getTotalVeiculos() + " veículos!");

        Moto moto = new Moto(
                "XYZ9A87",
                "CG 160",
                60.00,
                160
        );
        System.out.println("= = = MOTO = = =");
        moto.exibirDados();
        System.out.println();

        System.out.println("___ALUGANDO___");
        System.out.println("O valor da locação da moto ficou: R$" + moto.calcularLocacao(3));

        System.out.println();

        System.out.println("___QUANTIDADE DE CILINDRADAS___");
        System.out.println(moto.getModelo() + " tem " + moto.getCilindradas() + " cilindradas!");
        System.out.println();

        System.out.println("___LIGANDO___");
        moto.ligar();
        moto.ligar();
        System.out.println();

        System.out.println("___DESLIGANDO___");
        moto.desligar();
        moto.desligar();
        System.out.println();

        System.out.println("___QUANTIDADE DE VEÍCULOS___");
        System.out.println("Foram criados " + Veiculo.getTotalVeiculos() + " veículos!");
    }
}