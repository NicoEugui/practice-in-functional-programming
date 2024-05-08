package Practica;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ej3 {
    /***
     * Ejercicio 3: Búsqueda del Mínimo Objetivo: Encontrar el número más pequeño en una lista de enteros.
     * Datos de entrada: List<Integer> numeros = Arrays.asList(3, 67, 24, 89, 21);
     * Tarea: Utiliza reduce para encontrar el valor mínimo.
     * Resultado esperado: Un Optional<Integer> que contiene el valor mínimo.
     */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(3, 67, 24, 89, 21);

        Optional<Integer> resultado = numeros.stream()
                .reduce(Integer::min);

        resultado.ifPresent(System.out::println);
    }
}
