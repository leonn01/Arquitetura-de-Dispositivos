package Ficha6;

public abstract class Vehicle {
    int year;
    String brand;
    String model;
    double price;
    String color;

    // Construtor


    public Vehicle(int year, String brand, String model, double price, String color) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }
    public Vehicle(){
        year = 0;
        brand = "";
        model = "";
        price = 0.0;
        color = "";
    }

    // Gets
    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    // Set


    public void setYear(int year) {
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Metodos

    public abstract String toString();
}
