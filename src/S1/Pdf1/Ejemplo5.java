package S1.Pdf1;

import java.util.Arrays;
import java.util.List;

public class Ejemplo5 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(x -> x)
                .sum();

        System.out.println(sum);
    }
}
