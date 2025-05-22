package Model;

public class Square {

    private double lado;
    private String message;


    public double getPerimeter(){

       // double perimeter = lado*4;
       // System.out.println(perimeter);
        return lado*4;        

    }

    public void setlado(double lado){
        this.lado=lado;

    }

    public double getArea(){
       // double area = lado*lado;
       // System.out.println(area);
       //if (this.message.isEmpty()) {
        //
       //}
       getSecretMessage();
        return lado*lado;       
    }

     public void setarea(double lado){
        this.lado=lado;

    }

    private void getSecretMessage(){
        System.out.println("Este metodo solo es accesible dentro de la clase, pero no desde afuera");
    }

}
