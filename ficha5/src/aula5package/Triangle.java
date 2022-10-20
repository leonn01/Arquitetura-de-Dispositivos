package aula5package;

public class Triangle {

    //atributos da classe
    Point a;
    Point b;
    Point c;

    //construtores


    public Triangle() {
        a = new Point();
        b = new Point();
        c = new Point();

    }

    public Triangle(Point a, Point b, Point c) { //este é generado automatico
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }


    //-----------------------
    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public void setABC(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    //metodos
    public double getwith() {
        return b.distanceTo(c);
    }

    public double getheight() {
        return b.distanceTo(a);
    }

    public Double getarea(){
        return (getwith()*getheight())/2;
    }

}