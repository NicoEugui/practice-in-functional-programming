package S2.PDF1;

import java.util.Arrays;
import java.util.List;

public class Ejemplo1 {

    public static void main(String[] args) {


        /***
         * Ejemplo 1: Filtrado e impresión
         */

        List<String> palabras = Arrays.asList("Manzana", "Banana2", "Banana", "Cereza", "Kiwi", "Frambuesa");
        palabras.stream()
                .filter(s -> s.startsWith("B"))
                .forEach(System.out::println);
    }
}
