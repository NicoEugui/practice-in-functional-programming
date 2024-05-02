package S1.Presencial.Ejercicios;

import java.util.Arrays;
import java.util.List;

/***
 * Imprimir la suma de los números en una lista
 * Crear la función sumNumbersInList que reciba una lista de numeros,
 * recorra estos numeros y sume los valores
 */

public class Ejercicio3 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        sumNumbersInList(numeros);
    }

    public static void sumNumbersInList(List<Integer> numeros) {
        int sum = numeros.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
