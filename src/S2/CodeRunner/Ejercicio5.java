package S2.CodeRunner;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio5 {

    /***
     Complete el método calculoFactorial e imprima su valor

     Implementa una función recursiva para calcular el factorial de un número usando memoización.

     Consideraciones: Utiliza un HashMap para almacenar los resultados previos.
     */

    public static Map<Integer, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(calculoFactorial(20));
    }

    public static long calculoFactorial(int n) {
        if(n < 0) {
            return 0;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        if(memo.containsKey(n)) {
            return memo.get(n);
        }

        long resultado = n * calculoFactorial(n - 1);
        memo.put(n, resultado);
        return resultado;
    }
}
