package S2.PDF1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Persona {

    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

public class EjercicioPractico {

    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Alice", 22),
                new Persona("Bob", 30),
                new Persona("Bob", 30),
                new Persona("Charlie", 25),
                new Persona("David", 28)
        );

//        CriterioComparacion comparadorEdad = Persona::getEdad;
//
//        Optional<Persona> personaMayorEdad = personas.stream()
//                .max(Comparator.comparingInt(comparadorEdad::extraerValor));
//
//        personaMayorEdad.ifPresent(System.out::println);
    }
}
