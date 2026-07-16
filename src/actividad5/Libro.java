package actividad5;

public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private int ejemplares;

    // Constructor vacipo
    public Libro() {

    }

    // Constructor con parametros
    public Libro(String titulo, String autor, String isbn, int ejemplares) {
//mayuscula metodo 
        this.titulo = titulo.toUpperCase();
        this.autor = autor;
        this.isbn = isbn;
        this.ejemplares = ejemplares;
    }

 //copia
    public Libro(Libro l) {

        this.titulo = l.titulo;
        this.autor = l.autor;
        this.isbn = l.isbn;
        this.ejemplares = l.ejemplares;
    }

    // Getters

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    // Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo.toUpperCase();
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public boolean prestamo() {

        if (ejemplares > 0) {
            ejemplares--;
            return true;
        }

        return false;
    }

    public void devolucion() {

        ejemplares++;
    }

    public void mostrarDatos() {

        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Ejemplares disponibles: " + ejemplares);
    }

}
