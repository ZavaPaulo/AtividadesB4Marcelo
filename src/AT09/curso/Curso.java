package AT09.curso;

public abstract class Curso {
    private String nome;
    private int cargaHoraria;

    public Curso(String nome, int cargaHoraria) {
        setNome(nome);
        setCargaHoraria(cargaHoraria);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("ERROR: O nome não pode estar vazio!");
        }
        this.nome = nome.trim();
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria <= 0) {
            throw new IllegalArgumentException("ERROR: A carga horária do curso tem que ser maior que zero!");
        }
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "\nNome: " + nome +
                "\nCarga horária: " + cargaHoraria +
                "\nMensalidade: R$" + calcularValor() +
                "\nModalidade: " + modalidade();
    }

    public void exibirDados() {
        System.out.println(toString() + "\n");
    }

    public abstract double calcularValor();
    public abstract String modalidade();
}