public class Libro {
    String titulo;
    String autor;
    int año;
    String genero;
    int paginas;

    public Libro(String titulo, String autor, int año, String genero, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.genero = genero;
        this.paginas = paginas;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void mostrarTitulo() {
        System.out.println(this.titulo);
    }
    public void mostrarAutor() {
        System.out.println(this.autor);
    }
    public void mostrarAño() {
        System.out.println(this.año);
    }
    public void mostrarGenero() {
        System.out.println(this.genero);
    }
    public void mostrarPaginas() {
        System.out.println(this.paginas);
    }

    public void mostrarLibro() {
        System.out.println();
        mostrarTitulo();
        mostrarAutor();
        mostrarAño();
        mostrarGenero();
        mostrarPaginas();
    }

    public void mostrarLibroGrande() {
        if(this.paginas > 500) {
            mostrarLibro();
        }
    }
}
