package Ficha6;

import java.util.ArrayList;

public class Figure {
    protected ArrayList<Shape> shapes;

    public Figure(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public Figure(){
        shapes = new ArrayList<Shape>();
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    //method

    public void add(Shape shape){
        shapes.add(shape);
    }
}
