package aula5package;

public class Main {
    public static void main(String[] args) {
        Point a=new Point(1.0,3.0);
        Point b=new Point(1.0,3.0);
        Point c=new Point(3.0,1.0);

        System.out.println(a.getX());
        a.setX(5.0);
        System.out.println(a.getX());
        System.out.println(a.distanceTo(b));


        Triangle triangle=new Triangle(a,b,c);
        System.out.println(triangle.getarea());
    }


}