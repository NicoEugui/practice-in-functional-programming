package Practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Ej9 {
    /**
     * Ejercicio 9: Uso de Supplier para Generar una Lista
     * Implementar un Supplier<List<Double>> que genere una lista de números aleatorios. U
     * tilizar este supplier para obtener y mostrar una lista de números aleatorios.
     */

    public static void main(String[] args) {

        Supplier<List<Double>>generarNumerosAleatorios=()->{
            Random random= new Random();
            List<Double>numeros=new ArrayList<>();
            for(int i=0; i<5; i++){
                numeros.add(random.nextDouble()
                );
            } return numeros; };
        List<Double>numerosAleatorios = generarNumerosAleatorios.get();
        System.out.println(numerosAleatorios);
    }
}
