package Model;

public class circle {

     private double radio;
     private String message;

     public double getradio(){

       // double perimeter = lado*4;
       // System.out.println(perimeter);
       getSecretMessage();
        return 2*3.1416*radio;        

    }
    public void setradio(double radio){
        this.radio=radio;

    }

    public double getArea(){

       // double perimeter = lado*4;
       // System.out.println(perimeter);
        return 3.1416*radio*radio;        

    }
    public void setArea(double radio){
        this.radio=radio;

    }

    private void getSecretMessage(){
        System.out.println("Area y Perimetro del circulo");
    }

}
