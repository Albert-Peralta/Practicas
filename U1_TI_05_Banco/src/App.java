import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        /*    
    Instancia la cuenta, deposita 1000, retira 200, luego intenta retirar 10000.
    Imprime en cada paso el saldo y si la operación fue exitosa. */

        CuentaBancaria cb = new CuentaBancaria();

        cb.setTitular("Eliel");
        cb.depositar(1000);
        boolean retiro1 = cb.retirar(200);
        boolean retiro2 = cb.retirar(10000);

            JOptionPane.showMessageDialog(null, "Titular: "+ cb.getTitular()
            +"\n"+"¿Primer retiro?: " + retiro1+"\n"+cb.getSaldo()
            +"\n"+"¿Segundo retiro?: " + retiro2+"\n"+cb.getSaldo()
            );

    }
}
