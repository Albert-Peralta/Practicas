import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       
          Computadora pc = new Computadora();

        pc.setMarca("Acer");
        pc.setModelo("2024");
        pc.encender();
        String estado = pc.isEncendida() ? "encendida" : "apagada";
        JOptionPane.showMessageDialog(null,  "La computadora " + pc.getMarca() + " " + pc.getModelo() + " está " + estado + ".");
        pc.apagar();   
        
    }
}
