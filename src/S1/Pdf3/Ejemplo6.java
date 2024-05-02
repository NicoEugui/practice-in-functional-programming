package S1.Pdf3;

import java.util.function.Function;

public class Ejemplo6 {

    public static void main(String[] args) {

        Function<Integer, Integer> suma = x -> x + 8;
        System.out.println("La suma de 5 + 8: " + suma.apply(5));

        System.out.println();

        // Podemos también encontrar el tamaño de una cadena por ejemplo:

        Function<String, Integer> tamanioCadena = str -> str.length();
        String cadena = "Lambdas tipo funciones";
        System.out.println("Numero de caracteres es: " + tamanioCadena.apply(cadena));
    }
}
