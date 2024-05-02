package S1.Pdf1;

import java.util.Arrays;
import java.util.List;

public class Ejemplo2 {

    // Escriban una expresión lambda que tome dos enteros y devuelva su suma. Luego, utilízala
    //para ordenar una lista de números en orden descendente.

    public static void main(String[] args){

        // Expresion lambda que toma dos enteros y devuelve su suma
        Sumador sumador = (a, b) -> a + b;

        Integer suma = sumador.suma(5, 10);
        System.out.println(suma);

        // Lista de numeros
        List<Integer> numeros = Arrays.asList(5, 2, 8, 1, 6);

        // Utilizando la expresion lambda para ordenar la lista en orden descendente
        numeros.sort((num1, num2) -> num2 - num1);

        // imprimir lista ordenada
        System.out.println("Lista ordendada en orden descendente: " + numeros);
    }

    @FunctionalInterface
    interface Sumador {
        int suma(int a, int b);
    }
}
