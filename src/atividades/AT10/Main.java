package atividades.AT10;

import atividades.AT10.entrega.EntregaBicicleta;
import atividades.AT10.entrega.EntregaCaminhao;

public class Main {
    static void main(String[] args) {
        EntregaBicicleta entregaBicicleta = new EntregaBicicleta(
                "018397n4tv6",
                5.00
        );

        entregaBicicleta.exibirDados();
        entregaBicicleta.rastrear();

        System.out.println();
        System.out.println();

        EntregaCaminhao entregaCaminhao = new EntregaCaminhao(
                "2347t980vn6",
                20.00
        );

        entregaCaminhao.exibirDados();
        entregaCaminhao.rastrear();
    }
}
