package S3.PDF1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Ejemplo6 {
    /**
     * Vamos a ver un ejemplo de cómo utilizar el patrón "Observer" implementado en un estilo
     * funcional en Java.
     */

    static class Subjet {
        private final List<Consumer<String>> observers = new ArrayList<>();

        public void addObserver(Consumer<String> observer) {
            observers.add(observer);
        }

        public void notifyObservers(String event) {
            observers.forEach(observer -> observer.accept(event));
        }
    }

    public static void main(String[] args) {
        Subjet subjet = new Subjet();

        // agregar observadores
        subjet.addObserver(event -> System.out.println("Observer 1 received: " + event));

        subjet.addObserver(event -> System.out.println("Observer 2 received: " + event));

        subjet.addObserver(event -> System.out.println("Observer 3 received: " + event));

        // notificar a todos los observadores sobre un evento

        subjet.notifyObservers("New event ocurred!");
    }
}
