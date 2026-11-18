package prova;

public abstract class Curso {
    private String nome;        //Armazenar o nome do curso.
    private int cargaHoraria;   //Armazenar a duração do curso em horas.
    private Nivel nivel;        //Representar o nível básico ou avançado.

    public Curso(String nome, int cargaHoraria, Nivel nivel) {
        setNome(nome);
        setCargaHoraria(cargaHoraria);
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        try {
            this.nome = nome;
        } catch (IllegalArgumentException e) {
            System.out.println("O nome não pode ser nulo, vazio ou composto apenas por espaços");
        }
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        try {
            this.cargaHoraria = cargaHoraria;
        } catch (IllegalArgumentException e) {
            System.out.println("A carga horária tem que ser maior que zero!");
        }
    }

    public Nivel getNivel() {
        return nivel;
    }
    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Curso: " + nome +
                "\nCarga Horária: " + cargaHoraria +
                "\nNível: " + nivel;
    }

    public void exibirDados() {
        System.out.println(toString() + "\n");
    }
}
