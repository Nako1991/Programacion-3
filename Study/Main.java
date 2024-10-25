///SIMULACRO EXAMEN LABO 3 2do PARCIAL
import paqSimulacroLab3P2.IU.MenuPrincipal;

///SIMULACRO PARCIAL 2 LAB 3
public class Main {
    public static void main(String[] args) {

        MenuPrincipal menu = new MenuPrincipal();
        menu.ejecutarMenu();

    }
}


/* MAIN TEST
public class Main {
    public static void main(String[] args) {

        ///TEST DE CLASES GENERICAS E ITERADORES: ListaGenerica
        ListaGenerica<Object> listaObjetos = new ListaGenerica<>();
        listaObjetos.add("a");
        listaObjetos.add("b");
        listaObjetos.add("c");
        for( Object item : listaObjetos ) { System.out.println(item); }
        listaObjetos.classType();

        ListaGenerica<Integer> listaEnteros = new ListaGenerica<>();
        listaEnteros.add(2);
        listaEnteros.add(4);
        listaEnteros.add(6);
        for( Integer item : listaEnteros ) { System.out.println(item); }
        listaEnteros.classType();

        ListaGenerica<Double> listaFloats = new ListaGenerica<>();
        listaFloats.add(75.15);
        listaFloats.add(3.14);
        listaFloats.add(6.02);
        for( Double item : listaFloats ) { System.out.println(item); }
        listaFloats.classType();
        System.out.println();

        //PRUEBA EXCEPTIONS: Comprobar contraseña
        Validaciones validator = new Validaciones();
        String password1 = "contra123";
        String password2 = "Contraseña123!";
        //Probando contraseña 1
        try {
            validator.validarPassword(password1);
            System.out.println("La contraseña fue validada con éxito.");
        }
        catch (PasswordInvalidException error) {
            System.out.println("Error: " + error.getMessage());
        }
        //Probando contraseña 2
        try {
            validator.validarPassword(password2);
            System.out.println("La contraseña fue validada con éxito.");
        }
        catch (PasswordInvalidException error) {
            System.out.println("Error: " + error.getMessage());
        }
        //Probando validacion de rango de la lista
        try {
            System.out.println("Entero: " + listaEnteros.get(6));
        }
        catch (IndexOutOfBoundsException error) {
            System.out.println("Error: " + error.getMessage());
        }
        //Probando romper listaGenerica
        listaObjetos.add(27);
        System.out.println(listaObjetos);


    }
} MAIN TEST*/
