package paqSimulacroLab3P2.IU;

import paqSimulacroLab3P2.Contenedores.InicializadorRepositorio;
import paqSimulacroLab3P2.Contenedores.Repositorio;
import paqSimulacroLab3P2.Excepciones.IdentificadorDuplicadoException;
import paqSimulacroLab3P2.Modelo.ContenidoAudiovisual;
import paqSimulacroLab3P2.Modelo.Libro;
import paqSimulacroLab3P2.Modelo.NovelaElectronica;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MenuPrincipal {
    Scanner scanner = new Scanner(System.in);
    private Repositorio repositorio;
    private int continuar;
    private int seleccion;

    public MenuPrincipal() {
        this.continuar = 1;
        this.repositorio = new Repositorio();
    }

    public void ejecutarMenu() {
        try {
            while ( continuar == 1 ) {
                mostrarMenu();
                seleccionarItemMenu();
                switch ( seleccion ) {
                    case 1:
                        repositorio.agregarContenidos(InicializadorRepositorio.crearColeccionLibros());
                        repositorio.agregarContenidos(InicializadorRepositorio.crearColeccionNovelasElectronicas());
                        System.out.println("Cargando Libros y Novelas Electronicas en la biblioteca.");
                        break;
                    case 2:
                        repositorio.mostrarTodosLosContenidos();
                        break;
                    case 3:
                        ingresarContenidoAMostrar();
                        break;
                    case 4:
                        ingresarLibro();
                        break;
                    case 5:
                        ingresarNovela();
                        break;
                    case 6:
                        eliminarContenido();
                        break;
                    case 0:
                        continuar = 0;
                        break;
                    default:
                        System.out.println("La opcion seleccionada no se encuentra en el menu.");
                        break;
                }
            }
            System.out.println("\nSaliendo del programa...");
        }
        catch (NoSuchElementException | IllegalStateException error) {
            error.getStackTrace();
            System.out.println("Error: " + error.getMessage());
        }
    }

    private void mostrarMenu() {
        System.out.println("Laboratorio 3 - Segundo Parcial");
        System.out.println("Menu Principal");
        System.out.println("Por favor seleccione una colección:");
        System.out.println(" 1. Cargar Libros y Novelas automaticamente");
        System.out.println(" 2. Mostrar Libros y Novelas");
        System.out.println(" 3. Ingresar tipo de contenido a mostrar ('Libro', 'NovelaElectronica')");
        System.out.println(" 4. Agregar un libro al repositorio");
        System.out.println(" 5. Agregar una novela electronica al repositorio");
        System.out.println(" 0. Salir");
    }

    private int seleccionarItemMenu() {
        try {
            System.out.print("\nIngrese la opcion del menu a seleccionar: ");
            seleccion = scanner.nextInt();
            scanner.nextLine(); //Para evitar bugs
            System.out.println();
        }
        catch (NoSuchElementException | IllegalStateException error) {
            error.getStackTrace();
            System.out.println("Error: " + error.getMessage());
        }
        return -1;
    }

    private void ingresarContenidoAMostrar() {
        String tipoDeContenido = ingresarTipoDeContenidoAMostrar();
        if( repositorio.getRepositorio().isEmpty() )
            System.out.println("El repositorio esta vacio"); //exception handle
        else if( !repositorio.getRepositorio().containsKey(tipoDeContenido) )
            System.out.println("No existe la biblioteca con ese nombre"); //exception handle
        else
            repositorio.mostrarContenido(tipoDeContenido);
    }

    private String ingresarTipoDeContenidoAMostrar() {
        System.out.print("\n Por favor ingrese el tipo de contenido a mostrar: ");
        String tipo = scanner.nextLine();
        System.out.println();
        return tipo;
    }

    private void ingresarLibro() {
        Boolean idValido = false;
        do {
            try {
                System.out.print("Por favor Ingresar el id del libro: ");
                String id = scanner.nextLine();
                Validador.validarID(repositorio.getRepositorio(), id);
                idValido = true;
                System.out.println();
                System.out.print("Por favor Ingresar el titulo del libro: ");
                String titulo = scanner.nextLine();
                System.out.println();
                System.out.print("Por favor Ingresar el autor del libro: ");
                String autor = scanner.nextLine();
                System.out.println();
                System.out.print("Por favor Ingresar la fecha del libro: ");
                String fecha = scanner.nextLine();
                System.out.println();
                Libro libro = new Libro(titulo, autor, fecha, id);
                repositorio.agregarContenido(libro);
            }
            catch (IdentificadorDuplicadoException e) {
                System.out.println(e.getMessage());
            }
        } while ( !idValido );
    }

    private void ingresarNovela() {
        Boolean idValido = false;
        do {
            try {
                System.out.print("Por favor Ingresar el id de la novela: ");
                String id = scanner.nextLine();
                Validador.validarID(repositorio.getRepositorio(), id);
                idValido = true;
                System.out.println();
                System.out.print("Por favor Ingresar el titulo de la novel: ");
                String titulo = scanner.nextLine();
                System.out.println();
                System.out.print("Por favor Ingresar el autor de la novel: ");
                String autor = scanner.nextLine();
                System.out.println();
                System.out.print("Por favor Ingresar la fecha de la novel: ");
                String fecha = scanner.nextLine();
                System.out.println();
                NovelaElectronica novela = new NovelaElectronica(titulo, autor, fecha, id);
                repositorio.agregarContenido(novela);
            }
            catch (IdentificadorDuplicadoException e) {
                System.out.println(e.getMessage());
            }
        } while ( !idValido );
    }


}
