package S1.Presencial.Ejercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * Convertir una lista de string a mayúscula
 * Crear la funcion convertToUppercase que reciba una lista de strings,
 * recorra estos elementos y convierta los elementos a mayúscula
 */

public class Ejercicio6 {

    public static void main(String[] args) {

        List<String> listaStrings = Arrays.asList("hola nico", "como estas?");
        convertToUppercase(listaStrings);

    }

    public static void convertToUppercase(List<String> listaStrings) {
        listaStrings.stream()
                .map(String::toUpperCase)
                        .forEach(System.out::println);
    }
}
