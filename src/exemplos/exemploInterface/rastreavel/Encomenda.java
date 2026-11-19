package exemplos.exemploInterface.rastreavel;

public class Encomenda implements Rastreavel {// implementando a interface Raestreavel
    //Atributos da encomenda
    private String codigo;
    private String localizacao;

    //Construtor da classe encomenda
    public Encomenda(String codigo, String localizacao) {
        this.codigo = codigo;
        this.localizacao = localizacao;
    }

    //Sobreescrevendo o método rastrear
    @Override
    public void rastrear() {
        System.out.println("= = = RASTREAMENTO DE ENCOMENDA = = =");
        System.out.println("Código: " + codigo);
        System.out.println("Localização: " + localizacao);

    }
}
