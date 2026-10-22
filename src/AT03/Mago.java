package AT03;

public class Mago extends Personagem{
    public Mago(String nome) {
        super(nome);
        setForca(20);
    }

    @Override
    public void atacar(Personagem personagem) {
        System.out.println(getNome() + " ataca:");
        System.out.println("Lança feitiço!");
        informandoAtaque(personagem);
    }
}