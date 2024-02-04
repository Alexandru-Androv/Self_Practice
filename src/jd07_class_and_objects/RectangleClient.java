package jd07_class_and_objects;

public class RectangleClient {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.width=10;
        rectangle1.lenght=12;
        
        System.out.println("rectangle1");
        System.out.println("rectangle1 area = " + rectangle1.rectangleArea(rectangle1.width, rectangle1.lenght));
        System.out.println("rectangle1 perimeter = " + rectangle1.rectanglePerimeter(rectangle1.width, rectangle1.lenght));
        
        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 3.4;
        rectangle2.lenght = 4.3;


        System.out.println("rectangle2");
        System.out.println("rectangle2= " + rectangle2.rectangleArea(rectangle2.width, rectangle2.lenght));
        System.out.println("rectangle2= " + rectangle2.rectanglePerimeter(rectangle2.width, rectangle2.lenght ));
        
    }
}
