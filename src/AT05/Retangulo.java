package AT05;

class Retangulo extends FormaGeometrica {
    //Características específicas do retângulo:
    // - Largura;
    // - Altura.
    private double largura;
    private double altura;

    //Contrutor do Retângulo.
    public Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    /**
     * Método sobrescrito para caolcular a área do retângulo (largura * altura).
     * @return a área específica do retângulo
     */
    @Override
    public double calcularArea() {
        return largura * altura;
    }

    /**
     * Apresenta os dados específicos do retângulo:
     * - Retângiulo;
     * - Largura;
     * - Altura.
     * */
    @Override
    public void exibirDetalhes() {
        System.out.println("Forma: Retângulo");
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
    }
}
