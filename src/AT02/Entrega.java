package AT02;

public abstract class Entrega {
    protected String codigoProduto;

    public Entrega(String codigoProduto) {
        setCodigoProduto(codigoProduto);
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        if (!codigoProduto.isEmpty()) {
            this.codigoProduto = codigoProduto;
        } else {
            System.out.println("O código do produto é  inválido");
        }
    }

    public abstract double calcularValorFrete();

    public void exibirResumo() {
        System.out.println("Código: " + codigoProduto);
        System.out.println("Valor do frete: R$" + calcularValorFrete());

    }
}
