package AT03;

public abstract class Personagem {
    protected String nome;
    protected int nivel;
    private int vida;
    protected int forca;

    public Personagem(String nome) {
        setNome(nome);
        this.nivel = 1;
        this.vida = 100;
        this.forca = 25;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome informado é inválido!");
        }
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        if (nivel > 0) {
            this.nivel = nivel;
        } else {
            System.out.println("O nível tem que ser maior que zero!");
        }
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        if (vida >= 0) {
            this.vida = vida;
        } else {
            System.out.println("Os pontos de vida tem que ser maior que zero!");
        }
    }
    public void menosVida(int dano) {
        if (dano > 0) {
            setVida(getVida() - dano);
            if (getVida() < 0) {
                setVida(0);
            }
        } else {
            System.out.println("O dano tem que ser maior que zero!");
        }
    }

    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        if (forca > 0) {
            this.forca = forca;
        } else {
            System.out.println("A força do personagem tem que ser maior que zero!");
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nVida: " + vida +
                "\nForça: " + forca +
                "\nNível: " + nivel;
    }

    public void subirNivel() {
        System.out.println(getNome() + " subiu de níve!");
        System.out.print(nivel + " -> ");
        nivel++;
        System.out.println(nivel);
    }

    public void receberDano(int forca) {
        menosVida(forca);
    }

    public abstract void atacar(Personagem persongem);

    public void exibirStatus() {
        System.out.println(toString());
    }

    public void informandoAtaque(Personagem personagem) {
        System.out.println(personagem.getNome() + " recebeu o ataque: ");
        System.out.print("Sua vida saiu de " + personagem.getVida());
        personagem.receberDano(getForca());
        System.out.println(" -> " + personagem.getVida());
    }
}