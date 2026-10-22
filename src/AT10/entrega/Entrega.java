package AT10.entrega;

public abstract class Entrega {
    private String codigo;
    private double distanciaKm;

    public Entrega(String codigo, double distanciaKm) {
        setCodigo(codigo);
        setDistanciaKm(distanciaKm);
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException(
                    "\nERROR: O código não pode estar vazio!"
            );
        }
        this.codigo = codigo;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }
    public void setDistanciaKm(double distanciaKm) {
        if (distanciaKm <= 0) {
            throw new IllegalArgumentException(
                    "\nERROR: A distância tem que ser maior que zero!"
            );
        }
        this.distanciaKm = distanciaKm;
    }

    @Override
    public String toString() {
        return "Entrega" +
                "\nCódigo: " + codigo +
                "\nDistância: " + distanciaKm +
                "\nValor do Frete: R$" + calcularFrete() +
                "\nVeículo: " + veiculo();
    }

    public abstract double calcularFrete();
    public abstract String veiculo();

    public void exibirDados(){
        System.out.println(toString() + "\n");
    }
}