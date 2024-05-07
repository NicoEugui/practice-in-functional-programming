package S3.PDF1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Ejemplo7 {

    /***
     * Supongamos que estamos creando una aplicación que puede generar diferentes tipos de
     * saludos basados en el idioma. En lugar de usar subclases para cada tipo de saludo, usaremos
     * expresiones lambda.
     */

    public static void main(String[] args) {

        // factory map que asocia un idioma con una funcion que genera un saludo

        Map<String, Function<String, String>> saludoFactory = new HashMap<>();

        saludoFactory.put("EN", name -> "Hello, " + name + "!");
        saludoFactory.put("ES", name -> "Hola!, " + name + "!");
        saludoFactory.put("FR", name -> "Bonjour, " + name + "!");

        // Generar diferentes saludos basados en el idioma
        String nombre = "Mundo";
        System.out.println(saludoFactory.get("EN").apply(nombre));
        System.out.println(saludoFactory.get("ES").apply(nombre));
        System.out.println(saludoFactory.get("FR").apply(nombre));
    }
}
