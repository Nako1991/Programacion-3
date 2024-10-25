import java.util.Scanner;

public class Menu {
    Libro libro1 = new Libro("Dune", "Frank Herbert", 1965, "Ciencia Ficcion", 631);
    Libro libro2 = new Libro("1984", "George Orwell", 1949, "Ciencia Ficcion", 326);
    Libro libro3 = new Libro("Un Mundo Feliz", "Aldous Huxley", 1932, "Ciencia Ficcion", 256);
    Libro libro4 = new Libro("Fahrenheit 451", "Ray Bradbury", 1953, "Ciencia Ficcion", 272);
    Libro libro5 = new Libro("Fundación", "Isaac Asimov", 1951, "Ciencia Ficcion", 230);
    public void ejecutarMenu() {
        int opcion = -1;
        do {
            mostrarMenu();
            opcion = obtenerInput(); //Con comprobacion
            ejecutarOpciones(opcion);
        } while ( opcion != 0 );
        System.out.println("Saliendo del menu..."); //DEBUG
    }

    private void mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("  1: Mostrar todos los libros.");
        System.out.println("  2: Modificar cantidad de páginas de un libro.");
        System.out.println("  3: Modificar el año de todos los libros.");
        System.out.println("  0: Salir.");
        System.out.println("Seleccione una de las opciones: ");
    }

    private int obtenerInput() {
        int opcion = -1;
        try { //testeando el try catch
            //System.out.println("Ingresando a Try, buscando excepcion."); //DEBUG
            opcion = new Scanner(System.in).nextInt(); //devuelve una excepcion cuando no encuentra un int
        } catch (Exception error) {
            System.out.println("Ingreso de datos invalido, Por favor ingrese un numero entero.");
        }
        return opcion;
    }

    private void ejecutarOpciones(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Ingresando a la opcion 1..."); //DEBUG
                //mostrarLibros();
                break;
            case 2:
                System.out.println("Ingresando a la opcion 2..."); //DEBUG
                //setPaginasLibro();
                break;
            case 3:
                System.out.println("Ingresando a la opcion 3..."); //DEBUG
                //setAñoLibros();
                break;
            case 0:
                System.out.println("Ingresando a la opcion 0..."); //DEBUG
                break;
            default:
                System.out.println("El numero ingresado no se corresponda con una opcion del menu.");
                //mostrarLibros();
                break;
        }
    }
}
