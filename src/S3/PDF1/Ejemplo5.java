package S3.PDF1;

import java.util.function.Consumer;

public class Ejemplo5 {

    public static void main(String[] args) {
        // estrategias de notificaciones definidas como funciones lambdas

        Consumer<String> emailNotification = message ->
                System.out.println("Enviando email: " + message);

        Consumer<String> smsNotification = message ->
                System.out.println("Enviando SMS: " + message);

        Consumer<String> inAppNotification = message ->
                System.out.println("Mostrando notificacion en la app: " + message);

        // mensaje de notificacion

        String notificationMessage = "Tienes un nuevo mensaje!";

        // seleccionar estrategia basada en algun criterio

        Consumer<String> selectedNotificationStrategy;

        // supongamos que el metodo seleccionado es SMS
        selectedNotificationStrategy = smsNotification;

        // aplicar la estrategia
        selectedNotificationStrategy.accept(notificationMessage);

    }
}
