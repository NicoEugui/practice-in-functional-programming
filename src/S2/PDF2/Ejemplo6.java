package S2.PDF2;

public class Ejemplo6 {

    /***
     *Ejercicio 2: Invertir una Cadena
     * Descripción: Desarrollemos una función recursiva que invierta una cadena dada. La función
     * debe tomar una cadena como entrada y devolver la cadena invertida.
     *
     */

    public static void main(String[] args) {
        String resultado = invertirCadena("hola");
        System.out.println(resultado);
    }

    public static String invertirCadena(String str) {
        // caso base
        if(str.isEmpty()){
            return str;
        } else {
            return invertirCadena(str.substring(1)) + str.charAt(0);
        }
    }
}
