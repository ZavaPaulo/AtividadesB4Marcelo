package AT11;

public class Moto extends Veiculo{
    private int cilindradas;
    private boolean ligado;

    public Moto(
            String placa,
            String modelo,
            double valorBaseDiaria,
            int cilindradas
    ) {
        super(placa, modelo, valorBaseDiaria);
        setCilindradas(cilindradas);
        this.ligado = false;
    }

    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        if (cilindradas <= 0) {
            throw new IllegalArgumentException(
                    "ERROR: A quantidade de cilindradas tem que ser maior que zero!"
            );
        }
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularDiaria() {
        return getValorBaseDiaria() + 20.00;
    }

    @Override
    public String caracteristica() {
        return "Cilindradas: " + cilindradas;
    }

    @Override
    public void ligar() throws InterruptedException {
        if (ligado) {
            System.out.println("A Moto já está ligado!");
            return;
        }

        System.out.print("Ligando a moto");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.println(".");
        Thread.sleep(500);

        System.out.println("Moto " + getModelo() + " está ligado!");
        ligado = true;
    }

    @Override
    public void desligar() throws InterruptedException {
        if (!ligado) {
            System.out.println("A moto já estava desligado!");
            return;
        }

        System.out.print("Desligando a moto");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.println(".");
        Thread.sleep(500);

        System.out.println("Moto " + getModelo() + " está desligado!");
        ligado = false;
    }
}
