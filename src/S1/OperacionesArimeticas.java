package S1;

public class OperacionesArimeticas {

    public static void main(String[] args){

        Operacion suma = (a, b) -> a + b;
        Operacion resta = (a, b) -> a - b;
        Operacion divicion = (a, b) -> a / b;
        Operacion multiplicacion = (a, b) -> a * b;

        System.out.println("Suma: " + suma.aplicar(10, 20));
        System.out.println("Resta: " + resta.aplicar(20, 5));
        System.out.println("Divicion: " + divicion.aplicar(20, 2));
        System.out.println("Multiplicacion: " + multiplicacion.aplicar(5, 5));
    }
}
