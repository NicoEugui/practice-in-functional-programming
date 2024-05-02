package S3.CodeRunner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

// Dada una lista de números enteros, calcular la suma de sus valores absolutos utilizando flatMapToDouble.
//
//Tarea: Mostrar el resultado de la suma.


public class SumaValoresAbsolutos {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(-10, 25, -30, 45, 50);
        //TODO: compelte este codigo
        double sumaAbsolutos = numeros.stream()
                        .mapToDouble(Math::abs)
                                .sum();

        System.out.println("La suma de los valores absolutos es: " + sumaAbsolutos);
    }
}
