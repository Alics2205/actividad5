package actividad5;
public class Main {

    public static void main(String[] args) {

        // costructor con parametros
        Libro libro1 = new Libro(
                "El principito",
                "Antoine de Saint-Exupery",
                "9789876123456",
                5
        );

        Libro libro2 = new Libro();

        libro2.setTitulo("Harry Potter");
        libro2.setAutor("J. K. Rowling");
        libro2.setIsbn("9788478884455");
        libro2.setEjemplares(8);
 //copia
        Libro libro3 = new Libro(libro1);

        // Constructor con parametros
        Libro libro4 = new Libro(
                "Clean Code",
                "Robert Martin",
                "9780132350884",
                3
        );

        // Constructor con parametros
        Libro libro5 = new Libro(
                "Java Como Programar",
                "Deitel",
                "9786073231196",
                6
        );

        // Prestamos

        libro1.prestamo();
        libro1.prestamo();

        libro4.prestamo();

        // Devolucion

        libro4.devolucion();

        // Setter

        libro5.setAutor("Harvey Deitel");

        System.out.println("Libro 1");
        libro1.mostrarDatos();

        System.out.println();

        System.out.println("Libro 2");
        libro2.mostrarDatos();

        System.out.println();

        System.out.println("Libro 3");
        libro3.mostrarDatos();

        System.out.println();

        System.out.println("Libro 4");
        libro4.mostrarDatos();

        System.out.println();

        System.out.println("Libro 5");
        libro5.mostrarDatos();

    }

}
