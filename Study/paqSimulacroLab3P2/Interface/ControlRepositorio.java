package paqSimulacroLab3P2.Interface;

import paqSimulacroLab3P2.Modelo.ContenidoAudiovisual;

import java.util.HashSet;

public interface ControlRepositorio<T extends ContenidoAudiovisual, V> {
    void agregarContenido(T entidad);
    void mostrarContenido(V tipoDeContenido);
    void agregarContenidos(HashSet<T> entidades);
    void mostrarTodosLosContenidos();
}
