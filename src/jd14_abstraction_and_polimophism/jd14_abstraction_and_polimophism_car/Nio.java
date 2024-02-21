package jd14_abstraction_and_polimophism_car;

public  class Nio extends Car implements AutoPilot {
    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }
}
