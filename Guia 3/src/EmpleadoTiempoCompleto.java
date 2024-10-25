public class EmpleadoTiempoCompleto extends Empleado {

    private static final int horasPorMes = 160;

    public EmpleadoTiempoCompleto( String nombre, float salario) {
        super(nombre, salario);
    }
    public static int getHorasPorMes() { return horasPorMes; }
    @Override
    public float calcularPago() { return (float)horasPorMes * getSalario(); }
    public void mostrar() {
        System.out.println("Empleado");
        System.out.println(" Nombre: " + getNombre());
        System.out.println(" Horas por mes: " + getHorasPorMes());
        System.out.println(" Salario: " + getSalario());
        System.out.println(" Pago: " + calcularPago() + "\n");
    }

}
