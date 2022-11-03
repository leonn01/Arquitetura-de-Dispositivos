package Ficha5;

import Ficha6.Shape;

public class Rectangle extends Shape {
    // atributos da classe

    int topLeftPoint;
    double height;
    Point width;

    public Rectangle(int topLeftPoint, double height, Point width) {
        this.topLeftPoint = topLeftPoint;
        this.height = height;
        this.width = width;
    }

    public int getTopLeftPoint() {
        return topLeftPoint;
    }

    public double getHeight() {
        return height;
    }

    public Point getWidth() {
        return width;
    }

    public void setTopLeftPoint(int topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(Point width) {
        this.width = width;
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
}
