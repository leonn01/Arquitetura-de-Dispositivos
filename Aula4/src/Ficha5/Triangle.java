package Ficha5;

import Ficha6.Shape;

public class Triangle extends Shape {
    // atributos de classe
     Point a;

     Point b;

     Point c;

    // contrutores


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        a = new Point();
        b = new Point();
        c = new Point();
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
    // getters and setters

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }
    public Point getC() {
        return c;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public void setABC (Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //metodos

    public double width(){
        return b.distanceTo(c);
    }

    public double altura(){
        return b.distanceTo(a);
    }

    public double area(){
        return (width()*altura())/2;
    }


}
