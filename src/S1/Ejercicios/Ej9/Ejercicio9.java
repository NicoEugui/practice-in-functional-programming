package S1.Ejercicios.Ej9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/***
 * Filtrado y Conteo con Predicate<T>:
 * Usa un Predicate<Integer> para filtrar una lista de números enteros, manteniendo solo los que sean pares.
 * Luego, cuenta cuántos números pares hay en la lista.
 * Implementa esto utilizando expresiones lambda y la API Stream.
 */

public class Ejercicio9 {

    public static void main(String[] args) {

        List<Integer> listaNumeros = Arrays.asList(1, 2, 3);

        Predicate<Integer> numerosPares = n -> n % 2 == 0;

        long resultado = listaNumeros.stream()
                .filter(numerosPares)
                .count();
        System.out.println(resultado);
    }
}
