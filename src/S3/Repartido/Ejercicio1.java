package S3.Repartido;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    /***
     * Ejercicio 1: Uso Avanzado de Interfaz Funcional con Filtrado y Transformación de Listas
     *
     * Definir una interfaz funcional Transformador que acepte una lista de enteros y devuelva otra lista de enteros
     * transformada según una condición específica. Implementar esta interfaz para realizar diversas operaciones
     * sobre la lista, como filtrado por criterio y transformación (por ejemplo, hallar el cuadrado de los números pares).
     */

    @FunctionalInterface
    interface Transformador{
        List<Integer> transformar(List<Integer> lista);
    }

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3 ,4 , 5 , 6, 8, 10, 12, 14, 16, 18, 20);

        Transformador filtrarPares = lista -> lista.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        Transformador alCuadrado = lista -> lista.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        // aplicar operaciones
        List<Integer> pares = filtrarPares.transformar(numeros);
        List<Integer> cuadrado = alCuadrado.transformar(numeros);

        System.out.println(numeros);
        System.out.println(pares);
        System.out.println(cuadrado);
    }
}
