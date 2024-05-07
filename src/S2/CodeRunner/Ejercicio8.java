package S2.CodeRunner;

import java.util.Arrays;
import java.util.List;

public class Ejercicio8 {

    /**
     * Complete el método filtrarPorLongitudConteo e imprima el resultado
     *
     * Filtrar las palabras por longitud y contarlas.
     */
    public static void main(String[] args) {

        List<String> palabras = Arrays.asList("table", "chair", "spoon", "cup");
        long conteo = filtrarPorLongitudConteo(palabras, 5);
        System.out.println(conteo);
    }

    public static long filtrarPorLongitudConteo(List<String> palabras, int longitud) {
        return palabras.stream()
                .filter(p -> p.length() == longitud)
                .count();
    }
}
