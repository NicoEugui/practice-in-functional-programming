package S3.Repartido;

import java.util.function.BiFunction;

public class Ejercicio6 {
    /**
     * Ejercicio 6: Combinar Funciones con BiFunction
     * Desarrollar una BiFunction<Integer, Integer, Integer> que sume dos números.
     * Utilizar esta BiFunction para sumar dos números dados.
     */

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> sumarDosNumeros = Integer::sum;

        int sumaUno = sumarDosNumeros.apply(11, 11);
        System.out.println(sumaUno);
    }
}
