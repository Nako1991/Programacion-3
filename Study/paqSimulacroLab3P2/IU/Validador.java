package paqSimulacroLab3P2.IU;

import paqSimulacroLab3P2.Excepciones.IdentificadorDuplicadoException;
import paqSimulacroLab3P2.Modelo.ContenidoAudiovisual;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public abstract class Validador {
    public static void validarID(HashMap<String, HashSet<ContenidoAudiovisual>> repositorio, String id) throws IdentificadorDuplicadoException {
        if( !repositorio.isEmpty() ) {
            for (Map.Entry<String, HashSet<ContenidoAudiovisual>> elemento : repositorio.entrySet() ) {
                HashSet<ContenidoAudiovisual> contenidos = elemento.getValue();
                for ( ContenidoAudiovisual contenido : contenidos )
                    if( contenido.getId().equals(id) )
                        throw new IdentificadorDuplicadoException("Ya existe este contenido en la biblioteca.");
            }
        }
    }
}
