package prova;

import java.util.ArrayList;
import java.util.List;

public class Catalogo<T> {
    private List<T> elementos = new ArrayList<>();

    public void adicionar(T elemento) {
        elementos.add(elemento);
    }

    public List<T> getElementos() {
        return elementos;
    }


}
