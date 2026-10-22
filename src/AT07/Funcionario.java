package AT07;

public abstract class Funcionario {
    protected String nome;
    private String matricula;
    private boolean presente = true;

    public Funcionario(String nome, String matricula) {
        setNome(nome);
        setMatricula(matricula);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Insira um nome válido!");
        }
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        if (!matricula.isEmpty()) {
            this.matricula = matricula;
        } else {
            System.out.println("Insira uma matrícula válida!");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "\nNome: " + getNome() +
                "\nMatrícula: " + getMatricula() +
                "\nSalário: " + calcularSalario();
    }

    public void exibirDados() {
        System.out.println(toString());
    }

    public abstract double calcularSalario();

    public void presenca() {
        System.out.printf(getClass().getSimpleName() + " está presente: %s", presente ? "SIM" : "NÃO");
    }
}