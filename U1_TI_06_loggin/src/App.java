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


        String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre: ");
        us.setNombreUsuario(nombreUsuario);
        String password = JOptionPane.showInputDialog("Ingrese su contraseña: ");        
        us.setPassword(password);

        us.autenticar(password);

    }
}
