package aula5package;

public class Rectangle {
    //atributos da classe
    Point topLeftPoint;
    Double height;
    Double width;

    //construtores

    public Rectangle() {
       width=0.0;
       height=0.0;
       topLeftPoint=new Point();
    }

    public Rectangle(Point topLeftPoint, Double height, Double width) {
        this.topLeftPoint = topLeftPoint;
        this.height = height;
        this.width = width;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    //construtores
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return (width*2)+(height*2);
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setHeight(double height){
        this.height=height;
    }

    public Point getTopLeftPoint(){
        return topLeftPoint;
    }

    public void setTopLeftPoint(Point topLeftPoint){
        this.topLeftPoint=topLeftPoint;

    }




}
