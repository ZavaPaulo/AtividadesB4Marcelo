package AT11;

public class Carro extends Veiculo{
    private int quantidadePortas;
    private boolean ligado;

    public Carro(
            String placa,
            String modelo,
            double valorBaseDiaria,
            int quantidadePortas
    ) {
        super(placa, modelo, valorBaseDiaria);
        setQuantidadePortas(quantidadePortas);
        this.ligado = false;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }
    public void setQuantidadePortas(int quantidadePortas) {
        if (quantidadePortas <= 0) {
            throw new IllegalArgumentException(
                    "ERROR: A quantidade de portas tem que ser maior que zero!"
            );
        }
        this.quantidadePortas = quantidadePortas;
    }

    public boolean isLigado() {
        return ligado;
    }

    @Override
    public double calcularDiaria() {
        return getValorBaseDiaria() + 50.00;
    }

    @Override
    public String caracteristica() {
        return "Portas: " + quantidadePortas;
    }

    @Override
    public void ligar() throws InterruptedException {
        if (ligado) {
            System.out.println("O Carro já está ligado!");
            return;
        }

        System.out.print("Ligando o carro");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.println(".");
        Thread.sleep(500);

        System.out.println("Carro " + getModelo() + " está ligado!");
        ligado = true;
    }

    @Override
    public void desligar() throws InterruptedException{
        if (!ligado) {
            System.out.println("O carro já estava desligado!");
            return;
        }

        System.out.print("Desligando o carro");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.println(".");
        Thread.sleep(500);

        System.out.println("Carro " + getModelo() + " está desligado!");
        ligado = false;
    }
}
