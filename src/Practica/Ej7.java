package Practica;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ej7 {
    /**
     * Ejercicio 7: Uso de Function para Transformar una Lista
     * Implementar una Function<String, Integer> que convierta una cadena a un entero.
     * Aplicar esta función a una lista de cadenas y mostrar los enteros resultantes.
     */

    public static void main(String[] args) {
        List<String> cadenas = Arrays.asList("1", "2", "3", "4", "5");
        Function<String, Integer> transformarCadenaAEntero = Integer::parseInt;
        List<Integer> enteros = cadenas.stream()
                .map(transformarCadenaAEntero)
                .collect(Collectors.toList());
        System.out.println(enteros);
    }
}
