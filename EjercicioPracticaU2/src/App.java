public class App {
    public static void main(String[] args) throws Exception {

        Garage gara = new Garage(5);

        Coche coche1 = new Coche("LAPF245", "Audi", 4);
        Coche coche2 = new Coche("RTPF548", "Nissan", 4);
        Coche coche3 = new Coche("LADF4562", "Lamborgini", 2);
        Motocicleta Moto1 = new Motocicleta("LADR546", "Italika", false);
        Motocicleta Moto2 = new Motocicleta("DFGT845", "R6", false);

        gara.estacionar(coche1);
        gara.estacionar(coche2);
        gara.estacionar(coche3);
        gara.estacionar(Moto1);
        gara.estacionar(Moto2);

        gara.retirar("RTPF548");

        System.out.println("\nTolta de Vehiculos en el garage: " + gara.contarVehiculos() + "\n");

    }
}
