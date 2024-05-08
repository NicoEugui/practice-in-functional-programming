package Practica;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ejercicio6 {
    /**
     * Ejercicio 6: Uso de Predicate para Filtrar una Lista
     * Definir un Predicate<Integer> que determine si un número es mayor que 5.
     * Usar este predicado para filtrar una lista de números enteros y mostrar los números que cumplen la condición.
     */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(2, 4, 6, 8, 10);

        Predicate<Integer> mayorQueCinco = a -> a > 5;

        List<Integer> mayoresQueCinco = numeros.stream()
                .filter(mayorQueCinco)
                .collect(Collectors.toList());
        System.out.println(mayoresQueCinco);
    }
}
