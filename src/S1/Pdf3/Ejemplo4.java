package S1.Pdf3;

import java.util.function.Predicate;

public class Ejemplo4 {


    public static void main(String[] args) {

        Predicate<String> predicate = (s) -> s.length() > 0;

        //evalua si la cadena "predicado" es mayor a 0
        System.out.println(predicate.test("predicado")); // true

        //niega la valor de la evaluación
        System.out.println(predicate.negate().test("predicado")); // false


    }
}
