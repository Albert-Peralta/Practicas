import javax.swing.JOptionPane;

public class Computadora {

     private String marca;
    private String modelo;
    private boolean encendida;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void encender() {
        if (!encendida) {
            encendida = true;
            JOptionPane.showMessageDialog(null, "Encendiendo...");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            JOptionPane.showMessageDialog(null, "Apagando...");
        }
    }

}
