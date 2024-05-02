package S3.CodeRunner;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

// Crear una Function<Integer, String> que convierta números en su equivalente textual para indicar si son positivos, negativos o cero.
//
//Tarea: Aplicar esta función a una lista de enteros para generar mensajes descriptivos.


public class ConversionEstado {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(-1, 0, 1);
        Function<Integer, String> convertirEstado = n -> {
            if (n > 0) return "Positivo";
            if (n < 0) return "Negativo";
            return "Cero";
        };

        List<String> estados = numeros.stream()
                .map(convertirEstado)
                .collect(Collectors.toList());

        System.out.println(estados);

    }
}
