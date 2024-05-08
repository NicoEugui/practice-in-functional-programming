package S3.Repartido;

import java.util.function.Supplier;

public class Ejercicio3 {

    /***
     * Ejercicio 3: Generar un Número Aleatorio con Supplier
     * Implementar un Supplier<Double> que retorne un número aleatorio.
     * Invocar este Supplier para obtener y mostrar un número aleatorio.
     */

    public static void main(String[] args) {

        Supplier<Double> numAleatorio = Math::random;

        System.out.println("el num aleatorio es: " + numAleatorio.get());
    }
}
