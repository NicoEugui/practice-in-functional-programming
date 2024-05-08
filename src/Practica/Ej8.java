package Practica;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ej8 {
    /**
     * Ejercicio 8: Uso de Consumer para Imprimir una Lista
     * Crear un Consumer<List<String>> que imprima todos los elementos de una lista de cadenas.
     * Utilizar este consumer para imprimir una lista específica.
     */

    public static void main(String[] args) {
        List<String> cadena = Arrays.asList("hola", "como", "estas");

        Consumer<List<String>> imprimirTodosLosElementos = lista -> lista.forEach(System.out::println);

        imprimirTodosLosElementos.accept(cadena);
    }
}
