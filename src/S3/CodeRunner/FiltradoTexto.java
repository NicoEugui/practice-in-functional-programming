package S3.CodeRunner;

import java.util.Arrays;
import java.util.List;

public class FiltradoTexto {
    public static void main(String[] args){

        // Convertir una lista de cadenas a mayúsculas, usar flatMap para obtener un Stream de caracteres individuales, y filtrar aquellos que no son vocales.
        //
        //Tarea: Contar y mostrar el número de vocales en las cadenas originales.

        List<String> cadenas = Arrays.asList("Hola", "Mundo");

        long vocales = cadenas.stream()
                .flatMapToInt(String::chars)
                .map(Character::toUpperCase)
                .filter(c -> "AEIOU".indexOf(c) != -1)
                .count();

        System.out.println("Numero de vocales: " + vocales);

    }
}
