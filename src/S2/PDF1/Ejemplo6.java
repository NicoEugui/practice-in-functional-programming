package S2.PDF1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo6 {

    public static void main(String[] args) {

        /****
         * Transformación
         * Si queremos transformar los elementos de una lista, por ejemplo, multiplicando cada
         * número por 2, podemos hacerlo declarativamente así:
         */
        List<Integer> numeros = Arrays.asList(1, 12, 9, 16, 5, 20);
        List<Integer> multiplicados = numeros.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(multiplicados);
    }
}
