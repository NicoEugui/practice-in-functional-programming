package S3.PDF1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejemplo2 {

    /***
     * Ejemplo 2. Inmutabilidad

     * Consideremos una función que recibe una lista y retorna una nueva lista con elementos
     * duplicados, sin modificar la lista original.
     */
    public static void main(String[] args) {
        Function<List<String>, List<String>> duplicarElementos = original ->
                original.stream()
                        .flatMap(item -> Stream.of(item, item))
                        .collect(Collectors.toList());

        List<String> original = Arrays.asList("a", "b", "c");
        System.out.println(duplicarElementos.apply(original));
    }
}
