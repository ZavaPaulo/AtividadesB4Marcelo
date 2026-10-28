package AT13;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        setTitular(titular);
        setSaldo(saldo);
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException(
                    "O titular da conta bancária não pode estar vazia!"
            );
        }
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException(
                    "O saldo tem que ser maior que zero!"
            );
        }
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta Bancária" +
                "\nTitular: " + titular +
                "\nSaldo: " + saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (!(valor > 0)) {
            throw new IllegalArgumentException(
                    "O valor para sacar tem que ser maior que zero!"
            );
        }

        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para o saque");
        }

        saldo -= valor;
        System.out.println("Saque feito com sucesso!");
    }

    public void exibirDados() {
        System.out.println(toString() + "\n");
    }
}
