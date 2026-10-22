package AT05;

class Circulo extends FormaGeometrica {
    //Atributo específico do círculo.
    private double raio;

    //Contrutor do círculo.
    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    /**
     * Método do contrato sobrescrito para calcular a área do círculo (pi * r ^ 2).
     * @return a área do círculo.
     */
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    /**
     * Método sobrescrito que apresenta as características específicas do círculo:
     * - Formato;
     * - Raio.
     */
    @Override
    public void exibirDetalhes() {
        System.out.println("Forma: Círculo");
        System.out.println("Raio: " + raio);
    }
}
