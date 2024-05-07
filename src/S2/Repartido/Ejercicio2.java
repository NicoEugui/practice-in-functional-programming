package S2.Repartido;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    /**
     * Ejercicio 2: Transformación y Ordenamiento Objetivo:
     * Convertir una lista de nombres a mayúsculas y ordenarlos alfabéticamente.
     */

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "pedro", "Maria", "juan");
        List<String> resultado = ordenadoAlfabeticamente(nombres);
        System.out.println(resultado);
    }

    public static List<String> ordenadoAlfabeticamente(List<String> nombres) {
        return nombres.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
    }
}
