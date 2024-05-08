package S3.Repartido;

import java.util.function.Consumer;

public class Ejercicio2 {

    /**
     * Ejercicio 2: Usar Consumer para Imprimir un Mensaje
     * Crear un Consumer<String> que imprima cualquier cadena que reciba.
     * Utilizar este Consumer para imprimir un mensaje específico.
     */

    public static void main(String[] args) {

        Consumer<String> message = System.out::println;

        message.accept("hola que tal");
    }
}
