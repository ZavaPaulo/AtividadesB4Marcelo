package AT10.entrega;

import AT10.contrato.Rastreavel;

public class EntregaBicicleta extends Entrega implements Rastreavel {
    public EntregaBicicleta(String codigo, double distanciaKm) {
        super(codigo, distanciaKm);
    }

    @Override
    public void rastrear() {
        System.out.println("Sua encomenda está indo até você!");
        System.out.println("O ciclista está a " + getDistanciaKm() + " quilômetros!");
    }

    @Override
    public double calcularFrete() {
        return getDistanciaKm() * 2;
    }

    @Override
    public String veiculo() {
        return "Bicicleta";
    }
}
