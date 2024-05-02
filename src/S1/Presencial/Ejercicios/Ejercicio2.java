package S1.Presencial.Ejercicios;

import java.util.Arrays;
import java.util.List;

/***
 * Imprimir solo los números pares de una lista de números
 * Crear la funcion printEvenNumbersInList que reciba una lista de numeros,
 * recorra estos numeros y imprima los elementos
 */

public class Ejercicio2 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printEvenNumbersInList(numeros);
    }

    public static void printEvenNumbersInList(List<Integer> numeros) {
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
