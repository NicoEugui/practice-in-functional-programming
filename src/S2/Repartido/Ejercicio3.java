package S2.Repartido;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ejercicio3 {
    /**
     * Ejercicio 3: Búsqueda del Máximo Objetivo:
     * Encontrar el número más grande en una lista de enteros.
     */
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(3, 67, 24, 89, 21);
        Optional<Integer> valorMaximo = busquedaMaximoValor(numeros);
        valorMaximo.ifPresent(System.out::println);
    }

    public static Optional<Integer> busquedaMaximoValor(List<Integer> numeros) {
        return numeros.stream()
                .reduce(Integer::max);
    }
}
