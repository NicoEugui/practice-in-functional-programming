package S1.Pdf1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numbers.stream()
                .map(n -> n * 2) // multiplica cada numero por 2
                .filter(n -> n > 10) // filtra los numeros mayores a 10
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
