package S3.PDF1;

import java.time.LocalTime;
import java.util.function.Function;

public class Ejemplo4 {
    /***
     * imaginemos que estamos desarrollando un sistema para
     * una tienda que necesita calcular precios con diferentes estrategias dependiendo de ciertas
     * condiciones, como promociones o eventos especiales como la hora del día
     */

    public static void main(String[] args) {

        // definir las estrategias como funciones lambda
        Function<Double, Double> normalStrategy = x -> x;
        Function<Double, Double> happyHourStrategy = x -> x * 0.5;

        // precio del producto
        double price = 100.0;

        // determinar la estrategia basada en la hora del dia
        Function<Double, Double> pricingStrategy;

        if(LocalTime.now().getHour() < 17) {
            pricingStrategy = normalStrategy;
            System.out.println("Aplicando precio normal");
        } else {
            pricingStrategy = happyHourStrategy;
            System.out.println("Aplicando precio de hora feliz");
        }

        // aplicar la estrategia de precios al producto
        double finalPrice = pricingStrategy.apply(price);
        System.out.println("El precio final es: " + finalPrice);
    }
}
