package Ficha6;

public class Car extends Vehicle {
    public Car(int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);

    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" +getYear()+'\''+
                ", brand="+getBrand()+'\''+
                ", model="+getModel()+'\''+
                ", price="+getPrice()+'\''+
                ", color="+getColor()+'\''+
                "}";
    }
}
