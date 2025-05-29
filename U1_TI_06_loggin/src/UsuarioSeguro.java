import javax.swing.JOptionPane;

public class UsuarioSeguro {
    /*
       Atributos privados:
      -String nombreUsuario
      -String password
    */
    private String nombreUsuario;
    private String password;

    /*
     Setters:
    -setNombreUsuario(String) — no acepta null ni cadenas vacías.
    -setPassword(String) — valida que:
        -Longitud ≥ 8 caracteres
        -Contenga al menos una mayúscula, una minúscula y un dígito.            
        -Si falla, notifica al usuario con el detalle de la regla infringida.

    -Método público boolean autenticar(String intentPassword) que compare intentPassword 
    con el interno y devuelva true solo si coinciden.
    */
 
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {

        if (nombreUsuario != null && !nombreUsuario.isEmpty()) {
            this.nombreUsuario = nombreUsuario;
        } else {
            JOptionPane.showMessageDialog(null, "Nombre de usuario no puede estar vacío.");
        }

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

    for (char validar : password.toCharArray()) {
            if (Character.isUpperCase(validar)) tieneMayuscula = true;
            if (Character.isLowerCase(validar)) tieneMinuscula = true;
            if (Character.isDigit(validar)) tieneDigito = true;
        }

        if (!tieneMayuscula) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra mayúscula.");
        } else if (!tieneMinuscula) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra minúscula.");
        } else if (!tieneDigito) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos un dígito.");
        } else {
            this.password = password;
            //JOptionPane.showMessageDialog(null, "Acceso concedido");
        }
        }

       public boolean autenticar(String intentoPassword) {
        return password != null && password.equals(intentoPassword);
    }

}
