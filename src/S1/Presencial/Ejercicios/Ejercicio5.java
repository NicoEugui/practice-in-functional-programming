package S1.Presencial.Ejercicios;

import java.util.Arrays;
import java.util.List;

/***
 * Encontrar el valor minimo en una lista de numeros
 * Crear la función getMinimalNumber que reciba una lista de números,
 * recorra estos elementos y devuelva cual es el menor numero.
 */

public class Ejercicio5 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        getMinimalNumber(numeros);
    }

    public static void getMinimalNumber(List<Integer> numeros) {
        int minimo = numeros.stream()
                .reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println(minimo);
    }
}
