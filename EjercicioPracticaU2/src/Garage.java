public class Garage {
    private int numEspacios;
    private Vehiculo[] espacios;

    public Garage(int numEspacios) {
        this.numEspacios = numEspacios;
        this.espacios = new Vehiculo[numEspacios];
    }

    public int getNumEspacios() {
        return numEspacios;
    }

    public void setNumEspacios(int numEspacios) {
        this.numEspacios = numEspacios;
    }

    public Vehiculo[] getEspacios() {
        return espacios;
    }

    public void setEspacios(Vehiculo[] espacios) {
        this.espacios = espacios;
    }

    public boolean estacionar(Vehiculo v) {
        for(int i = 0; i < numEspacios; i++){
             if (espacios[i] == null) {
                espacios[i] = v;
                return true;
            }
        }
    return false;        
    }

    public boolean retirar(String placa){

       for(int i = 0; i < espacios.length; i++ ){
        if (espacios[i] != null && espacios[i].getPlaca().equals(placa)) {
            espacios[i] = null;
            return true;

        }
       }   
        return false;
    }

    public int contarVehiculos(){
        int total = 0;
        for(int i = 0; i < espacios.length; i++){
            if (espacios[i] != null) {
                total++;      
            }
        }
        return total;
    }   

}
