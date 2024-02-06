package jd11_class_and_objects_part2;

public class PizzaClient {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("small", 2, 1);
        System.out.println(pizza1);
        System.out.println("Your total is: " +pizza1.calcCost());

        Pizza pizza2 = new Pizza("medium", 3, 2);
        System.out.println(pizza2);
        System.out.println("Your total is: " + pizza2.calcCost());

        Pizza pizza3 = new Pizza("large", 3, 2);
        System.out.println(pizza3);
        System.out.println("Your total is: " + pizza3.calcCost());



    }
}
