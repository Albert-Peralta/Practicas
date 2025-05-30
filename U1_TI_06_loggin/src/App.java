import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         -Pide los datos mediante la consola o JoptionPane y crea/inicializa UsuarioSeguro
         -Valida que usuarioSeguro se haya inicializado (que tenga valores en sus atributos)
         -Prueba distintos passwords (muy cortos, sin mayúsculas, sin dígitos).
         -Llama a autenticar(...) con la contraseña correcta y una incorrecta, mostrando 
         “Acceso concedido” o “Acceso denegado”.
        */

        UsuarioSeguro us = new UsuarioSeguro();

        //String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String nombreUsuario;
        do {nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre: ");
            if (nombreUsuario == null || nombreUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre de usuario no puede estar vacío.");
        }
        } while (nombreUsuario == null || nombreUsuario.isEmpty());
        us.setNombreUsuario(nombreUsuario);

       // String password = JOptionPane.showInputDialog("Ingrese su contraseña: ");
        String password;
        do { password = JOptionPane.showInputDialog("Ingrese su contraseña: ");
        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La contraseña no puede estar vacío.");
        }
        } while (password.isEmpty());
        us.setPassword(password);

        us.autenticar(password);
        

    }
}
