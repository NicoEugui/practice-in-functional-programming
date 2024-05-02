package S3.CodeRunner;

import java.util.function.BiFunction;

public class RestaNumeros {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> restar = (a, b) -> a - b;

        System.out.println(restar.apply(10, 5)); // 5
    }
}
