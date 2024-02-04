package jd04_if_else_switch;

public class MedianNumber {

    public static void main(String[] args) {
        int a = 10, b = 15, c = 20;
        if ((a > b && a < c) || (a > c && a < b)) {
            System.out.println("Median number is: " + a);
        } else if ((b > c && b < a) || (b > a && b < c)) {
            System.out.println("Median number is: " + b);
        } else {
            System.out.println("median number is: " + c);
        }
    }


}
/*4. Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers
(Assume that the given three integers are distinct numbers).
Example:
a = 10;
b = 15;
c = 20;

Output:
        15 is the median number */