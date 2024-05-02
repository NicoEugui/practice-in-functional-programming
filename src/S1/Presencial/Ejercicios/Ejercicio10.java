package S1.Presencial.Ejercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * Eliminar elementos duplicados
 * Crear la función deleteDuplicates que reciba una lista de números,
 * recorra estos elementos y cheque si el elemento está duplicado, creando una nueva lista.
 */


public class Ejercicio10 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 9, 10);
        deleteDuplicates(numeros);
    }

    public static void deleteDuplicates(List<Integer> numeros) {
        List<Integer> resultado = numeros.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(resultado);
    }
}
