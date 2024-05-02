package S3.CodeRunner;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

// Implementar un sistema que permita al usuario seleccionar una operación aritmética (suma, resta, multiplicación) sobre un par de números utilizando Function<Pair<Integer, Integer>, Integer>.
//
//Tarea: Pedir al usuario que elija una operación, leer dos números y aplicar la operación seleccionada para mostrar el resultado.


public class OperacionesAritmeticas {

    public static void main(String[] args){

        Map<String, BiFunction<Integer, Integer, Integer>> operaciones = new HashMap<>();
        //TODO: complete este codigo
        operaciones.put("suma", (num1, num2) -> num1 + num2);
        operaciones.put("resta", (num1, num2) -> num1 - num2);
        operaciones.put("multiplicacion", (num1, num2) -> num1 * num2);

        // Simulando la selección del usuario
        String operacionSeleccionada = "suma"; // Esto podría venir de la entrada del usuario
        int num1 = 5;
        int num2 = 3;

        // Aplicar la operación seleccionada
        BiFunction<Integer, Integer, Integer> operacion = operaciones.get(operacionSeleccionada);
        if (operacion != null) {
            int resultado = operacion.apply(num1, num2);
            System.out.println("El resultado de la " + operacionSeleccionada + " es: " + resultado);
        } else {
            System.out.println("Operación no soportada.");
        }


    }
}
