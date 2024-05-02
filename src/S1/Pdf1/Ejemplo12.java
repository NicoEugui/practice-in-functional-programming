package S1.Pdf1;

public class Ejemplo12 {

    @FunctionalInterface
    interface Factorial {
        long calcular(int n);
    }

    private static Factorial factorial = (n -> (n == 0) ? 1 : n * Ejemplo12.factorial.calcular(n - 1)); // Cambio aquí
    public static void main(String[] args) {

        int numero = 5;
        System.out.println(factorial.calcular(numero));

    }
}
