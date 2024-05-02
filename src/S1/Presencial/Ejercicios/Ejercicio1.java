package S1.Presencial.Ejercicios;

import java.util.Arrays;
import java.util.List;

/***
 * Imprimir elementos de una lista de números.
 * Crear una función printNumbersInList que reciba una lista de numeros, recorra estos numeros y imprima los elementos
 */

public class Ejercicio1 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printNumbersInList(numeros);
    }

    public static void printNumbersInList(List<Integer> numeros) {
        numeros.forEach(System.out::println);
    }
}
