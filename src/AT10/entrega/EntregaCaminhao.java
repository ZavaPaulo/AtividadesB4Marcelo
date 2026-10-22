package AT10.entrega;

import AT10.contrato.Rastreavel;

public class EntregaCaminhao extends Entrega implements Rastreavel {
    public EntregaCaminhao(String codigo, double distanciaKm) {
        super(codigo, distanciaKm);
    }

    @Override
    public void rastrear() {
        System.out.println("Sua encomenda está indo até você!");
        System.out.println("O Motorista está a " + getDistanciaKm() + " quilômetros!");
    }

    @Override
    public double calcularFrete() {
        return 30 + getDistanciaKm() * 5;
    }

    @Override
    public String veiculo() {
        return "Caminhão";
    }
}
