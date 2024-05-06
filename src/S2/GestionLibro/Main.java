package S2.GestionLibro;

import S2.GestionLibro.model.Genero;
import S2.GestionLibro.model.Libro;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args) {

        /**
         * todo Parte 2:
         * Creación de una lista de libros
         * Crea una lista de libros y añade algunos libros a la lista.
         */

        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("3462485238", "1984 piedra", "George Orwell", LocalDate.of(1949, 6, 8), 15.99, Genero.FICCION));
        libros.add(new Libro("7581236994", "Orgullo y prejuicio", "Jane Austen", LocalDate.of(1813, 1, 28), 12.99, Genero.COMEDIA));
        libros.add(new Libro("2109863745", "El señor de los anillos", "J.R.R. Tolkien", LocalDate.of(1954, 7, 29), 34.99, Genero.FICCION));
        libros.add(new Libro("4925738102", "Moby Dick", "Herman Melville", LocalDate.of(1851, 10, 18), 18.99, Genero.POLICIAL));
        libros.add(new Libro("8653472190", "La metamorfosis", "Herman Melville", LocalDate.of(1915, 10, 15), 9.99, Genero.FICCION));
        libros.add(new Libro("1738902456", "La Odisea", "Homero", LocalDate.of(-800, 1, 1), 21.99, Genero.FICCION));
        libros.add(new Libro("6978154320", "Harry Potter y la piedra filosofal", "J.K. Rowling", LocalDate.of(1997, 6, 26), 27.99, Genero.FICCION));
        libros.add(new Libro("5249761830", "Crónica de una  piedra muerte anunciada", "Gabriel García Márquez", LocalDate.of(1981, 1, 1), 14.99, Genero.POLICIAL));
        libros.add(new Libro("9482673510", "Anna Karenina", "León Tolstói", LocalDate.of(1877, 1, 1), 22.99, Genero.COMEDIA));
        libros.add(new Libro("6154923870", "Las aventuras de Tom Sawyer", "Mark Twain", LocalDate.of(1876, 1, 1), 16.99, Genero.POLICIAL));


        System.out.println("PARTE 2");
        libros.forEach(System.out::println);

        /**
         * Parte 3: Obtener el libro más caro
         * Utilizando programación funcional,
         * crea una función que reciba la lista de libros y retorne el libro más caro
         */

        System.out.println("PARTE 3");
        Optional<Libro> libroMasCaro = obtenerLibroMasCaro(libros);
        libroMasCaro.ifPresentOrElse(libro -> System.out.println("El libro mas caro es: " + libro),
                () -> System.out.println("No hay libros"));

        /**
         * Parte 4: Transforma todos los títulos de los libros a mayúsculas
         * Utilizando programación funcional, crea una función que reciba la lista de libros
         * y devuelva una lista con los libros con sus títulos modificados.
         */

        System.out.println("PARTE 4");
        List<Libro> librosMayus = convertirTituloLibroAMayusculas(libros);
        librosMayus.forEach(System.out::println);

        /***
         * Parte 5: Verificar si hay algún libro de cierto autor
         * Utilizando programación funcional, crea una función que reciba la lista de libros
         * y un autor como parámetro,
         * y devuelva un booleano indicando si hay libros de ese autor.
         */
        System.out.println("PARTE 5");
        String autor = "Jane Austen";
        System.out.println("El verificar si hay libros de " + autor + " da " + verificarAutorLibro(libros, autor));

        /**
         * Parte 6: Contar el número de libros cuyo título contiene cierta palabra
         * Utilizando programación funcional, crea una función que reciba la lista de libros y una palabra,
         * y devuelva la cantidad de libros cuyo título tenga esa palabra.
         */

        System.out.println("PARTE 6");
        String palabra = "piedra";
        System.out.println(contarNumeroDeLibrosPorPalabra(libros, palabra));

        /***
         * Parte 7: Calcular la suma total de los precios de los libros publicados antes de cierta fecha
         * Utilizando programación funcional, crea una función que reciba la lista de libros y una fecha y
         * devuelva la suma total de precios de los libros publicados antes de esa fecha.
         */

        System.out.println("PARTE 7");
        System.out.println("El precio " + sumaPrecioLibrosPorFecha(libros, LocalDate.of(1949, 6, 8)));

        /**
         * Parte 8: Encontrar el libro más antiguo
         * Utilizando programación funcional, crea una función que reciba la lista de libros
         * y retorne el libro más antiguo.
         */

        System.out.println("PARTE 8");
        System.out.println("El libro mas anriguo es: " + encontrarLibroMasAntiguo(libros));

        /**
         * Parte 9: Verificar si todos los libros tienen un precio mayor a cierto valor
         * Utilizando programación funcional, crea una función que reciba la lista de libros y
         * retorne un booleano que indique si todos los precios de los libros son mayores a dicho valo
         */

        System.out.println("PARTE 9");
        double precio = 16.0;
        System.out.println("Todos los precios son mayores a: " + verificarPreciosMayores(libros, precio));

        /**
         * Parte 10: Crear un mapa con los libros agrupados por autor:
         * Utilizando programación funcional, crea una función que reciba la lista de libros
         * y retorne un mapa de libros agrupados por autor.
         */

        System.out.println("PARTE 10");
        Map<String, List<Libro>> librosPorAutor = agruparLibrosPorAutor(libros);
        librosPorAutor.forEach((a, libro) -> {
            System.out.println("Autor: " + a);
            System.out.println(libro);
        });

        System.out.println();
        System.out.println("VC 4 ----------------------------------");
        System.out.println();

        /***
         * Parte 3: Contar libros de un autor de forma recursiva
         * Utilizando recursividad, crea una función que reciba la lista de libros
         * y un autor y devuelva la cantidad de libros de ese autor.
         */

        System.out.println("PARTE 3 -------------------------------");

        String autor2 = "Herman Melville";
        System.out.println("Cantidad de libros del autor: " + autor2 + " es: " + contarLibrosDeAutorRecurivo(libros, autor2));

        /***
         * Parte 4: Calcular el precio total de una lista de libros de forma recursiva
         * Utilizando recursividad, crea una función que reciba la lista de libros y devuelva el precio total.
         */

        System.out.println();
        System.out.println("PARTE 4 --------------------------------");
        System.out.println("El precio total es: " + calcularPrecioTotalRecursivo(libros));

        /***
         * Parte 5: Encontrar el libro más caro de forma recursiva
         * Utilizando recursividad, crea una función que reciba la lista de libros
         * y devuelva el libro más caro.
         */

        System.out.println();
        System.out.println("PARTE 5 ---------------------------------");
        System.out.println("El libro mas caro es: " + encontrarLibroMasCaroRecursivo(libros));

        /**
         * Parte 6: Verificar si un libro existe en una lista de forma recursiva
         * Utilizando recursividad, crea una función que reciba la lista de libros
         * y un libro, y verifique si ese libro existe en la lista.
         */

        System.out.println();
        System.out.println("PARTE 6 ----------------------------------");

        Libro libro = new Libro("3462485222", "Github", "Mouredev", LocalDate.of(2022, 6, 8), 11.99, Genero.COMEDIA);
        System.out.println(verificarSiUnLibroExisteRecursivo(libros, libros.get(0)));

        /***
         * Parte 7: Contar libros cuyo título contiene cierta palabra de forma recursiva
         * Utilizando recursividad, crea una función que reciba la lista de libros
         * y una palabra y devuelva la cantidad de libros cuyo título contiene esa palabra.
         */

        System.out.println();
        System.out.println("PARTE 7 ------------------------------------");

        String palabra2 = "piedra";
        System.out.println("El contar libros con palabra " + palabra2 + " da como resultado: " + contarPalabrasRecursivo(libros, palabra2));

        /**
         * Parte 8: Calcular la suma total de precios de libros publicados antes de cierta fecha de forma recursiva
         * Utilizando recursividad, crea una función que reciba la lista de libros y una fecha
         * y retorne la suma total de precios de los libros anteriores a dicha fecha.
         */

        System.out.println();
        System.out.println("PARTE 8");
        LocalDate fecha = LocalDate.of(1877, 1, 1);
        System.out.println("La suma de precios de libros anteriores a la fecha: " + fecha + " da " + calcularDeSumaDePrecioAntesDeFecha(libros, fecha));
    }



    public static Optional<Libro> obtenerLibroMasCaro(List<Libro> libros) {
        return libros.stream()
                .max(Comparator.comparingDouble(Libro::getPrecio));
    }

    public static List<Libro> convertirTituloLibroAMayusculas(List<Libro> libros) {
        return libros.stream()
                .map(libro -> new Libro(
                        libro.getIsbn(),
                        libro.getTitulo().toUpperCase(),
                        libro.getAutor(),
                        libro.getFechaCreacion(),
                        libro.getPrecio(),
                        libro.getGenero())).collect(Collectors.toList());
    }

    public static boolean verificarAutorLibro(List<Libro> libros, String autor) {
        return libros.stream()
                .anyMatch(libro -> libro.getAutor().equals(autor));
    }

    public static long contarNumeroDeLibrosPorPalabra(List<Libro> libros, String palabra){
        return libros.stream()
                .filter(libro -> libro.getTitulo().toUpperCase().contains(palabra.toUpperCase()))
                .count();
    }

    public static double sumaPrecioLibrosPorFecha(List<Libro> libros, LocalDate fecha) {
        return libros.stream()
                .filter(libro -> libro.getFechaCreacion().isBefore(fecha))
                .mapToDouble(Libro::getPrecio)
                .sum();
    }

    public static Libro encontrarLibroMasAntiguo(List<Libro> libros) {
        return libros.stream()
                .min(Comparator.comparing(Libro::getFechaCreacion))
                .orElse(null);
    }

    public static boolean verificarPreciosMayores(List<Libro> libros, double precio) {
        return libros.stream()
                .allMatch(libro -> libro.getPrecio() > precio);
    }

    public static Map<String,  List<Libro>> agruparLibrosPorAutor(List<Libro> libros) {
        return libros.stream()
                .collect(Collectors.groupingBy(Libro::getAutor));
    }

    public static int contarLibrosDeAutorRecurivo(List<Libro> libros, String autor) {
        if(libros.isEmpty()) {
            return 0;
        }

        Libro primerLibro = libros.get(0);
        // check si el autor es igual al que tenemos en el primer libro (Posicion 0)
        int contador = autor.equalsIgnoreCase(primerLibro.getAutor()) ? 1 : 0;
        return contador + contarLibrosDeAutorRecurivo(libros.subList(1, libros.size()), autor);
    }

    public static double calcularPrecioTotalRecursivo(List<Libro> libros) {
        if(libros.isEmpty()) {
            return 0;
        }

        Libro primerLibro = libros.get(0);
        return primerLibro.getPrecio() + calcularPrecioTotalRecursivo(libros.subList(1, libros.size()));
    }

    public static Libro encontrarLibroMasCaroRecursivo(List<Libro> libros) {
        if(libros == null || libros.isEmpty()) {
            return null;
        }

        if(libros.size() == 1) {
            return libros.get(0);
        }

        Libro primerLibro = libros.get(0);
        Libro libroMasCaro = encontrarLibroMasCaroRecursivo(libros.subList(1, libros.size()));
        return primerLibro.getPrecio() >= libroMasCaro.getPrecio() ? primerLibro : libroMasCaro;

    }

    public static boolean verificarSiUnLibroExisteRecursivo(List<Libro> libros, Libro libro) {

        if(libros == null || libros.isEmpty()) {
            return false;
        }

        Libro primerLibro = libros.get(0);
        return primerLibro.equals(libro) || verificarSiUnLibroExisteRecursivo(libros.subList(1, libros.size()), libro);

    }

    public static int contarPalabrasRecursivo(List<Libro> libros, String palabra) {

        if(libros.isEmpty()) {
            return 0;
        }

        Libro primerLibro = libros.get(0);
        int contador = primerLibro.getTitulo().toLowerCase().contains(palabra.toLowerCase()) ? 1 : 0;
        return contador + contarPalabrasRecursivo(libros.subList(1, libros.size()), palabra);
    }

    public static double calcularDeSumaDePrecioAntesDeFecha(List<Libro> libros, LocalDate fecha){

        if(libros.isEmpty()) {
            return 0;
        }

        Libro primerLibro = libros.get(0);
        double precio = primerLibro.getFechaCreacion().isBefore(fecha) ? primerLibro.getPrecio() : 0;
        return precio + calcularDeSumaDePrecioAntesDeFecha(libros.subList(1, libros.size()), fecha);
    }


}

