package exemplos.exemploInterface.rastreavel;

public class Veiculo implements Rastreavel{ //Implementando a interface Rastreavel
    //Atributos da classe veículo
    private String placa;
    private String modelo;
    private String localizacao;

    //Construtor da classe veiculo
    public Veiculo(String placa, String modelo, String localizacao) {
        this.placa = placa;
        this.modelo = modelo;
        this.localizacao = localizacao;
    }

    //Sobreescrevendo o método rastrear da interface implementada
    @Override
    public void rastrear() {
        System.out.println(
                "= = = RASTREAMENTO DE VEÍCULO = = =" +
                "\nPlaca: " + placa +
                "\nModelo: " + modelo +
                "\nLocalização: " + localizacao
        );
    }
}
