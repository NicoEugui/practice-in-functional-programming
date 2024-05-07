package S2.Repartido;

public class Ejercicio8 {

    /**
     * Ejercicio 8: Suma Recursiva de Elementos Objetivo:
     * Escribe una función recursiva que sume todos los elementos de un arreglo de enteros.
     */

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("La suma de todos los elementos es: " + sumaRecursiva(arr, arr.length));
    }

    public static int sumaRecursiva(int[] arr, int n){

        if(n <= 0){
            return 0;
        } else {
            return sumaRecursiva(arr, n -1) + arr[n - 1];
        }


    }
}
