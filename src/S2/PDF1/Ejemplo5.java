package S2.PDF1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo5 {

    /***
     * Ejemplos de Manipulación Declarativa de Colecciones
     * Filtrado
     */

    /**
     * Supongamos que tenemos una lista de números y queremos filtrar todos los números
     * mayores que 10. Aquí está el enfoque declarativo usando Streams:
     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 12, 9, 16, 5, 20);
        List<Integer> filtrados = numeros.stream() // convierte la lista en stream
                .filter(n -> n > 10) // expresion declarativa para filtrar
                .collect(Collectors.toList()); // recolecta los resultadso en una lista nueva
        System.out.println(filtrados);
    }

}
