public class EmpleadoPorHoras extends Empleado {

    private int horas;

    public EmpleadoPorHoras(String nombre, float salario, int horas) {
        super(nombre, salario);
        this.horas = horas;
    }
    public int getHoras() { return horas; }
    public void setHoras(int horas) { this.horas = horas; }
    @Override
    public float calcularPago() { return horas * getSalario(); }
    public void mostrar() {
        System.out.println("Empleado");
        System.out.println(" Nombre: " + getNombre());
        System.out.println(" Horas: " + getHoras());
        System.out.println(" Salario: " + getSalario());
        System.out.println(" Pago: " + calcularPago() + "\n");
    }

}
