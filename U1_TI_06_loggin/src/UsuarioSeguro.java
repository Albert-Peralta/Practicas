import javax.swing.JOptionPane;

public class UsuarioSeguro {

    private String nombreUsuario;
    private String password;
 
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
           this.nombreUsuario = nombreUsuario;
       }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.length() < 8) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 8 caracteres.");
            return;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;

       char[] caracteres = password.toCharArray();
       for (int i = 0; i < caracteres.length; i++) {
          char validar = caracteres[i];
          if (Character.isUpperCase(validar)) tieneMayuscula = true;
          if (Character.isLowerCase(validar)) tieneMinuscula = true;
          if (Character.isDigit(validar)) tieneDigito = true;
        }

        if (!tieneMayuscula) {
        JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra mayúscula.");
        } 
        if (!tieneMinuscula && tieneMayuscula) {
        JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra minúscula.");
        } 
        if (!tieneDigito && tieneMayuscula && tieneMinuscula) {
        JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos un dígito.");
        }
        if (tieneMayuscula && tieneMinuscula && tieneDigito) {
        this.password = password;
        password = JOptionPane.showInputDialog("Validar contraseña: ");
        }
    }

       public boolean autenticar(String intentPassword) {
        if (intentPassword.equals(password)) {
            JOptionPane.showMessageDialog(null, "Acceso concedido");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado");
            return false;
        }
       // return password != null && password.equals(intentPassword);
        
    }

}
