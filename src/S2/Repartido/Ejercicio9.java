package S2.Repartido;

import java.util.List;

public class Ejercicio9 {

    /**
     * Ejercicio 9: Invertir Cadena con Recursividad Objetivo:
     * Desarrolla una función recursiva que invierta una cadena de texto.
     * ● DatosdeEntrada: Una cadena de texto str.
     * ● Resultado Esperado: La cadena str invertida.
     * ● Ejemplo: Si str = "hola", la función debe retornar "aloh".
     */

    public static void main(String[] args) {
        String str = "hola";
        System.out.println("Original: " + str);
        System.out.println("Invertido: " + cadenaInvertida(str)); // "aloh"
    }

    public static String cadenaInvertida(String str) {

        if(str.isEmpty()) {
            return str;
        } else {
            return cadenaInvertida(str.substring(1)) + str.charAt(0);
        }
    }
}
