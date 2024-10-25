public class Main {
    public static void main(String[] args) {

        EmpleadoTiempoCompleto empleadoTiempoCompleto = new EmpleadoTiempoCompleto("Miguel", 2000);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Carlos", 3000, 100);
        EmpleadoContratista empleadoContratista =
                new EmpleadoContratista("Jose", 0, 40, 4000);

        empleadoTiempoCompleto.mostrar();
        empleadoPorHoras.mostrar();
        empleadoContratista.mostrar();

    }
}