package S1.Pdf4;

import java.util.Optional;

public class Ejemplo2 {

    public static void main(String[] args) {
        // Se define una cadena con valor "null"
        String nombre = "null";

        // Se crea un Optional que puede contener un valor nulo
        Optional<String> oNombre = Optional.ofNullable(nombre);

        // Verificar si el Optional contiene un valor
        if (oNombre.isPresent()) { // Si el Optional contiene un valor
            System.out.println("El nombre es: " + oNombre.get()); // Imprime el valor
        } else { // Si el Optional está vacío
            System.out.println("El Optional está vacío."); // Imprime un mensaje
        }

        // Obtener el valor del Optional usando orElse
        String nombreObtenido = oNombre.orElse("Nombre por defecto"); // Obtiene el valor del Optional o un valor por defecto si está vacío
        System.out.println("El nombre obtenido es: " + nombreObtenido); // Imprime el valor obtenido

        // Obtener el valor del Optional usando orElseGet
        String nombreObtenido2 = oNombre.orElseGet(() -> "Nombre por defecto obtenido con orElseGet"); // Obtiene el valor del Optional o un valor generado por una función si está vacío
        System.out.println("El nombre obtenido con orElseGet es: " + nombreObtenido2); // Imprime el valor obtenido

        // Lanzar una excepción si el Optional está vacío usando orElseThrow
        try {
            String nombreObtenido3 = oNombre.orElseThrow(() -> new RuntimeException("El Optional está vacío")); // Obtiene el valor del Optional o lanza una excepción si está vacío
            System.out.println("El nombre obtenido con orElseThrow es: " + nombreObtenido3); // Imprime el valor obtenido
        } catch (RuntimeException e) { // Captura la excepción
            System.out.println(e.getMessage()); // Imprime el mensaje de la excepción
        }

        // Realizar una acción si el Optional contiene un valor usando ifPresent
        oNombre.ifPresent(n -> System.out.println("El nombre es: " + n)); // Realiza una acción si el Optional contiene un valor
    }
}
