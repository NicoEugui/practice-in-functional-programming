package Practica;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ej2 {
    /**
     * Ejercicio 2: Transformación y Ordenamiento Objetivo: Convertir una lista de números enteros a sus cuadrados y luego ordenarlos de forma descendente.
     * Datos de entrada: List<Integer> numeros = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
     * : Usa map para obtener los cuadrados y sorted para ordenar de forma descendente.
     * Resultado esperado: Una lista ordenada de números al cuadrado en forma descendente.
     */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);

        List<Integer> resultado = numeros.stream()
                .map(n -> n * n)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(resultado);
    }
}
