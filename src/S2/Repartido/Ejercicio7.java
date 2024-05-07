package S2.Repartido;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio7 {
    /**
     * Ejercicio 7: Optimización con Fibonacci Objetivo:
     * Desarrolla una función recursiva para calcular el n-ésimo número de Fibonacci,
     * empleando una técnica de almacenamiento para optimizar el rendimiento.
     */

    public static void main(String[] args) {
        long resultado = Fibonacci.fibonacci(30);
        System.out.println(resultado);
    }

    public static class Fibonacci {
        private static Map<Integer, Long> cache = new HashMap<>();

        public static long fibonacci(int n) {
            if (n <= 1) {
                return n;
            }

            if(cache.containsKey(n)) {
                return cache.get(n);
            }

            long resultado = fibonacci(n - 1) + fibonacci(n - 2);
            cache.put(n, resultado);
            System.out.println(resultado);
            return resultado;
        }
    }


}
