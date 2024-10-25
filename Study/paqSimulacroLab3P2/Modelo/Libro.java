package paqSimulacroLab3P2.Modelo;

public class Libro extends ContenidoAudiovisual {
    private static final String tipo = "Libro";

    public Libro(String titulo, String autor, String fecha, String id) {
        super(titulo, autor, fecha, id);
    }
    public static String getTipo() { return tipo; }

    @Override
    public String toString() {
        return "\n" + " tipo= " + tipo + "\n" +
                super.toString() + "\n";
    }
}
