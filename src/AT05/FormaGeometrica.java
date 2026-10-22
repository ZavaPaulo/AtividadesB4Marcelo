package AT05;

public abstract class FormaGeometrica {
    //Atruibuto padrão da classe.
    private String cor;

    //COnstrutor da Classe.
    public FormaGeometrica(String cor) {
        this.cor = cor;
    }

    /**
     * Busca a cor da forma geométrica.
     * @return a cor da forma geométrica.
     */
    public String getCor() {
        return cor;
    }

    /**
     * Método abstrato para calcular a área da forma geométrica.
     * @return a área da forma.
     */
    public abstract double calcularArea();

    /**
     * Método abstrato para mostrar os detalhes da forma geométrica.
     */
    public abstract void exibirDetalhes();

    /**
     * Apresenta os dados da forma geométrica:
     * - Cor;
     * - Detalhes;
     * - Área.
     */
    public void apresentar() {
        System.out.println("Cor: " + cor);

        exibirDetalhes();

        System.out.printf("Área: %.2f%n", calcularArea());
        System.out.println("--------------------------");
    }
}
