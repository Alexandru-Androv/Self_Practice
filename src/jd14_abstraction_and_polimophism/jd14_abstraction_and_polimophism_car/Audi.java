package jd14_abstraction_and_polimophism_car;

public class Audi extends Car implements AutoPark{
    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println( getMake() + " is starting ");

    }

    @Override
    public void drive() {
        System.out.println( "Audi " + getMake() + " " + getModel() + " is driving fast.");

    }

    @Override
    public void autoPark() {
        System.out.println("This year " + getYear() + " has autoPark");

    }
}
