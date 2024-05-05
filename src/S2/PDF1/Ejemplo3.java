package S2.PDF1;

import java.util.Arrays;
import java.util.List;

public class Ejemplo3 {

    public static void main(String[] args) {
        /***
         * Ejemplo 3: Ordenando y reduciendo
         */

        List<Integer> numeros = Arrays.asList(3, 2, 1, 5, 4);
        int suma = numeros.stream()
                .sorted()
                .reduce(0, (a, b) -> a + b);
        System.out.println(suma);
    }
}
