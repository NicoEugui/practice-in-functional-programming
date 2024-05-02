package S1.Pdf1;

public class Ejemplo11 {

    @FunctionalInterface
    public interface Operacion {
        int aplicar(int a, int b);
    }

    public static void main(String[] args) {
        Operacion suma = (a, b) -> a + b; // implementacion de la inferface funcional con lambda
        int resultado = suma.aplicar(5, 7); // uso de la interfae para sumar
        System.out.println("La suma es: " + resultado);
    }
}
