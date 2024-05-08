package S3.Repartido;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.LongStream;

public class Ejercicio9 {
    /**
     * Ejercicio 9: Encontrar Máximo con flatMapToLong
     * Crear una lista de BigInteger y usar flatMapToLong para convertirlos a un LongStream.
     * Encuentra el valor máximo y muéstralo.
     */

    public static void main(String[] args) {
        List<BigInteger> grandesNumeros = List.of(new BigInteger("1234567890123456789"), new BigInteger("9876543210987654321"));

        long maximo = grandesNumeros.stream() .flatMapToLong(bi->
                        LongStream.of(bi.longValue()))
                .max().getAsLong();

        System.out.println("El valor máximo es: " + maximo);
    }
}
