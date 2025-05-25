import Model.Square;
import Model.Triangulo;
import Model.circle;

public class App {
    public static void main(String[] args) throws Exception {
        
        Square sq = new Square();

        sq.setlado(10);
        //sq.getPerimeter();
       // double squarePerimeter = sq.getPerimeter();
       // System.out.println(sq.getPerimeter());


        sq.setarea(10);
        System.out.println(sq.getArea());

        circle cir = new circle();
        cir.setradio(5);
        System.out.println(cir.getradio());

        cir.setArea(5);
        System.out.println(cir.getArea());


        Triangulo tri = new Triangulo();
        tri.setArea(5, 10);
        System.err.println(tri.getArea());

        tri.setperimetro(10, 5);
        System.out.println(tri.getperimetro());
       

    }
}
