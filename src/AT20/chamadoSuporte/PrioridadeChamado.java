package AT20.chamadoSuporte;

public enum PrioridadeChamado {
    BAIXA(48),
    MEDIA(24),
    ALTA(4);

    private int prazoHoras;

    PrioridadeChamado(int prazoHoras) {
        this.prazoHoras = prazoHoras;
    }

    public int getPrazoHoras() {
        return prazoHoras;
    }
}
