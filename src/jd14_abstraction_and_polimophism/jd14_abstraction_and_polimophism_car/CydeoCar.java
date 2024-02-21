package jd14_abstraction_and_polimophism_car;

public class CydeoCar extends Car implements AutoPilot, Flyable{
    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " car does't have auto park");

    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " model " + getModel() + " wich costs "+ getPrice() + " has self drive option.");

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void fly() {
        System.out.println( getMake() + " car can fly");

    }
}
