package S3.Repartido;

import java.util.function.Function;
import java.util.function.Predicate;

/***
 * Ejercicio 4: Filtrar Elementos con Predicate
 * Crear un Predicate<Integer> que determine si un número es par.
 * Usar este predicado para verificar si un número dado es par o no.
 */

public class Ejercicio4 {

    public static void main(String[] args) {

        Predicate<Integer> esPar = n -> n % 2 == 0;
        System.out.println(esPar.test(5));

    }
}
