package Ficha6;

import Ficha5.Point;

public  class Circle extends Shape{

    private double radius;

    //Construtor


    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public Circle() {
        super();
        this.radius = 0.0;
    }
//getter
    public double getRadius() {
        return radius;
    }
//setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2+Math.PI*radius;
    }
}
