package AT03;

public class Guerreiro extends Personagem{
    public Guerreiro(String nome) {
        super(nome);
        setForca(30);
    }

    @Override
    public void atacar(Personagem personagem) {
        System.out.println(getNome() + " ataca:");
        System.out.println("Golpe de espada!");
        informandoAtaque(personagem);
    }
}