package S3.Repartido;

import java.util.function.Function;

public class Ejercicio5 {
    /***
     * Ejercicio 5: Transformar un Número a String con Function Implementar una Function<Integer, String>
     *     que tome un entero y lo transforme en una cadena que indica que el número es par o impar.
     *     Aplicar esta función a un número específico y mostrar el resultado.
     */

    public static void main(String[] args) {

        Function<Integer, String> aTexto = n -> {
            if (n % 2 == 0) {
                return n + " es par";
            } else {
                return n + " es impar";
            }
        };

        System.out.println(aTexto.apply(5));
    }
}
