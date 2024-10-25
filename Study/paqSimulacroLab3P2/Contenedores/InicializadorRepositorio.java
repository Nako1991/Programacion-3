package paqSimulacroLab3P2.Contenedores;

import paqSimulacroLab3P2.Modelo.ContenidoAudiovisual;
import paqSimulacroLab3P2.Modelo.Libro;
import paqSimulacroLab3P2.Modelo.NovelaElectronica;

import java.util.HashMap;
import java.util.HashSet;

public abstract class InicializadorRepositorio { //Funciones del programa

    public static HashSet<ContenidoAudiovisual> crearColeccionLibros() {
        HashSet<ContenidoAudiovisual> libros = new HashSet<>();
        libros.add(new Libro(
                "Farenheit 451",
                "Ray Bradbury",
                "1953",
                "0451"
        ));
        libros.add(new Libro(
                "Dune",
                "Frank Herbert",
                "1965",
                "dun3"
        ));
        libros.add(new Libro(
                "El problema de los tres cuerpos",
                "Liu Cixin",
                "2006",
                "3bop"
        ));
        libros.add(new Libro(
                "1984",
                "George Orwell",
                "1949",
                "thnk"
        ));
        libros.add(new Libro(
                "Un mundo feliz",
                "Aldous Huxley",
                "1932",
                "smil"
        ));
        libros.add(new Libro(
                "Yo, robot",
                "Isaac Asimov",
                "1950",
                "i<3M"
        ));
        libros.add(new Libro(
                "Guerra de los mundos",
                "H. G. Wells",
                "1898",
                "gdlm"
        ));
        libros.add(new Libro(
                "El juego de Ender",
                "Orson Scott Card",
                "1985",
                "ejde"
        ));
        libros.add(new Libro(
                "Trilogia de la Fundacion",
                "Isaac Asimov",
                "1986",
                "tdlf"
        ));
        libros.add(new Libro(
                "2001: Una odisea en el espacio",
                "Arthur C. Clark",
                "1968",
                "2001"
        ));
        return libros;
    }

    public static HashSet<ContenidoAudiovisual> crearColeccionNovelasElectronicas() {
        HashSet<ContenidoAudiovisual> novelas = new HashSet<>();
        novelas.add(new NovelaElectronica(
                "El señor de los anillos",
                "J. R. R. Tolkien",
                "1937",
                "tltr"
        ));
        novelas.add(new NovelaElectronica(
                "El nombre del viento",
                "Patrick Rothfuss",
                "2007",
                "endv"
        ));
        novelas.add(new NovelaElectronica(
                "Juego de tronos",
                "George R. R. Martin",
                "2007",
                "goty"
        ));
        novelas.add(new NovelaElectronica(
                "El camino de los reyes",
                "Brandon Sanderson",
                "2012",
                "ecdr"
        ));
        novelas.add(new NovelaElectronica(
                "Harry Potter y la piedra filosofal",
                "J. K. Rowling",
                "1997",
                "hpfs"
        ));
        novelas.add(new NovelaElectronica(
                "El viaje de Shuna",
                "Hayao Miyazaki",
                "1983",
                "shun"
        ));
        novelas.add(new NovelaElectronica(
                "El ladron del rayo",
                "Rick Riordan",
                "2005",
                "ptjk"
        ));
        novelas.add(new NovelaElectronica(
                "Kalpa Imperial",
                "Angelica Gorodischer",
                "1983",
                "kalp"
        ));
        novelas.add(new NovelaElectronica(
                "Los jardines de la luna",
                "Steven Erikson",
                "1999",
                "jdll"
        ));
        novelas.add(new NovelaElectronica(
                "El Silmarillion",
                "J. R. R. Tolkien",
                "1977",
                "jrrt"
        ));
        return novelas;
    }
}