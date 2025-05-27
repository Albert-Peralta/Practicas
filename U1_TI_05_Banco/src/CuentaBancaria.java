import java.lang.foreign.Linker.Option;

import javax.swing.JOptionPane;

public class CuentaBancaria {

    // Atributos private: titular (String), saldo (double).
    private String titular;
    private double saldo;
   

     /*Métodos public:
    void depositar(double monto) → suma a saldo (solo si monto > 0).
    boolean retirar(double monto) → si monto > 0 y saldo >= monto, resta y devuelve true, sino devuelve false.
    double getSaldo(); String getTitular() y void setTitular(String).*/

    //depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Saldo: "+this.saldo);
        }
    }

    //retirar dinero
    public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            //System.out.println("Saldo: "+this.saldo);
            //JOptionPane.showMessageDialog(null, "Retiro exitoso");
            return true;
        } else {
            //System.out.println("No se puede retirar esa cantidad");
            //JOptionPane.showMessageDialog(null, "No se puede retirar esa cantidad");
            return false;
        }
    }

    //obtener el titular
    public String getTitular() {
        return titular;
    }
    //cambiar el titular
    public void setTitular(String nuevoTitular) {
        this.titular = nuevoTitular;
    }

    //obtener el saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
