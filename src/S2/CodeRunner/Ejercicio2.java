package S2.CodeRunner;

/**
 Complete el método eliminarCaracteres e imprima su valor

 Desarrolla una función recursiva que elimine un carácter específico de una cadena de texto
 */

public class Ejercicio2 {

    public static String eliminarCaracteres(String str, char ch) {
        if(str.isEmpty()) {
            return str;
        }

        //// Usa el operador ternario para verificar si el primer carácter coincide con 'ch'.
        // Si es así, no lo incluyas en el resultado final; de lo contrario, incluye el carácter.
        return (str.charAt(0) == ch ? "" : str.charAt(0)) + eliminarCaracteres(str.substring(1), ch);
    }

    public static void main(String[] args) {
        String str = "banana";
        char ch = 'a';
        System.out.println(eliminarCaracteres(str, ch));
    }
}
