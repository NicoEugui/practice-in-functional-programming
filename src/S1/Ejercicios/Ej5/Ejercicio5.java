package S1.Ejercicios.Ej5;

/***
 * Recursividad sobre Bucles: ●
 * Implementa una función recursiva para calcular el factorial de un número.
 * Demuestra su uso con varios ejemplos, incluyendo el cálculo del factorial de 0, que debe devolver 1.
 */


public class Ejercicio5 {

    public static long factorial(int n) {
        if(n <= 1){
            return 1;
        } else {
            return n * factorial(n -1);
        }

    }
    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(5));
        System.out.println(factorial(7));
    }
}
