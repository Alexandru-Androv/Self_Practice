package jd07_class_and_objects;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of the circle: " );
        int radius = input.nextInt();
         double PI = 3.14;
         input.close();

        double area = PI *(radius * radius);
        double perimeter = 2 * PI * radius;
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);



    }


}
/*
6. Create a class named Circle and write a program that asks the user to enter the radius of the Circle and calculate
the area and perimeter of the Circle.

        Example:
             Enter the radius:
             Input: 5

        Output:
             The area of the Circle is 78.5
             The perimeter of the Circle is 31.4
 */
