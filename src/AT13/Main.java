package AT13;

public class Main {
    static void main(String[] args) throws SaldoInsuficienteException {
        ContaBancaria contaBancaria = new ContaBancaria(
                "Paulo José",
                500.00
        );

        try {
            contaBancaria.sacar(Double.parseDouble("100.00"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Saldo atual: " + contaBancaria.getSaldo());
        }

        try {
            contaBancaria.sacar(Double.parseDouble("600.00"));
        } catch (SaldoInsuficienteException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Saldo atual: " + contaBancaria.getSaldo());
        }

        try {
            contaBancaria.sacar(Double.parseDouble("-50.00"));
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Saldo atual: " + contaBancaria.getSaldo());
        }

        try {
            contaBancaria.sacar(Double.parseDouble("abc"));
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Saldo atual: " + contaBancaria.getSaldo());
        }

    }
}
