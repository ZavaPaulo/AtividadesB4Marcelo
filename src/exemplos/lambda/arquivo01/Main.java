package exemplos.lambda.arquivo01;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            valores.add(i * 5);
        }

        ArrayList<Integer> dobro = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        for (Integer valor : valores) {
            //Quarda o dobro do valor da lista
            dobro.add(valor * 2);

            //Quarda os valores pares
            if (valor % 2 == 0) {
                par.add(valor);
            //Quarda os valores ímpares
            } else {
                impar.add(valor);
            }
        }

        //Adiciona o dobro dos valores da lista na lista dobro
        valores.forEach( (valor ) -> { dobro.add(valor * 2); } );

        //Adiciona os valor ímpares na lista impar e os valores pares na lista par
        valores.forEach( (valor ) -> { if (valor % 2 == 0) { par.add(valor); } else { impar.add(valor); } } );
    }
}
