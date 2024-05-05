package S2.PDF1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo2 {
    public static void main(String[] args) {

        /***
         * Ejemplo 2: Filtrando y mapeando
         */

        List<String> nombres = Arrays.asList("Ana", "Pedro", "Maria", "Juan");
        List<String> nombresConP = nombres.stream()
                .filter(nombre -> nombre.startsWith("P"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(nombresConP);
    }
}
