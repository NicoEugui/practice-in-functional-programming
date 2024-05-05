package S2.PDF2;

public class Ejemplo4 {

    /***
     *
     * Hallaremos el cálculo del factorial de un número. El factorial de un número entero positivo n,
     * denotado por n!
     */

    public static int calcularFactorial(int n) {
        // caso base: el factorial de 0 siempre es 1

        if(n == 0) {
            return 1;
        }
        // paso recursivo: n! = n * (n-1)!
        else {
            return n * calcularFactorial(n - 1);
        }
    }

    public static void main(String[] args) {

        int numero = 5;
        // muestra factorial de 5
        System.out.println("El factorial de " + numero + " es: " + calcularFactorial(numero));

    }
}
