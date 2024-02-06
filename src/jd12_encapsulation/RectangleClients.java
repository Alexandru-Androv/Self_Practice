package jd12_encapsulation;

public class RectangleClients {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2.0,1);
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(3,1);
        System.out.println(rectangle2.getLength());
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2);
    }
}
