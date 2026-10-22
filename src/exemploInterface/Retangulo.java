package exemploInterface;

public class Retangulo implements FiguraGeometrica{
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double area() {
        return altura * largura;
    }

    @Override
    public double perimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String toString() {
        return "Retângulo" +
                "\nÁrea: " + area() +
                "\nPerímetro: " + perimetro();
    }

    public void imprimirInformacoes() {
        System.out.println(toString());
    }
}
