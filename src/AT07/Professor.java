package AT07;

public class Professor extends Funcionario implements Registravel {
    private int quantidadeHoras;
    private double valorHora;

    public Professor(String nome, String matricula, int quantidadeHoras, double valorHora) {
        super(nome, matricula);
        setQuantidadeHoras(quantidadeHoras);
        setValorHora(valorHora);
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }
    public void setQuantidadeHoras(int quantidadeHoras) {
        if (quantidadeHoras >= 0) {
            this.quantidadeHoras = quantidadeHoras;
        } else {
            System.out.println("A quantidade de horas tem que ser maior que zero!");
        }
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        if (valorHora > 0) {
            this.valorHora = valorHora;
        } else {
            System.out.println("O valor da hora tem que ser maior que zero!");
        }
    }

    @Override
    public double calcularSalario() {
        return quantidadeHoras * valorHora;
    }

    @Override
    public void registrarPresenca() {
        presenca();
    }
}