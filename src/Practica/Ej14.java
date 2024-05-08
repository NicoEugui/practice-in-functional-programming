package Practica;

public class Ej14 {

    /**
     * Ejercicio 14: Recursividad sobre Bucles Implementa una función recursiva para calcular la potencia de un número.
     * Demuestra su uso con varios ejemplos, incluyendo el cálculo de la potencia de 0, que debe devolver 1.
     */

    public static void main(String[] args) {
        int numero = 5;
        long factorial = calcularFactorial(numero);
        System.out.println(factorial);
    }

    public static long calcularFactorial(int numero) {
        if(numero == 0) {
            return 1;
        } else {
            return numero * calcularFactorial(numero - 1);
        }
    }
}
