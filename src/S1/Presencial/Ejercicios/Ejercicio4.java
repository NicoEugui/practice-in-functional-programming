package S1.Presencial.Ejercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * Imprimir la cantidad de elementos que su largo sea mayor a 5
 * Crear la función countElements que reciba una lista de strings,
 * recorra estos elementos y devuelva la cantidad de elementos que cumplan con la condición
 */

public class Ejercicio4 {

    public static void main(String[] args) {

        List<String> listaStrings = Arrays.asList("hola", "que", "talcooooooo");
        countElements(listaStrings);
    }

    public static void countElements(List<String> listaStrings) {
        long count = listaStrings.stream()
                .filter(n -> n.length() > 5)
                        .count();
        System.out.println(count);
    }
}
