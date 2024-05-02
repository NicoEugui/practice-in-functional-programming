package S1.Pdf3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Supplier;

/***
 * Referencia a mensajes
 */

public class Ejemplo11 {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new
                LinkedList<Integer>(Arrays.asList(1, 2, 3));

        Supplier<Integer> funcion3 = lista::removeLast;
        System.out.println(funcion3.get()); // 3
        lista.forEach(System.out::println);
    }
}
