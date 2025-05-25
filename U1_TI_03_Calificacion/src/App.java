import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

         Estudiante[] estudiantes = new Estudiante[5];

        for (int i = 0; i < 5; i++) {
            estudiantes[i] = new Estudiante();
            estudiantes[i].setNombre("Estudiante " + (i + 1));
            estudiantes[i].setMatricula("20243ds0" + (i + 1));

            for (int E = 0; E < 5; E++) {
                estudiantes[i].setNota(E, 65 + i * 5 + E);
            }
        }

        for (int i = 0; i < 5; i++) {
            String mensaje = "Nombre: " + estudiantes[i].getNombre() + "\n"
                           + "Matrícula: " + estudiantes[i].getMatricula() + "\n"
                           + "Promedio: " + estudiantes[i].calcularPromedio() + "\n"
                           + "¿Aprobado?: " + (estudiantes[i].aprobado() ? "Sí" : "No");

            JOptionPane.showMessageDialog(null, mensaje, "Resultado del Estudiante " + (i + 1), JOptionPane.INFORMATION_MESSAGE);
        }
       
    }
}
