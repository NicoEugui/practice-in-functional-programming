package S2.Repartido;

import java.util.Arrays;
import java.util.List;

public class Ejercicio5 {

    /***
     * Ejercicio 5: Conteo de Elementos Filtrados Objetivo:
     * Contar el número de strings que comienzan con una letra específica.
     */

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Alberto", "Mario", "Beatriz", "Alicia");
        long cantidadNombres = conteoElementosFiltrados(nombres);
        System.out.println(cantidadNombres);
    }

    public static long conteoElementosFiltrados(List<String> nombres) {
        return nombres.stream()
                .filter(n -> n.startsWith("A"))
                .count();
    }
}
