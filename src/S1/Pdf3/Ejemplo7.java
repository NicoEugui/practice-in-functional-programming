package S1.Pdf3;

import java.util.function.Supplier;

public class Ejemplo7 {

    public static void main(String[] args) {

        Supplier<String> cadena = () -> "Ejemplo de Proveedor";
        System.out.println(cadena.get());
    }
}
