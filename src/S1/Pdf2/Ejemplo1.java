package S1.Pdf2;

import java.util.function.Function;

public class Ejemplo1 {

    @FunctionalInterface
    interface OperacionBinaria {
        int aplicar(int a, int b);
    }

    public static void main(String[] args) {
        OperacionBinaria suma = (a, b) -> a + b;
        OperacionBinaria resta = (a, b) -> a - b;

        // este es el que usa .apply
        Function<Integer, Integer> cuadrado = x -> x * x;

        // Usando operaciones
        System.out.println("10 + 5: " + suma.aplicar(10, 5));
        System.out.println("10 - 5: " + resta.aplicar(10, 5));
        System.out.println("Cuadrado de 5: " + cuadrado.apply(5));

        // Obteniendo y usando una operacion desde el metodo
        OperacionBinaria operacion = obtenerOperacion("suma");
        System.out.println("Resultado de la operación obtenida: " +
                operacion.aplicar(7, 3));
    }

    public static OperacionBinaria obtenerOperacion(String tipo) {
        switch (tipo) {
            case "suma":
                return (a, b) -> a + b;
            case "resta":
                return (a, b) -> a - b;
            default:
                throw new IllegalArgumentException("Operación no soportada");
        }
    }

}
