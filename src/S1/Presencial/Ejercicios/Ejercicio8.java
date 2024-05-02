package S1.Presencial.Ejercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/***
 * Extraer un subconjunto de condicion % 2 y mayor a 5
 * Crear la funcion filterElementsGreaterThan que reciba una lista de números,
 * recorra estos elementos y cheque la condición agregando elementos a una nueva lista.
 */

public class Ejercicio8 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        filterElementsGreaterThan(numeros);
    }

    public static void filterElementsGreaterThan(List<Integer> numeros) {
        List<Integer> resultado = numeros.stream()
                .filter(n -> n % 2 == 0 && n > 5)
                .collect(Collectors.toList());
        System.out.println(resultado);
    }
}
