package paqSimulacroLab3P2.Contenedores;

import paqSimulacroLab3P2.Interface.ControlRepositorio;
import paqSimulacroLab3P2.Modelo.ContenidoAudiovisual;

import java.util.*;

public class Repositorio implements ControlRepositorio<ContenidoAudiovisual, String> { //Funciones CRUD
    private HashMap< String, HashSet<ContenidoAudiovisual> > repositorio;

    public Repositorio() {
        repositorio = new HashMap<>();
    }

    public HashMap<String, HashSet<ContenidoAudiovisual>> getRepositorio() { return repositorio; }
    public void setRepositorio(HashMap<String, HashSet<ContenidoAudiovisual>> repositorio) { this.repositorio = repositorio; }

    @Override
    public void agregarContenido(ContenidoAudiovisual contenido) {
        String tipo = contenido.getClass().getName();
        HashSet<ContenidoAudiovisual> biblioteca = new HashSet<>();
        if ( repositorio.containsKey(tipo) )
            biblioteca = repositorio.get(tipo);
        biblioteca.add(contenido);
        repositorio.put(tipo, biblioteca);
    }
    @Override
    public void agregarContenidos(HashSet<ContenidoAudiovisual> contenidos) {
        String tipo = contenidos.iterator().next().getClass().getSimpleName();
        HashSet<ContenidoAudiovisual> biblioteca = new HashSet<>();
        if( repositorio.containsKey(tipo) )
            biblioteca = repositorio.get(tipo);
        biblioteca.addAll(contenidos);
        repositorio.put(tipo, biblioteca);
    }
    @Override
    public void mostrarContenido(String tipo) {
        for ( ContenidoAudiovisual contenido : repositorio.get(tipo) )
            System.out.println(contenido);
    }

    @Override
    public void mostrarTodosLosContenidos() {
        if( repositorio.isEmpty() )
            System.out.println("El repositorio esta vacio"); //exception handle
        else
            for(Map.Entry<String, HashSet<ContenidoAudiovisual>> contenido : repositorio.entrySet() )
                System.out.println(contenido);
    }

}

