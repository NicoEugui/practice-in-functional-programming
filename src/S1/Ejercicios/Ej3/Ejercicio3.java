package S1.Ejercicios.Ej3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * Toma una lista de objetos Persona (con atributos nombre y edad)
 * Y utiliza streams para obtener una lista de nombres de personas que tienen al menos 18 años.
 */

public class Ejercicio3 {

    public static void main(String[] args) {

        List<Personas> personas = Arrays.asList(
                new Personas("Nicolas", 11),
                new Personas("Santiago", 25),
                new Personas("Jorge", 22)
        );

        List<String> nombres = personas.stream()
                .filter(p -> p.edad > 18)
                .map(p -> p.nombre)
                .collect(Collectors.toList());
        System.out.println(nombres);
    }




}
