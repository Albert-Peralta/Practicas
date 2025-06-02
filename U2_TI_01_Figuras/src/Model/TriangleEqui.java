package Model;

public class TriangleEqui extends FigureAbs{
    private double base;
    private double height;
    private double side;

    public TriangleEqui(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public TriangleEqui(double base) {
        this.base = base;

    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return side * 3;
    }

}
