package S2.Repartido;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ejercicio1 {
    /**
     * Ejercicio 1: Filtrado y Recolección
     * Crear una lista de strings que representen números mayores que 10 a partir de una lista de enteros.
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 12, 5, 18, 9, 21);
        List<String> resultado = numerosConvertidosString(numeros);
        System.out.println(resultado);
    }

    public static List<String> numerosConvertidosString(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n > 10)
                .map(String::valueOf)
                .collect(Collectors.toList());
    }


}
