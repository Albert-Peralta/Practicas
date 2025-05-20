import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
         String Dato1 = JOptionPane.showInputDialog("Ingresa el primer número:");
         String Dato2 = JOptionPane.showInputDialog("Ingresa el segundo número:");
         String Dato3 = JOptionPane.showInputDialog("Ingresa el tercer número:");

        int num1 = Integer.parseInt(Dato1);
        int num2 = Integer.parseInt(Dato2);
        int num3 = Integer.parseInt(Dato3);

        int promedio = (num1 + num2 + num3) / 3;

        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);



         System.out.println(Integer.parseInt(Dato1));

         
        

    }
}
