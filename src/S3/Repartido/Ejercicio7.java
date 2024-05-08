package S3.Repartido;

import java.util.Arrays;
import java.util.List;

public class Ejercicio7 {

    public static void main(String[] args) {
        /**
         * Ejercicio 7: Aplanar y Sumar con flatMapToInt
         * Dada una lista de listas de enteros, utilizar flatMapToInt para aplanar la estructura
         * y sumar todos los enteros. Mostrar el resultado de la suma.
         */

        List<List<Integer>> listaDeListas = List.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5), Arrays.asList(6, 7, 8));

        int suma = listaDeListas.stream()
                .flatMapToInt(subLista -> subLista.stream().mapToInt(Integer::intValue))
                .sum();

        System.out.println(suma);
    }
}
