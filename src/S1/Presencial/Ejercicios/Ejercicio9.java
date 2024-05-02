package S1.Presencial.Ejercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * Dado una lista de números, crear una nueva lista de cada elemento multiplicado por 2
 * Crear la función multiplyElements que reciba una lista de números,
 * recorra estos elementos y agregue el nuevo elemento multiplicado a una nueva lista
 */

public class Ejercicio9 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        multiplyElements(numeros);
    }

    public static void multiplyElements(List<Integer> numeros){
        List<Integer> resultado = numeros.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(resultado);
    }

}
