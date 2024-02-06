package jd12_encapsulation;

public class CircleClients {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2);
        System.out.println(circle1.getRadius());
        System.out.println(circle1);

        Circle circle2 = new Circle(0);
        System.out.println(circle2.getRadius());
        System.out.println(circle2);

    }
}
