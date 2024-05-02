package S1.Pdf1;

import java.util.Arrays;
import java.util.List;

public class Ejemplo9 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int suma = numbers.stream() // convierte la lista en un flujo de datos
                .filter(n -> n % 2 == 0) // filtra los numeros pares
                .mapToInt(n -> n * n) // mapea cada numero par a su cuadrado
                .sum(); // suma los cuadrados
        System.out.println(suma);
    }
}
