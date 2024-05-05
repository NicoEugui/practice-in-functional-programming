package S2.PDF2;

public class Ejemplo2 {

    /**
     * Consideremos el cálculo de la serie de Fibonacci,
     * que es un ejemplo clásico de función que se
     * puede implementar recursivamente:
     */

    public static void main(String[] args) {
        int resultado = fibonacci(6);
        System.out.println(resultado);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
