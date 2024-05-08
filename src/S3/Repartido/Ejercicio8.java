package S3.Repartido;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Ejercicio8 {

    /**
     * Ejercicio 8: Calcular Promedio con flatMapToDouble
     * Convertir un array de String que representan números a un DoubleStream usando flatMapToDouble
     * y calcular el promedio de estos números.
     */

    public static void main(String[] args) {

        String[] valores = {"1.5", "2.8", "3.7"};

        double promedio = Stream.of(valores)
                .flatMapToDouble(num -> DoubleStream.of(Double.parseDouble(num)))
                .average()
                .orElse(0);

        System.out.println(promedio);

    }
}
