package S1.Pdf1;

import java.util.Arrays;
import java.util.List;

// Ahora utilicen la API Stream para encontrar la suma de los cuadrados de todos los números
//impares en una lista de enteros.


public class Ejemplo6 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); // lista de ej

        int sumaCuadradosImpares = numbers.stream()// convierte la lista en un flujo
                .filter(n -> n % 2 != 0) // filtra solo los numeros impares
                .mapToInt(n -> n * n) // convierte cada numero en su cuadrado
                .sum(); // suma los cuadrados
        System.out.println("La suma de los cuadrados de los números impares es: " + sumaCuadradosImpares);
    }
}
