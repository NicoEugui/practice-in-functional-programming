package S1.GestionLibro;

import S1.GestionLibro.model.Genero;
import S1.GestionLibro.model.Libro;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args){

        /**
         * todo Parte 2:
         * Creación de una lista de libros
         * Crea una lista de libros y añade algunos libros a la lista.
         */

        System.out.println("PARTE 2 -------------------------");
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("3462485238", "1984", "George Orwell", LocalDate.of(1949, 6, 8), 15.99, Genero.FICCION));
        libros.add(new Libro("7581236994", "Orgullo y prejuicio", "Jane Austen", LocalDate.of(1813, 1, 28), 12.99, Genero.COMEDIA));
        libros.add(new Libro("2109863745", "El señor de los anillos", "J.R.R. Tolkien", LocalDate.of(1954, 7, 29), 34.99, Genero.FICCION));
        libros.add(new Libro("4925738102", "Moby Dick", "Herman Melville", LocalDate.of(1851, 10, 18), 18.99, Genero.POLICIAL));
        libros.add(new Libro("8653472190", "La metamorfosis", "Franz Kafka", LocalDate.of(1915, 10, 15), 9.99, Genero.FICCION));
        libros.add(new Libro("1738902456", "La Odisea", "Homero", LocalDate.of(-800, 1, 1), 21.99, Genero.FICCION));
        libros.add(new Libro("6978154320", "Harry Potter y la piedra filosofal", "J.K. Rowling", LocalDate.of(1997, 6, 26), 27.99, Genero.FICCION));
        libros.add(new Libro("5249761830", "Crónica de una muerte anunciada", "Gabriel García Márquez", LocalDate.of(1981, 1, 1), 14.99, Genero.POLICIAL));
        libros.add(new Libro("9482673510", "Anna Karenina", "León Tolstói", LocalDate.of(1877, 1, 1), 22.99, Genero.COMEDIA));
        libros.add(new Libro("6154923870", "Las aventuras de Tom Sawyer", "Mark Twain", LocalDate.of(1876, 1, 1), 16.99, Genero.POLICIAL));


        //Diferentes formas de mostrar

        //funcional
        //libros.forEach( l -> System.out.println(l));
        libros.forEach(System.out::println);

        /***
         * todo Parte 3:
         * Filtrado de libros por autor
         * Utilizando programación funcional, crea una función que reciba la lista de libros y un autor como parámetro,
         * y devuelva una lista con los libros escritos por ese autor
         */
        System.out.println("PARTE 3 -------------------------");
        List<Libro> librosPorAutor = filtrarPorAutor(libros,"Miguel de Cervantes");
        librosPorAutor.forEach(System.out::println);

        /***
         * todo Parte 4:
         * Cálculo del precio total de los libros
         * Utilizando programación funcional, crea una función que reciba la lista de libros
         * y devuelva el precio total de todos los libros.
         */
        System.out.println("PARTE 4 -------------------------");
        System.out.println("Precio total: " + calcularPrecioTotal(libros));

        /****
         * todo Parte 5:
         * Ordenación de libros por fecha de creación
         * Utilizando programación funcional, crea una función que reciba la lista de libros
         * y devuelva una lista ordenada por fecha de creación, de más antiguo a más reciente
         */

        System.out.println("PARTE 5 -------------------------");
        List<Libro> librosOrdenadosPorFecha = ordenarPorFechaCreacion(libros);
        librosOrdenadosPorFecha.forEach(System.out::println);

        /***
         * todo Parte 3/2:
         * Filtrado de libros por género
         * Utilizando programación funcional, crea una función que reciba la lista de libros y un género como parámetro,
         * y devuelva una lista con los libros de ese género.
         */

        System.out.println("PARTE 3/2 -------------------------");
        List<Libro> librosFiltradosPorGenero = filtrarPorGenero(libros, Genero.COMEDIA);
        librosFiltradosPorGenero.forEach(System.out::println);

        /***
         * todo Parte 4/2:
         * Lista de títulos de cierto género
         * Utilizando programación funcional, crea una función que reciba la lista de libros
         * y un género como parámetro, y devuelva una lista con los títulos de los libros de ese género.
         */

        System.out.println("PARTE 4/2 -------------------------");
        List<String> tituloLibrosFiltradosPorGenero = listarTitulosPorGenero(libros, Genero.POLICIAL);
        tituloLibrosFiltradosPorGenero.forEach(System.out::println);

        /***
         * todo Parte 5/2:
         * Obtener el primer libro que se encuentre de un autor específico.
         * Utilizando programación funcional, crea una función que reciba la lista de libros
         * y un autor como parámetro, y devuelva un Optional con el Libro de ese autor.
         */

        System.out.println("PARTE 5/2 -------------------------");
        Optional<Libro> primerLibro = obtenerPrimerLibroPorAutor(libros, "Jane Austen");
        if(primerLibro.isPresent()){
            System.out.println(primerLibro.get());
        }

        /***
         * todo Parte 6/2:
         * Lista de libros agrupados por año de publicación.
         * Utilizando programación funcional, crea una función que reciba la lista de libros
         * y devuelva un Mapa de Libros agrupados por año de publicación.
         */
        System.out.println("PARTE 6/2 -------------------------");
        Map<Integer, List<Libro>> librosPorAnio = listarLibrosPorAnio(libros);
        librosPorAnio.forEach((anio, libro) -> {
            System.out.println("Anio: " + anio);
            libro.forEach(System.out::println);
        });

        /***
         * todo Parte 7/2:
         * Precio promedio por género.
         * Utilizando programación funcional, crea una función que reciba la lista de libros
         * y devuelva un Mapa de género y precio donde esté el precio promedio por género.
         */

        System.out.println("PARTE 7/2 -------------------------");
        Map<Genero, Double> precioPromedioPorGenero = precioPromedioPorGenero(libros);
        precioPromedioPorGenero.forEach((genero, precio) ->
                System.out.println(genero + " " + precio));
    }

    /***
     * todo Parte 3:
     * Filtrado de libros por autor
     * Utilizando programación funcional, crea una función que reciba la lista de libros y un autor como parámetro,
     * y devuelva una lista con los libros escritos por ese autor
     */

    public static List<Libro> filtrarPorAutor(List<Libro> libros, String autor) {
        return libros.stream()
                .filter(libro -> libro.getAutor().equals(autor))
                .collect(Collectors.toList());
    }


    /***
     * todo Parte 4:
     * Cálculo del precio total de los libros
     * Utilizando programación funcional, crea una función que reciba la lista de libros
     * y devuelva el precio total de todos los libros.
     */

    public static double calcularPrecioTotal(List<Libro> libros) {
        return libros.stream()
                .mapToDouble(Libro::getPrecio)
                .sum();
    }

    /****
     * todo Parte 5:
     * Ordenación de libros por fecha de creación
     * Utilizando programación funcional, crea una función que reciba la lista de libros
     * y devuelva una lista ordenada por fecha de creación, de más antiguo a más reciente
     */

    public static List<Libro> ordenarPorFechaCreacion(List<Libro> libros) {
        return libros.stream()
                .sorted(Comparator.comparing(Libro::getFechaCreacion))
                .collect(Collectors.toList());
    }

    /***
     * todo Parte 3/2:
     * Filtrado de libros por género
     * Utilizando programación funcional, crea una función que reciba la lista de libros y un género como parámetro,
     * y devuelva una lista con los libros de ese género.
     */

    public static List<Libro> filtrarPorGenero(List<Libro> libros, Genero genero) {
        return libros.stream()
                .filter(libro -> libro.getGenero().equals(genero))
                .collect(Collectors.toList());
    }

    /***
     * todo Parte 4/2:
     * Lista de títulos de cierto género
     * Utilizando programación funcional, crea una función que reciba la lista de libros
     * y un género como parámetro, y devuelva una lista con los títulos de los libros de ese género.
     */

    public static List<String> listarTitulosPorGenero(List<Libro> libros, Genero genero) {
        return libros.stream()
                .filter(libro -> libro.getGenero().equals(genero))
                .map(Libro::getTitulo)
                .collect(Collectors.toList());
    }

    /***
     * todo Parte 5/2:
     * Obtener el primer libro que se encuentre de un autor específico.
     * Utilizando programación funcional, crea una función que reciba la lista de libros
     * y un autor como parámetro, y devuelva un Optional con el Libro de ese autor.
     */
    public static Optional<Libro> obtenerPrimerLibroPorAutor(List<Libro> libros, String autor) {
        return libros.stream()
                .filter(libro -> libro.getAutor().equals(autor)).findFirst();
    }

    /***
     * todo Parte 6/2:
     * Lista de libros agrupados por año de publicación.
     * Utilizando programación funcional, crea una función que reciba la lista de libros
     * y devuelva un Mapa de Libros agrupados por año de publicación.
     */

    public static Map<Integer, List<Libro>> listarLibrosPorAnio (List<Libro> libros ) {
        return libros.stream()
                .collect(Collectors.groupingBy(libro -> libro.getFechaCreacion().getYear()));
    }

    /***
     * todo Parte 7/2:
     * Precio promedio por género.
     * Utilizando programación funcional, crea una función que reciba la lista de libros
     * y devuelva un Mapa de género y precio donde esté el precio promedio por género.
     */

    public static Map<Genero, Double> precioPromedioPorGenero(List<Libro> libros) {
        return libros.stream()
                .collect(
                        Collectors.groupingBy(
                                Libro::getGenero,
                                Collectors.averagingDouble(Libro::getPrecio)
                        )
                );
    }
}

