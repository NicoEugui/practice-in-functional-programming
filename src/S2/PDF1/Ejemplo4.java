package S2.PDF1;

import java.util.Arrays;
import java.util.List;

public class Ejemplo4 {

    public static void main(String[] args) {
        /***
         * Ejemplo 4: Mapeo y agregación
         */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        int suma = numeros.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(suma);
    }

//    .reduce(0, MyClass::addIntegers)
//
//    public static int addIntegers(int a, int b) {
//        return a + b;
//    }
}
