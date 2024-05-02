package S1.Pdf3;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo9 {
    /***
    Metodo estatico
    */

    public static void main(String[] args) {

        // Lista de objetos vacia del tipo ArrayList
        List<String> names = new ArrayList<>();

        names.add("Andrea 1");
        names.add("Andrea 2");
        names.add("Andrea 3");
        names.add("Andrea 4");
        names.add("Andrea 5");
        names.add("Andrea 6");
        names.add("Andrea 7");

        // itera sobre cada elemento e imprime cada elemento en consola
        names.forEach(System.out::println);
    }
}
