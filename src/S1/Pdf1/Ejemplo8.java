package S1.Pdf1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo8 {
    public static void main(String[] args) {

        // Ejemplo en prog imperativa

        // Modificar una lista de números incrementando cada elemento en uno sería algo así:

        //int[] numbers = {1, 2, 3, 4, 5};
//        for(int i = 0; i < numbers.length; i++) {
//            numbers[i] = numbers[i] + 1;
//        }

        // ejemplo en prog funcional
        // Incrementar cada elemento de una lista en uno, utilizando un enfoque funcional,

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> incremented = numbers.stream()
                .map(n -> n + 1)
                .collect(Collectors.toList());
        System.out.println(incremented);
    }
}
