package exemploInterface;

public class Circulo implements FiguraGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double perimetro() {
        return Math.PI * raio * 2;
    }

    @Override
    public String toString() {
        return "Círculo" +
                "\nÁrea: " + area() +
                "\nPerímetro: " + perimetro();
    }

    public void imprimirInformacoes() {
        System.out.println(toString());
    }
}
