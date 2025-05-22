package Model;

public class Triangulo {


    private double lado;
    private double base;
    private double altura;
    private String message;

     public double getperimetro(){
        

        return 2*lado+base;        

    }
    public void setperimetro(double lado, double base){
        this.lado=lado;
        this.base=base;
    }

    public double getArea(){
        getSecretMessage();
        return base*altura;        

    }
    public void setArea(double base, double altura){
        this.base=base;
        this.altura=altura;

    }

    private void getSecretMessage(){
        System.out.println("Area y Perimetro del Triangulo");
    }


}
