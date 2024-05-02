package S1.Pdf2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo5 {

    public static void main(String[] args) {

        // Escribe una expresión lambda que cuente cuántos elementos de una lista de enteros
        //cumplen con el criterio de ser mayores que 5. Utiliza esta expresión lambda en conjunto con
        //las herramientas apropiadas de la API Stream de Java para realizar el conteo efectivamente.

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long mayoresQueCinco = lista.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println(mayoresQueCinco);
    }
}
