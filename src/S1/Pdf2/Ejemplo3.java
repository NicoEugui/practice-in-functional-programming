package S1.Pdf2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo3 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> multiplicados = numeros.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(multiplicados);
    }
}
