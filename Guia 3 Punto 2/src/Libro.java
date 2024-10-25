public class Libro {

    private String titulo;
    private float precio;
    private int stock;
    public Autor autor;

    public Libro(String titulo, float precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public float getPrecio() { return precio; }
    public void setPrecio(float precio) { this.precio = precio; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) { this.autor = autor; }
    public void mostrar() {
        System.out.println("Libro");
        System.out.println(" Titulo: " + getTitulo());
        System.out.println(" Precio: " + getPrecio());
        System.out.println(" Stock: " + getStock() + "\n");
        autor.mostrar();
    }
    public void mostrarSticker() {
        System.out.println(
                "El libro, " + getTitulo() +
                " de " + autor.getNombre() +  " " + autor.getApellido() +
                ". Se vende a " + getPrecio() +
                " pesos.");
    }

}
