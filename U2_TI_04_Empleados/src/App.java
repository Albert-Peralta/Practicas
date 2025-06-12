public class App {
    public static void main(String[] args) throws Exception {
        Empleado EmpleadoPorHoras = new EmpleadoPorHoras("120", "Alberto", 80, 8);

        Empleado EmpleadoTiempoCompleto = new EmpleadoTiempoCompleto("235", "Pedro", 10000, "Ninguno");

        System.out.println("Empleado por Horas: \nId: "+EmpleadoPorHoras.getId()+ "\nNombre: "+EmpleadoPorHoras.getNombre()+ "\nSalario base: " + EmpleadoPorHoras.getSalarioBase()+ "\nSalario total: "+EmpleadoPorHoras.calcularSalario());

        System.out.println("------------------------------------------------");

        System.out.println("Empleado por Tiempo Completo: \nId: "+EmpleadoTiempoCompleto.getId()+ "\nNombre: "+EmpleadoTiempoCompleto.getNombre()+ "\nSalario total: "+EmpleadoTiempoCompleto.calcularSalario()+ "\nBeneficios: "+ ((EmpleadoTiempoCompleto) EmpleadoTiempoCompleto).getBeneficios());
    }
}
