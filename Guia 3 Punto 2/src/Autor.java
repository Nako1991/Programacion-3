public class Autor {

    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public Autor(String nombre, String apellido, String email, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public char getGenero() { return genero; }
    public void mostrar() {
        System.out.println("Autor");
        System.out.println(" Nombre: " + getNombre());
        System.out.println(" Apellido: " + getApellido());
        System.out.println(" Email: " + getEmail());
        System.out.println(" Genero: " + getGenero() + "\n");
    }
}
