package S2.PDF2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo1 {

    /**
     * Refactoricemos esta función para que, en lugar de modificar la lista existente, devuelva una
     * nueva lista con los valores incrementados.
     *
     *
     * Posible solución: Una función que devuelve una nueva lista de números incrementados, sin
     * modificar la lista original.
     */

    public static void main(String[] args) {

        List<Integer> listaOriginal = Arrays.asList(2, 4, 6, 8, 10, 12, 14);
        System.out.println(incrementarLista(listaOriginal, 4));
    }

    public static List<Integer> incrementarLista(List<Integer> listaOriginal, int valor) {
        return listaOriginal.stream()
                .map(item -> item + valor)
                .collect(Collectors.toList());
    }
}
