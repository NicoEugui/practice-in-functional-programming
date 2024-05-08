package Practica;

import java.util.function.BiFunction;

public class Ej10 {
    /**
     * Ejercicio 10: Uso de BiFunction para Operaciones Matemáticas
     * Desarrollar una BiFunction<Integer, Integer, Integer> que realice una operación matemática (por ejemplo, suma, resta, multiplicación) entre dos números enteros.
     * Pedir al usuario que ingrese dos números y la operación a realizar, y mostrar el resultado.
     */
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> opMat = Integer::sum;

        System.out.println(opMat.apply(1, 10));

    }
}
