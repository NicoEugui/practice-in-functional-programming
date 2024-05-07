package S2.Repartido;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio6 {
    /**
     * Ejercicio 6: Implementación de Listas Inmutables
     * Objetivo: Crear una función que, dada una lista de String,
     * retorne una nueva lista donde todos los elementos estén en mayúsculas, sin modificar la lista original.
     */

    public static void main(String[] args) {
        List<String> original = Arrays.asList("java", "python", "ruby");
        List<String> transformada = listaTransformada(original);
        System.out.println(transformada);
   }

   public static List<String> listaTransformada(List<String> lista) {
        return lista.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
   }
}
