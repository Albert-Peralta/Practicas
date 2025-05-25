import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

         Estudiante[] estudiantes = new Estudiante[5];
         //length=Número total en el arreglo
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiante();

            String nombre = JOptionPane.showInputDialog("Ingresa el nombre del estudiante " + (i + 1));
            estudiantes[i].setNombre(nombre);

            String matricula = JOptionPane.showInputDialog("Ingresa la matrícula del estudiante " + (i + 1));
            estudiantes[i].setMatricula(matricula);

            for (int j = 0; j < 5; j++) {
                boolean notaValida = false;
                while (!notaValida) {
                    try {
                        String entrada = JOptionPane.showInputDialog("Ingresa la calificación " + (j + 1));
                        double nota = Double.parseDouble(entrada);

                        if (nota >= 0 && nota <= 100) {
                            estudiantes[i].setNota(j, nota);
                            notaValida = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "La calificación debe estar entre 0 y 100.");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor ingresa un número válido.");
                    }
                }
            }
        }

        StringBuilder resultados = new StringBuilder();

        for (int i = 0; i < estudiantes.length; i++) {
            double promedio = estudiantes[i].calcularPromedio();
            boolean aprobado = estudiantes[i].aprobado();

            //append=Agrega texto al final ya construido.
            resultados.append("Nombre: ").append(estudiantes[i].getNombre()).append("\n");
            resultados.append("Matrícula: ").append(estudiantes[i].getMatricula()).append("\n");
            resultados.append("Promedio: ").append(promedio).append("\n");
            resultados.append("¿Aprobado?: ").append(aprobado ? "Sí" : "No").append("\n");
            resultados.append("---------------------------------\n");
        }
          //toString=Convierte el resultado final a un String.
        JOptionPane.showMessageDialog(null, resultados.toString());
       
    }
}
