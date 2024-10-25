package paqSimulacroLab3P2.Modelo;

public class NovelaElectronica extends ContenidoAudiovisual {
    private static final String tipo = "NovelaElectronica";

    public NovelaElectronica(String titulo, String autor, String fecha, String id) {
        super(titulo, autor, fecha, id);
    }
    public String getTipo() { return tipo; }

    @Override
    public String toString() {
        return "\n" + " tipo= " + tipo + "\n" +
                super.toString() + "\n";
    }
}
