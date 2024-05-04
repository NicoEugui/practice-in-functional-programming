package GestionLibro.model;

import java.time.LocalDate;

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private LocalDate fechaCreacion;
    private double precio;
    private Genero genero;

    public Libro(String isbn, String titulo, String autor, LocalDate fechaCreacion, double precio, Genero genero) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaCreacion = fechaCreacion;
        this.precio = precio;
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", precio=" + precio +
                ", genero" + genero +
                '}';
    }
}
