package S1.Pdf2;

import java.util.Arrays;
import java.util.List;

public class Ejemplo4 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int suma = numeros.stream()
                // toma una lista de cosas y las combina en una sola.
                // suma todos los numeros en el stream

                // empezar la suma con un valor inicial. En tu caso, es 0.
                // Eso es como empezar a contar desde cero.
                // tambien se asegura que el resultado sea del tipo correcto (int)
                // Luego, sumas cada número en la lista al valor inicial. Cada vez que añades un número, el valor inicial cambia. Por ejemplo, si tienes 0 y le sumas 3, obtienes 3. Después, si le sumas 5, obtienes 8.
                //Haces esto para todos los números en la lista hasta que no haya más.
                //Al final, obtienes la suma de todos los números en la lista.
                //
                .reduce(0, (a, b) -> a + b);
        System.out.println(suma);
    }
}
