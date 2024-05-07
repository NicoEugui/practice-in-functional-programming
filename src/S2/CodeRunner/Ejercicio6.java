package S2.CodeRunner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio6 {
    /**
     * Complete el método conversionHexadecimal que debe seleccionar los números pares y luego conviértelos a strings en formato hexadecimal
     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2, 13, 4, 17, 8, 22);
        List<String> resultado = conversionHexadecimal(numeros);

        System.out.println(resultado);
    }

    public static List<String> conversionHexadecimal(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(Integer::toHexString)
                .collect(Collectors.toList());
    }
}
