package AT06;

public class Impressora implements Conectavel{
    protected String modelo;

    public Impressora(String modelo) {
        setModelo(modelo);
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        if (!modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Insira um modelo válido!");
        }
    }

    @Override
    public void conectar() {
        System.out.println("A impressora foi conectada por USB!");
    }

    @Override
    public void desconectar() {
        System.out.println("A impressora foi desconectada!");
    }
}
