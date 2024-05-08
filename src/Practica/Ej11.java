package Practica;

import org.w3c.dom.ls.LSOutput;

public class Ej11 {
    /**
     * Ejercicio 11: Funciones Lambda e Interfaces Funcionales
     * Crea una interfaz funcional `Operacion` que represente una operación aritmética entre dos enteros.
     * Luego, implementa esta interfaz con expresiones lambda para realizar las operaciones de potenciación, módulo, concatenación y resta.
     * Demuestra el uso de estas implementaciones con ejemplos.
     */

    @FunctionalInterface
    interface Operacion {
        int aplicar(int a, int b);
    }



    public static void main(String[] args) {
        Operacion suma = (a, b) -> a + b;
        Operacion resta = (a,b)-> a-b;
        Operacion multiplicacion=(a,b)->a*b;
        Operacion division=(a,b)->a/b;

        System.out.println(suma.aplicar(11, 11));
        System.out.println(resta.aplicar(22,11));
        System.out.println(multiplicacion.aplicar(22, 22));
        System.out.println(division.aplicar(33,33));
    }
}
