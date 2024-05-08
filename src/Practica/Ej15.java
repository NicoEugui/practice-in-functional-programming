package Practica;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Ej15 {
    /**
     * Ejercicio 15: Implementación de Interfaz Funcional Crea tu propia interfaz funcional `Duplicar` que acepte un número entero y lo duplique.
     * Utiliza esta interfaz para duplicar los números en una lista de enteros, utilizando expresiones lambda.
     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Duplicar duplicar = n -> n * 2;

        List<Integer> duplicados = numeros.stream()
                .map(duplicar::aplicar)
                .collect(Collectors.toList());
        System.out.println(duplicados);
    }

    @FunctionalInterface
    interface Duplicar {
        int aplicar(int n);
    }


}
