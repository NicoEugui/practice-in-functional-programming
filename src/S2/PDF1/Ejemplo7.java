package S2.PDF1;

import java.util.Arrays;
import java.util.List;

public class Ejemplo7 {

    public static void main(String[] args) {
        /***
         * Agregación
         * La agregación (por ejemplo, encontrar la suma, el máximo, o el promedio) es otra operación
         * común:
         */
        List<Integer> numeros = Arrays.asList(1, 12, 9, 16, 5, 20);
        int suma = numeros.stream()
                .reduce(0, Integer::sum);
        System.out.println(suma);
    }
}
