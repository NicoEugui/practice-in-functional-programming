package S3.PDF1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejemplo3 {

    /***
     * Ejemplo 3. Funciones de Primera Clase y de Alto Orden
     *
     * Crearemos una función de alto orden que aplica una función dada a todos los elementos de
     * una lista y devuelve una nueva lista con los resultados.
     */
    public static void main(String[] args) {
        Function<List<Integer>, List<Integer>> elevarAlCuadrado = lista ->
                lista.stream()
                        .map(n -> n * n)
                        .collect(Collectors.toList());

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(elevarAlCuadrado.apply(numeros));
    }
}
