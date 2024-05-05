package S2.PDF2;

public class Ejemplo7 {

    /***
     * Solución del Ejercicio 3: Recursividad para encontrar el elemento en un array
     *
     */

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9};
        int resultado = buscarElemento(arr, 5, 0);
        System.out.println(resultado); // Debería imprimir 2. La función empieza a
        //buscar desde el índice 0. Al encontrar el 5 en el índice 2, retorna ese índice. 15


    }

    public static int buscarElemento(int[] arr, int elementoABuscar, int indice) {

        if (indice == arr.length) {
            return -1;// el elemento no se encontro en el array
        } else if (arr[indice] == elementoABuscar) {
            return indice; // el elemento se encontro en el indice actual
        } else {
            return buscarElemento(arr, elementoABuscar, indice + 1); //continua la busqueda
        }
    }
}
