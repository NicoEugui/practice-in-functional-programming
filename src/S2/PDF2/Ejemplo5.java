package S2.PDF2;

import java.util.Arrays;
import java.util.List;

public class Ejemplo5 {
    /***
     * Ejercicio 1: Suma Recursiva de un Array
     *
     * Escribamos una función recursiva que sume todos los elementos de un array de
     * enteros. La función deberá recibir un array de enteros y su tamaño como argumentos y
     * devolver la suma total de sus elementos.
     */

    public static void main(String[] args) {
        int[] listaNumeros = {1, 2, 3, 4, 5};
        int resultado = sumaRecursiva(listaNumeros, listaNumeros.length);
        System.out.println(resultado);
    }

    public static int sumaRecursiva(int[] arr, int n) {
        /***
         * Consideraciones:
         * Pensemos en el caso base: cuando el tamaño n es 0, la suma debe ser 0, ya que no hay
         * elementos que sumar.
         *
         * En el paso recursivo, consideremos sumar el último elemento del array al resultado de la
         * suma recursiva del resto del array.
         *
         * Prueba de la función:
         * Podemos probar la función solución con un array como [1, 2, 3, 4, 5]. La suma de estos
         * elementos debería ser 15.
         */



        if(n <= 0) {
            return 0;
        } else {
            return sumaRecursiva(arr, n - 1) + arr[n - 1];
        }
    }


}
