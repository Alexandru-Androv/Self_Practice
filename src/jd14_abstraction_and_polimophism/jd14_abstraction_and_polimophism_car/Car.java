package jd14_abstraction_and_polimophism_car;

public abstract class Car {
    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if (make == null || make.isEmpty() || model == null || model.isEmpty()){
            throw new RuntimeException("Make and model can't be equall to null or emptu.");
        }
        if (year <= 1886){
            throw new RuntimeException("Year can't be less then 1886.");
        }
        this.make = make;
        this.model = model;
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        if (price < 0){
            throw new RuntimeException("Price can't be negative.");
        }
        this.price = price;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()){
            throw new RuntimeException("Color can't be null or empty.");
        }
        this.color = color;
    }
    public abstract void start();
    public  abstract void drive();
    public  final void stop(){
        System.out.println(make + " "+ model + " is stoping.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Car Task Requirements:
1. Create an Abstract Class Named 'Car':
    - Variables:
        - final make
        - final model
        - final year
        - price
        - color
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions for setting fields:
        - make, model, color must not be null or empty.
        - year must not be less than 1886.
        - price must not be negative.
    - Abstract Methods:
        - start()
        - drive()
    - Non-Abstract Methods:
        - stop()
        - toString()
 */