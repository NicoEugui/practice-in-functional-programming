package S2.CodeRunner;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio7 {

    /**
     * Complete el método minusculaReserva utilizando programacion funcional e imprima los valores.
     *
     * Usa map para convertir los apellidos a minúsculas y sorted con un comparador para ordenarlos inversamente.
     */

    public static void main(String[] args) {
        List<String> apellidos = Arrays.asList("Gonzales", "Rodriguez", "Martinez", "Lopez");
        List<String> resultado = minusculaReversa(apellidos);
        System.out.println(resultado);
    }

    public static List<String> minusculaReversa(List<String> lista) {
        return lista.stream()
                .map(String::toLowerCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
