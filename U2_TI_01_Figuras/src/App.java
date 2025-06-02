import Model.Circle;
import Model.FigureAbs;
import Model.Square;
import Model.Triangle;
import Model.TriangleEqui;
import Model.triangleRec;
public class App {
    public static void main(String[] args) throws Exception {

        FigureAbs sq = new Square(10);
        FigureAbs cir = new Circle(10);
        FigureAbs triangle = new Triangle(20, 25, 20);
        FigureAbs trirec = new triangleRec(10, 15, 8, 8);
        FigureAbs triequi = new TriangleEqui(10, 15, 8);

        FigureAbs[] figures = { sq, cir, triangle, trirec, triequi };

        for (FigureAbs figureAbs : figures) {
            System.out.println("La clase es: " + figureAbs.getClass().getSimpleName());
            System.out.println("El area es: " + figureAbs.getArea());
            System.out.println("El perimetro es: " + figureAbs.getPerimeter());
            System.out.println("----------------------------------------------------");
        }

    }
}
