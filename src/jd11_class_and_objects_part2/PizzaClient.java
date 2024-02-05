package jd11_class_and_objects_part2;

public class PizzaClient {
    public static void main(String[] args) {


        Pizza pizza1 = new Pizza();
        pizza1.size = "small";
        pizza1.numberOfCheeseTopping = 3;
        pizza1.numberOfPeperoniTopping = 2;
        int result1 = pizza1.calcCost();
        System.out.println(pizza1);
        System.out.println(result1);

        Pizza pizza2 = new Pizza();
        pizza2.size = "medium";
        pizza2.numberOfCheeseTopping = 3;
        pizza2.numberOfPeperoniTopping = 2;
        int result2 = pizza2.calcCost();
        System.out.println(pizza2);
        System.out.println(result2);

        Pizza pizza = new Pizza();
        pizza.size = "large";
        pizza.numberOfCheeseTopping = 3;
        pizza.numberOfPeperoniTopping = 2;
        int result3 = pizza.calcCost();
        System.out.println(pizza);
        System.out.println(result3);

    }
}
