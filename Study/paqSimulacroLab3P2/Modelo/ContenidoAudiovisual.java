package paqSimulacroLab3P2.Modelo;

import java.util.Objects;

public abstract class ContenidoAudiovisual {
    protected String titulo;
    protected String autor;
    protected String fecha;
    protected String id;

    public ContenidoAudiovisual(String titulo, String autor, String fecha, String id) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
        this.id = id;
    }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    @Override
    public String toString() {
        return " titulo= " + titulo + "\n" +
                " autor= " + autor + "\n" +
                " fecha= " + fecha + "\n" +
                " id= " + id + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContenidoAudiovisual that = (ContenidoAudiovisual) o;
        return Objects.equals(titulo, that.titulo)
                && Objects.equals(autor, that.autor)
                && Objects.equals(fecha, that.fecha)
                && Objects.equals(id, that.id);
    }
}
