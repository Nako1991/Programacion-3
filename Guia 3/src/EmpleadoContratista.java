public class EmpleadoContratista extends Empleado {

    private int horasDelProyecto;
    private float tarifaDelProyecto;

    public EmpleadoContratista(String nombre, float salario, int horasDelProyecto, float tarifaDelProyecto) {
        super(nombre, salario);
        this.horasDelProyecto = horasDelProyecto;
        this.tarifaDelProyecto = tarifaDelProyecto;
    }
    public int getHorasDelProyecto() { return horasDelProyecto; }
    public void setHorasDelProyecto(int horasDelProyecto) { this.horasDelProyecto = horasDelProyecto; }
    public float getTarifaDelProyecto() { return tarifaDelProyecto; }
    public void setTarifaDelProyecto(float tarifaDelProyecto) { this.tarifaDelProyecto = tarifaDelProyecto; }
    @Override
    public float calcularPago() { return (float)horasDelProyecto * tarifaDelProyecto; }
    public void mostrar() {
        System.out.println("Empleado");
        System.out.println(" Nombre: " + getNombre());
        System.out.println(" Horas del proyecto: " + getHorasDelProyecto());
        System.out.println(" Tarifa del proyecto: " + getTarifaDelProyecto());
        System.out.println(" Pago: " + calcularPago() + "\n");
    }

    //CONSULTAR: Esta bien que no use el salario para nada aca? o deberia reestructurar?
}
