package S1.Pdf2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo2 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0) // filtra los nums pares
                .collect(Collectors.toList()); // agrupa los pares en una lista nueva
        System.out.println(pares); // Imprime: [2, 4, 6, 8, 10]
    }
}
