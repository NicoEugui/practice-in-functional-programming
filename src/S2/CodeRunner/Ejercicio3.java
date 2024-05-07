package S2.CodeRunner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    /**
     * Complete el método crearListaTransformada e imprime su valor
     *
     * Crear una función que, dada una lista de números enteros, retorne una nueva lista donde cada elemento
     *
     * sea el resultado de elevar al cuadrado cada número, sin modificar la lista original.
     *
     * Consideraciones: Utiliza Stream para procesar cada elemento de la lista.
     */

    public static void main(String[] args ) {

        List<Integer> original = Arrays.asList(1, 2, 3, 4);
        List<Integer> transformada = crearListaTransformada(original);

        System.out.println(transformada);
    }

    public static List<Integer> crearListaTransformada(List<Integer> original) {
        return original.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
    }
}
