package S1.Ejercicios.Ej10;

import java.util.Arrays;
import java.util.List;

/***
 * Combinación de Operaciones con Streams:
 * Dada una lista de números enteros, utiliza la API Stream para encontrar el cuadrado de cada número impar y luego suma todos los cuadrados.
 * Usa expresiones lambda para la operación de filtrado y mapeo.
 */

public class Ejercicio10 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumaCuadrado = numeros.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n * n)
                .sum();
        System.out.println(sumaCuadrado);
    }
}
