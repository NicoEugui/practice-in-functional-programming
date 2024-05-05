package S2.PDF2;

import java.util.HashMap;
import java.util.Map;


public class Ejemplo3 {

    /**
     * Aplicando Memoización en la Función Fibonacci
     */

    public static void main(String[] args) {
        int resultado = Fibonacci.fibonacci(10);
        System.out.println(resultado);
    }

    public static class Fibonacci {
        private static Map<Integer, Integer> cache = new HashMap<>();

        public static int fibonacci(int n) {
            if (n <= 1){
                return n;
            }

            // verifica si el resultado ya esta en la cache
            if (cache.containsKey(n)) {
                return cache.get(n);
            }

            // calcula y almacena el resultado en la cache antes de retomarlo
            int result = fibonacci(n - 1) + fibonacci(n - 2);
            cache.put(n, result);
            System.out.println(cache);
            return result;
        }
    }


}
