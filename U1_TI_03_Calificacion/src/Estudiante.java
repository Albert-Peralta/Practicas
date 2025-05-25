public class Estudiante {

private String nombre;
private String matricula;
private double[] notas = new double[5];

public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }


    public void setNota(int i, double nota) {
        if (i >= 0 && i < 5) {
            notas[i] = nota;
        }
    }

    public double getNota(int i) {
        if (i >= 0 && i < 5) {
            return notas[i];
        }
        return 0;
    }


    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += notas[i];
        }
        return suma / 5;
    }

    public boolean aprobado() {
        return calcularPromedio() >= 70;
    }


}
