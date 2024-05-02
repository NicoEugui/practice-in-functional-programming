package S1.Ejercicios.Ej1;

/***
 * Crea una interfaz funcional Operacion que represente una operación aritmética entre dos enteros.
 * Luego, implementa esta interfaz con expresiones lambda para realizar las operaciones de suma, resta, multiplicación y división.
 * Demuestra el uso de estas implementaciones con ejemplos.
 */

public class Ejercicio1 {

    public static void main(String[] args) {

        Operacion suma = ((a, b) -> a + b);
        Operacion resta = ((a, b) -> a - b);
        Operacion divicion = ((a, b) -> a / b);
        Operacion multiplicacion = ((a, b) -> a * b);

        System.out.println(suma.aplicar(5, 10));
        System.out.println(resta.aplicar(15, 5));
        System.out.println(divicion.aplicar(20, 2));
        System.out.println(multiplicacion.aplicar(5,5));
    }
}
