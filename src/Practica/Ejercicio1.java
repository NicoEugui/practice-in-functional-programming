package Practica;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {

    /***
     * Ejercicio 1: Filtrado y Recolección Crear una lista de strings que representen los nombres que empiezan con la letra "A"
     * a partir de una lista de nombres.
     *
     * Datos de entrada: List<String> nombres = Arrays.asList("Ana", "Alberto", "Mario", "Beatriz", "Alicia");
     *
     * Tarea: Utiliza Streams para filtrar los nombres que empiezan con "A".
     *
     * Resultado esperado: Una lista de strings: ["Ana", "Alberto", "Alicia"].
     */

    public static void main(String[] args) {

        List<String> nombres = Arrays.asList("Anibal", "Asdrubal", "Nicolas", "Jorge");

        List<String> resultado = nombres.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(resultado);
    }
}
