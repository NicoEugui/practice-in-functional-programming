package S2.Repartido;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio4 {
    /**
     * Ejercicio 4: Agrupación por Criterio Objetivo: Agrupar una lista de strings por su longitud.
     */

    public static void main(String[] args) {

        List<String> palabras = Arrays.asList("react", "angular", "vue", "ember");
        Map<Integer, List<String>>  resultado = agruparPorLongitud(palabras);
        System.out.println(resultado);
    }

    public static Map<Integer, List<String>> agruparPorLongitud(List<String> palabras) {
        return palabras.stream()
                .collect(Collectors.groupingBy(String::length));
    }
}
