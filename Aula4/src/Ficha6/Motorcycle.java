package Ficha6;

public class Motorcycle extends Vehicle {
    public Motorcycle(int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);
    }

    public Motorcycle() {
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "year=" +getYear()+'\''+
                ", brand="+getBrand()+'\''+
                ", model="+getModel()+'\''+
                ", price="+getPrice()+'\''+
                ", color="+getColor()+'\''+
                "}";
    }
}
