package Practica;

import java.util.Arrays;
import java.util.List;

public class Ej13 {

    /**
     * Ejercicio 13: Funciones Puras Escribe una función pura que reciba una lista de números enteros
     * y devuelva la suma detodos los números en la lista. Asegúrate de que esta función no cause efectos secundarios.
     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int suma = sumarNumeros(numeros);
        System.out.println(suma);
    }

    public static int sumarNumeros(List<Integer> numeros ) {
        return numeros.stream()
                .reduce(0, Integer::sum);
    }
}

