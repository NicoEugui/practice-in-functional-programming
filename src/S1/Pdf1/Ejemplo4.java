package S1.Pdf1;

import S1.Operacion;

public class Ejemplo4 {

    @FunctionalInterface
    public interface OperacionMatematica<T> {
        T calcular(T t);
    }

    public static void main(String[] main) {

        OperacionMatematica<Integer> cuadrado = x -> x * x;

        Integer resultado = cuadrado.calcular(5);
        System.out.println("El cuadrado de 5 es: " + resultado);
    }
}
