package AT11;

import java.util.concurrent.atomic.AtomicInteger;
import java.io.Serializable;

public abstract class Veiculo implements Operavel, Serializable {
    private final String placa;
    private String modelo;
    private double valorBaseDiaria;
    private static int totalVeiculos;
    public static final String NOME_LOCADORA = "Locadora Londrina";

    public Veiculo(String placa, String modelo, double valorBaseDiaria) {
        this.placa = placa;
        setModelo(modelo);
        setValorBaseDiaria(valorBaseDiaria);
        this.totalVeiculos = proximoVeiculo.getAndIncrement();
    }

    private static final AtomicInteger proximoVeiculo = new AtomicInteger(1);

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException(
                    "\nERROR: O modelo do veículo não pode estar vazio!"
            );
        }
        this.modelo = modelo;
    }

    public double getValorBaseDiaria() {
        return valorBaseDiaria;
    }
    public void setValorBaseDiaria(double valorBaseDiaria) {
        if (valorBaseDiaria <= 0) {
            throw new IllegalArgumentException(
                    "\nERROR: O valor da diária tem que ser maior que zero!"
            );
        }
        this.valorBaseDiaria = valorBaseDiaria;
    }

    public static int getTotalVeiculos() {
        return totalVeiculos;
    }
    public static void setTotalVeiculos(int totalVeiculos) {
        if (totalVeiculos < 0) {
            throw new IllegalArgumentException(
                    "\nERROR: O total de veículos tem que ser maior que zero!"
            );
        }
        Veiculo.totalVeiculos = totalVeiculos;
    }

    @Override
    public String toString() {
        return " = = = = " + NOME_LOCADORA + " = = = = " +
                "\n" + getClass().getSimpleName() +
                "\nModelo: " + modelo +
                "\nPlaca: " + placa +
                "\nDiária: " + calcularDiaria() +
                "\n" + caracteristica();
    }

    public void exibirDados() {
        System.out.println(toString() + "\n");
    }

    public abstract double calcularDiaria();
    public abstract String caracteristica();

    public double calcularLocacao(int dias) {
        if (dias > 0) {
            return dias * calcularDiaria();
        } else {
            throw new IllegalArgumentException(
                    "ERROR: A quantidade de dias tem que ser maior que zero!"
            );
        }
    }
}
