package Practica;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * Ejercicio 12: Uso de map y filter en Streams
 * Dada una lista de objetos `Producto` (con atributos nombre, precio y categoría),
 * utiliza streams para obtener una lista de nombres de productos que tengan un precio mayor a 100.000 y pertenezcan a la categoría "Electrodomésticos".
 */

public class Ej12 {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto("Televisor", 10000, "Electrodomesticos"),
                new Producto("Radio", 1300, "Electrodomesticos"),
                new Producto("Laptop", 12554, "Tech"),
                new Producto("Heladera", 22222, "Electrodomesticos")

        );

        List<String> nomProductos = productos.stream()
                .filter(p -> p.getPrecio() > 10000 && p.getCategoria().equals("Electrodomesticos"))
                .map(Producto::getNombre)
                .collect(Collectors.toList());
        System.out.println(nomProductos);
    }
}

class Producto {
    private String nombre;
    private int precio;
    private String categoria;

    public Producto(String nombre, int precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
