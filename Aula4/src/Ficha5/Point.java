package Ficha5;

public class Point {
    // atributos da classe
    private double x;
    private double y;


    // Construtores
    public Point(){
        x = 0;
        y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;

    }
    // Getters and setters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY (double x, double y){
        this.x = x;
        this.y = y;
    }

    //metodos
    public double distanceTo(Point otherpoint){
        double distance = Math.sqrt(
                Math.pow(otherpoint.getX() - x, 2 ) + Math.pow(otherpoint.getY() - y, 2)
        );
        return distance;

    }
}
