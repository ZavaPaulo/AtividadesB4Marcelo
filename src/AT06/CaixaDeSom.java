package AT06;

public class CaixaDeSom implements Conectavel{
    protected String nome;

    public CaixaDeSom(String nome) {
        setNome(nome);
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

    @Override
    public void conectar() {
        System.out.println("A caixa de som foi conectada por Bluetooth!");
    }

    @Override
    public void desconectar() {
        System.out.println("A caixa de som foi desconectada!");
    }
}
