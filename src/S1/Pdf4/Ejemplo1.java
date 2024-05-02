package S1.Pdf4;

import java.sql.Array;
import java.util.ArrayList;

/**
 * Vamos a construir un ejemplo sencillo de uso de Stream en Java 8.
 * Supongamos que llevamos una especie de bitácora de gastos diarios, donde vamos
 * almacenando todo lo que gastamos día a día. Cada día además tendremos un máximo para
 * gastar de 500 pesos, y si superamos ese máximo queremos registrarlo para saber que nos
 * fuimos de presupuesto.
 *
 * Para eso quiero:
 * - saber cuanto da la suma de todos los gastos registrados
 * - saber la cantidad de días que no supere los 500 pesos
 * - saber la cantidad de días que sí supere los 500 pesos
 */

public class Ejemplo1 {

    public static void main(String[] args) {

        ArrayList<Gasto> lista = new ArrayList<Gasto>();

        lista.add(new Gasto("Gasto1", 100));
        lista.add(new Gasto("Gasto2", 50));
        lista.add(new Gasto("Gasto3", 700));
        lista.add(new Gasto("Gasto4", 950));
        lista.add(new Gasto("Gasto5", 200));

        double total = lista.stream()
                        .mapToDouble(gasto -> gasto.getValor())
                                .sum();

        long cantidadDiasSuperanPresupuesto =
        lista.stream()
                        .filter(gasto -> gasto.getValor() > 500)
                                .count();

        long cantidadDiasNoSuperanPresupuesto =
                lista.stream().filter(gasto -> gasto.getValor() < 500)
                                .count();

        System.out.println("Total: " + total);
        System.out.println("Cantidad de dias que no superan presupuesto " + cantidadDiasNoSuperanPresupuesto);
        System.out.println("Cantidad de dias que superan el presupuesto: " + cantidadDiasSuperanPresupuesto);
    }
}
