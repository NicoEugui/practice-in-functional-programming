package S1.Pdf1;

public class Ejemplo13 {

    @FunctionalInterface
    interface OperacionRecursiva {
        int operar(int n);
    }

    private static OperacionRecursiva sumaRecursiva = (n -> (n <=0) ? 0 : n
            + Ejemplo13.sumaRecursiva.operar(n - 1));

    public static void main(String[] args) {
        int n = 5;
        System.out.println("La suma de los numeros de 1 a " + n + " es: " + sumaRecursiva.operar(n));
    }
}
