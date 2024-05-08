package Practica;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ej5 {

    /***
     * Ejercicio 5: Conteo de Elementos Filtrados
     * Objetivo: Contar el número de palabras que tienen más de 5 letras.
     * Datos de entrada: List<String> palabras = Arrays.asList("hola", "como", "estas", "bien", "gracias");
     * Tarea: Filtrar las palabras que tienen más de 5 letras y contarlas.
     * Resultado esperado: Un long que representa el número de palabras que tienen más de 5letras.
     */

    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("hola", "como", "estas", "bien", "gracias");

        long resultado = palabras.stream()
                .filter(p -> p.length() > 5)
                .count();
        System.out.println(resultado);
    }
}
