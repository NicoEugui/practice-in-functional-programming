package S1.Ejercicios.Ej7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/***
 * Uso de Function<T,R>:
 * Escribe una función que utilice la interfaz Function<Integer, Integer> para convertir temperaturas de Celsius a Fahrenheit.
 * Prueba tu función con una lista de temperaturas en Celsius.
 */

public class Ejercicio7 {
    public static void main(String[] args) {

        List<Integer> celcius = Arrays.asList(0, 12, 22, 8, 33, 25);
        Function<Integer, Integer> celciusToFahrenheit = x -> (x * 9 / 5) + 32;

        List<Integer> resultado = celcius.stream()
                .map(celciusToFahrenheit)
                .collect(Collectors.toList());
        System.out.println(resultado);
    }
}
