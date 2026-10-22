package AT02;

public class EntregaLocal extends Entrega{
    public EntregaLocal(String codigoProduto) {
        super(codigoProduto);
    }

    @Override
    public double calcularValorFrete() {
        return 10.00;
    }
}
