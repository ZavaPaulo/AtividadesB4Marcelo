package AT07;

public class Secretario extends Funcionario implements Registravel{
    private double salarioMensal;

    public Secretario(String nome, String matricula, double salarioMensal) {
        super(nome, matricula);
        setSalarioMensal(salarioMensal);
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }
    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        } else {
            System.out.println("O salário mensal tem que ser maior que zero!");
        }
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }

    @Override
    public void registrarPresenca() {
        presenca();
    }
}