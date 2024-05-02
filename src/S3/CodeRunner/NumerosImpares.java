package S3.CodeRunner;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumerosImpares {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        Predicate<Integer> esImpar = n -> n % 2 != 0;

        List<Integer> impares = numeros.stream()
                .filter(esImpar)
                .collect(Collectors.toList());

        System.out.println(impares);
    }
}
