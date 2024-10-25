public class Main {
    public static void main(String[] args) {

        //PUNTO a
        Autor autor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        //PUNTO b
        autor.mostrar();
        //PUNTO c
        Libro libro = new Libro("Effective Java", 450, 150, autor);
        //PUNTO d
        libro.mostrar();
        //PUNTO e
        libro.setPrecio(500);
        libro.setStock(libro.getStock() + 50);
        libro.mostrar();
        //PUNTO f
        libro.autor.mostrar();
        //PUNTO g
        libro.mostrarSticker();

    }
}