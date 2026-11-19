package exemplos.exemploInterface.rastreavel;

public class Main {
    static void main(String[] args) {
        //Criando a encomenda
        Encomenda encomenda = new Encomenda(
                "5789-fhua-7134",
                "Londres"
        );

        //Criando o veículo
        Veiculo veiculo = new Veiculo(
                "SUI-3789",
                "Honda Civic",
                "Londrina"
        );

        //Consultando a localização do veículo
        consultarLocalizacao(veiculo);

        //Consultando a localização da encomenda
        consultarLocalizacao(encomenda);
    }

    public static void consultarLocalizacao(Rastreavel item) {
        item.rastrear();
        System.out.println();
    }
}
