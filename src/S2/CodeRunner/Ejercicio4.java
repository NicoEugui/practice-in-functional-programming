package S2.CodeRunner;

import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {

    /**
     * Complete el método concatenar e imprima su valor
     *
     * Escribe una función recursiva que concatene una lista de cadenas.
     */

    public static String concaternar(List<String> cadenas, int n) {

        if(n <= 0) {
            return "";
        }

        return concaternar(cadenas, n - 1) + cadenas.get(n - 1);
    }

    public static void main(String[] args) {

        List<String> cadenas = Arrays.asList("Hola", "mundo", "!");
        String resultado = concaternar(cadenas, cadenas.size());
        System.out.println(resultado);
    }
}
