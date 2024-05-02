package S3.CodeRunner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenacionYConteo {

    // A partir de una lista de cadenas, utilizar flatMap para concatenar sus elementos y contar el total de caracteres.
    //
    //Tarea: Mostrar la cadena resultante y el conteo de caracteres.


    public static void main(String[] args){

        List<String> cadenas = Arrays.asList("Hola", "Mundo", "CodeRunner");

        String concatenado = cadenas.stream()
                        .collect(Collectors.joining(""));

        int conteo = cadenas.stream()
                        .mapToInt(String::length)
                                .sum();

        System.out.println("Cadena concatenada: " + concatenado + ", Total de caracteres: " + conteo);

    }
}
