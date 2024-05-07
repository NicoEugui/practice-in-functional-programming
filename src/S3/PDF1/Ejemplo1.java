package S3.PDF1;

import java.util.function.Function;

public class Ejemplo1 {

    /***
     * Ejemplo 1. Composición sobre Herencia
     *
     * Supongamos que tenemos funciones para procesar texto: una función para eliminar espacios
     * en blanco y otra para convertir el texto a mayúsculas. En lugar de crear una jerarquía de
     * clases para estos comportamientos, simplemente podemos componer las funciones.
     */

    public static void main(String[] args) {
        Function<String, String> removerEspacios = str -> str.replaceAll(" ", "");
        Function<String, String> convertirAMayusculas = str -> str.toUpperCase();

        Function<String, String> procesarTexto = removerEspacios.andThen(convertirAMayusculas);
        System.out.println(procesarTexto.apply("Hola Mundo"));
    }
}
