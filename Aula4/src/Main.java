import Ficha5.Point;
import Ficha5.Rectangle;
import Ficha5.Triangle;
import Ficha6.Car;
import Ficha6.Circle;
import Ficha6.Figure;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Car audi = new Car(2010, "Audi", "A1", 1000.0, "azul");
        Circle circle = new Circle(0, 0, 3);
        Rectangle rectangle1 = new Rectangle(10, 20, new Point(0, 0));
        Triangle triangle1 = new Triangle(new Point(2, 3), new Point(0, 5), new Point(6, 7));
        Figure figure = new Figure();
        figure.add(circle);
        figure.add(triangle1);
        figure.add(rectangle1);
        System.out.println(figure);
    }
}