package S1.Pdf2;

// Utiliza expresiones lambda para transformar los elementos de una lista de enteros,
//duplicando cada uno de ellos, y luego suma todos los elementos transformados. Implementa
//esto utilizando las capacidades de la API Stream de Java, combinando expresiones lambda
//adecuadas con operaciones de stream.


import java.util.Arrays;
import java.util.List;

public class Ejemplo6 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int numsAlCuadrado = numeros.stream()
                .mapToInt(n -> n * 2)
                .sum();
        System.out.println(numsAlCuadrado);
    }
}
