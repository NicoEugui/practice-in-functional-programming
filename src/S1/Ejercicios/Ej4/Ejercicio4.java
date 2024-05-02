package S1.Ejercicios.Ej4;

import java.util.Arrays;
import java.util.List;

/**
 * Funciones Puras: ●
 * Escribe una función pura que reciba dos listas de números enteros,
 * sume el primer elemento de la primera lista con el último elemento de la segunda lista,
 * Y retorne el resultado.
 * Asegúrate de que esta función no cause efectos secundarios.
 */

public class Ejercicio4 {

    public static int sumaEspecial(List<Integer> lista1, List<Integer> lista2) {
        if(lista1.isEmpty() || lista2.isEmpty()) {
            return 0;
        }
        return lista1.get(0) + lista2.get(lista2.size() - 1);
    }

    public static void main(String[] args) {

        List<Integer> lista1 = Arrays.asList(1, 2, 3);
        List<Integer> lista2 = Arrays.asList(4, 5, 6);
        System.out.println(sumaEspecial(lista1, lista2));
    }
}
