package S1.Ejercicios.Ej6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * Implementación de Interfaz Funcional:
 * Crea tu propia interfaz funcional Triple que acepte un entero y lo triplique.
 * Utiliza esta interfaz para triplicar los números en una lista de enteros, utilizando expresiones lambda.
 */

public class Ejercicio6 {


    public static void main(String[] args) {
        List<Integer> listaEnteros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Triple triple = (x) -> x * 3;

        List<Integer> resultado = listaEnteros.stream()
                .map(n -> triple.aplicar(n)) // triple::aplicar
                .collect(Collectors.toList());
        System.out.println(resultado);

    }


}
