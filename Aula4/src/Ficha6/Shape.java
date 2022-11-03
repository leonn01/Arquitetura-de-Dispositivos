package Ficha6;

import Ficha5.Point;

public abstract class Shape {
    protected Point position;

    // construtor

    public Shape(double x, double y) {
        this.position = new Point(x, y);
    }

    public Shape() {
        this.position = new Point();
    }


    //Setters

    public void setPosition(Point position) {
        this.position = position;
    }

    //methods
    public abstract Point getPosition();
    public abstract double getArea();
    public abstract double getPerimeter();
}
