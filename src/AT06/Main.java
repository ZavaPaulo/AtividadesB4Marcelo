package AT06;

public class Main {
    static void main(String[] args) {
        System.out.println("= = = = IMPRESSORA = = = =");
        //Instanciando a Impressora
        Impressora impressora = new Impressora("HP");

        //Executando `conectar()`
        impressora.conectar();

        //Executando `desconectar()`
        impressora.desconectar();
        System.out.println();

        System.out.println("= = = = CAIXA DE SOM = = = =");

        //Instanciando a Caixa de Som
        CaixaDeSom caixaDeSom = new CaixaDeSom("JBL");

        //Executando `conectar()`
        caixaDeSom.conectar();

        //Executando `desconectar()`
        caixaDeSom.desconectar();
        System.out.println();
    }
}
