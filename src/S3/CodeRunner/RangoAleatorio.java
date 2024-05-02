package S3.CodeRunner;

import java.util.function.Supplier;

public class RangoAleatorio {

    public static void main(String[] args) {

        // Implementar un Supplier<Integer> que retorne un entero aleatorio dentro de un rango especificado.
        //
        //Tarea: Generar y mostrar un número aleatorio entre 1 y 100.

        Supplier<Integer> aleatorio = () -> (int) (Math.random());

        if(aleatorio.get()<=100){
            System.out.println("El número es menor o igual que 100");
        }else{
            System.out.println("El número NO es menor o igual que 100");
        }
    }
}
