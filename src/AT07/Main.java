package AT07;

public class Main {
    static void main(String[] args) {
        //Criando o professor
        System.out.println("= = = = PROFESSOR = = = =");

        //Instanciando o professor
        Professor professor = new Professor(
                "Paulo",
                "261041204",
                80,
                40.00
        );

        //Exibindo os dados do professor
        professor.exibirDados();

        //Exibindo salário do professor
        System.out.println("O professor recebe R$" + professor.calcularSalario() + ".");

        //Registrando a presença do professor
        professor.registrarPresenca();

        System.out.println();
        System.out.println();

        //Criando secretário
        System.out.println("= = = = SECRETÁRIO = = = =");

        //Instanciando secretário
        Secretario secretario = new Secretario(
                "Roger",
                "123.456.789-01",
                2500.00
        );

        //Exibindo dados do secretário
        secretario.exibirDados();

        //Exibindo salário do secretário
        System.out.println("O secretário recebe R$" + secretario.calcularSalario() + ".");

        //Registrando presença do secretário
        secretario.registrarPresenca();
    }
}
