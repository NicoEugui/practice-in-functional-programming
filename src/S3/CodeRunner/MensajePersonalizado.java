package S3.CodeRunner;

import java.util.function.Consumer;

public class MensajePersonalizado {

    // Crear un Consumer<String> que agregue un prefijo "Mensaje: " antes de imprimir cualquier cadena recibida.
    //
    //Tarea: Usar este Consumer para imprimir mensajes personalizados.


    public static void main(String[] args ) {

        Consumer<String> imprimirMensaje = mensaje -> System.out.println("Mensaje: " + mensaje);


        imprimirMensaje.accept("Hola Mundo");
    }
}
