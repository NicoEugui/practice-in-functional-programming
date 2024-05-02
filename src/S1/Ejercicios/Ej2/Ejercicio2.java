package S1.Ejercicios.Ej2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * Dada una lista de cadenas, utiliza streams para convertir todas las cadenas a mayúsculas
 * Y luego filtra aquellas que tienen más de 3 caracteres.\
 * Recoge el resultado en una lista y muestra esta lista
 */

public class Ejercicio2 {

    public static void main(String[] args) {

        List<String> cadenas = Arrays.asList("Ho", "Nicolas Eugui", "uruguay noma");

        List<String> resultado = cadenas.stream()
                        .map(String::toUpperCase)
                                .filter(s -> s.length() > 3)
                                        .collect(Collectors.toList());
        System.out.println(resultado);

    }

}
