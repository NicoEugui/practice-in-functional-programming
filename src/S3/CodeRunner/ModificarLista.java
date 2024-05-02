package S3.CodeRunner;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ModificarLista {

    // Implementar una interfaz funcional ModificadorLista que acepte una lista de enteros y aplique una operación aritmética definida por el usuario a cada elemento.
    //
    //Tarea: Utilizar esta interfaz para duplicar los valores de una lista de enteros y luego filtrar aquellos que son mayores que 50.

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(10, 25, 30, 45, 50);

        // TODO: complete este codigo
        Function<List<Integer>, List<Integer>> modificarLista = lista -> lista.stream()
                .map(numero -> numero * 2) // Duplicar los valores
                .filter(numero -> numero > 50) // Filtrar los valores mayores que 50
                .collect(Collectors.toList());

        System.out.println(modificarLista.apply(numeros)); // [60, 90, 100]

    }
}
