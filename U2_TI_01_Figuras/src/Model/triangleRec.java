package Model;

public class triangleRec extends FigureAbs {
    private double base;
    private double height;
    private double cateto1;
    private double cateto2;
    private double hipotenusa;

    public triangleRec(double base, double height, double cateto1, double cateto2, double hipotenusa) {
        this.base = base;
        this.height = height;
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipotenusa = hipotenusa;
    }

    public triangleRec(double base) {
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

    public double getCateto1() {
        return cateto1;
    }
    public void setCateto1(double cateto) {
        this.cateto1 = cateto;
    }

    public double getCateto2() {
        return cateto2;
    }
    public void setCateto2(double cateto) {
        this.cateto2 = cateto;
    }
    
    public double getHipotenusa() {
        return hipotenusa;
    }
    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return cateto1 + cateto2 + hipotenusa;
    }



}
