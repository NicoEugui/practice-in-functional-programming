package Practica;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ej4 {

    /***
     * Ejercicio 4: Agrupación por Criterio
     * Objetivo: Agrupar una lista de strings por la primera letra de cada palabra.
     * Datos de entrada: List<String> palabras = Arrays.asList("casa", "perro", "gato", "auto", "caballo");
     * Tarea: Utilizar collect con Collectors.groupingBy para agrupar las palabras por su primera letra.
     * Resultado esperado: Un Map<Character, List<String>> donde cada clave es la primera letra de las palabras
     * y cada valor es la lista de palabras con esa primera letra.
     */

    public static void main(String[] args) {

        List<String> palabras = Arrays.asList("casa", "perro", "gato", "auto", "caballo");

        Map<Character, List<String>> resultado = palabras.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(resultado);
    }
}
