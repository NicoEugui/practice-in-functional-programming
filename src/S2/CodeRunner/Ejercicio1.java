package S2.CodeRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ejercicio1 {
    /***
     * Completa el método buscarMinimo e imprime el resultado
     *
     * Utiliza reduce para encontrar el valor mínimo.
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(32, 67, 24, 89, 21);
        Optional<Integer> minimo = buscarMinimo(numeros);

        minimo.ifPresent(System.out::println);
    }

    public static Optional<Integer> buscarMinimo(List<Integer> numeros) {
        return numeros.stream()
                .reduce(Integer::min);
    }
}
