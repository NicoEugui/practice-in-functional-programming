package S1.Pdf3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ejemplo2 {

    // tenemos almacenados números del 1 al 10 en una lista y queremos
    //obtener los números mayores a 5 y almacenarlos en una nueva lista.


    public static void main(String[] args) {
        ArrayList<Integer> mayores = (ArrayList<Integer>) Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
                //filtro para obtener los números mayores a 5 y dentro se utiliza la
                // expresión lambda (x -> x > 5)
                .filter(x -> x > 5)

                // //pone los elementos que se filtró dentro de una nueva lista,
                //dentro //se utiliza una expresión lambda
                .collect(Collectors.toCollection(() -> new ArrayList<Integer>()));
        mayores.forEach(System.out::println);

    }
}