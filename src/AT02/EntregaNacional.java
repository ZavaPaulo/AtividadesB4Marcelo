package AT02;

public class EntregaNacional extends Entrega{
    private double distancia;

    public EntregaNacional(String codigoProduto, double distancia) {
        super(codigoProduto);
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public double calcularValorFrete() {
        return distancia * 1.5;
    }

    @Override
    public void exibirResumo() {
        super.exibirResumo();
        System.out.println("Distância: " + distancia);
    }
}
