import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        String Num1 = JOptionPane.showInputDialog("Ingresa el primer numero:");
        String Num2 = JOptionPane.showInputDialog("Ingresa el segundo numero:");
        String Num3 = JOptionPane.showInputDialog("Ingresa el tercer numero:");

        int num1 = Integer.parseInt(Num1);
        int num2 = Integer.parseInt(Num2);
        int num3 = Integer.parseInt(Num3);

        int promedio = (num1 + num2 + num3) / 3;

        JOptionPane.showMessageDialog(null, "El promedio entero es: " + promedio);
        
        

    }
}
