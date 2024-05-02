package S1.Pdf1;

import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo7 {

    public static void main(String[] args){

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        // uso de funciones como ciudadanos de primera clase y expresiones
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n) // funcion pasada como argumento
                .collect(Collectors.toList()); // Inmutabilidad: crea una nueva lista
        System.out.println(squaredNumbers);
    }
}
