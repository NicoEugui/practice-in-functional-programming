package S1.Pdf3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Ejemplo1 {

    // Recorrer una lista de numeros con lambda

    public static void main (String[] args) {

        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).
                forEach(System.out::println);
    }

}
