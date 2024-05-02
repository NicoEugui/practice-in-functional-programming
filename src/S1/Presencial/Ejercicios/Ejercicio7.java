package S1.Presencial.Ejercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * Filtrar lista que contenga elementos que inicien con A y devuelva una nueva lista
 * Crear la función filterElements que reciba una lista de strings,
 * recorra estos elementos y cheque la condición agregando elementos a una nueva lista.
 */

public class Ejercicio7 {

    public static void main(String[] args) {
        List<String> listaString = Arrays.asList("Arroyo", "Pastorino", "Que asco");
        filterElements(listaString);
    }

    public static void filterElements(List<String> listaString) {
        List<String> elementos = listaString.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(elementos);
    }
}
