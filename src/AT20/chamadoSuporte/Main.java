package AT20.chamadoSuporte;

public class Main {
    static void main(String[] args) {
        System.out.println(
                "O prazo de entrega urgente é " +
                PrioridadeChamado.ALTA.getPrazoHoras() +
                " horas"
        );
    }
}
