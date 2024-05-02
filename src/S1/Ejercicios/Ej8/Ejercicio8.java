package S1.Ejercicios.Ej8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Operaciones con Consumer<T>:
 * Implementa un Consumer<String> que imprima en consola cada cadena en mayúsculas.
 * Utiliza esta implementación para imprimir una lista de nombres.
 */

public class Ejercicio8 {

    public static void main(String[] args) {

        List<String> listaNombres = Arrays.asList("nicolas", "jorge", "santiago");

        Consumer<String> cadena = n -> System.out.println(n.toUpperCase());

        listaNombres.forEach(cadena);
    }
}
