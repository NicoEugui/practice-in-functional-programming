package S2.CodeRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejemplo5 {

    /***
     * Complete el método agruparPorCondicion utilizando programacion funcional e imprima los valores
     *
     * Utilizar collect con Collectors.groupingBy para agrupar las palabras por su primera letra.
     */
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("banana", "manzana", "mandarina", "cereza", "ciruela");
        Map<Character, List<String>> agrupados = agruparPorCondicion(palabras);
        System.out.println(agrupados);
    }

    public static Map<Character, List<String>> agruparPorCondicion(List<String> palabras){
        return palabras.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
    }
}
