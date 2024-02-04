package jd07_class_and_objects;

public class ItemClient {
    public static void main(String[] args) {


        Item item1 = new Item();
        item1.itemName = "wtaermelon";
        item1.unitPrice = 2.0;
        item1.quantity = 5;
        double result1 = item1.calcCost(item1.unitPrice, item1.quantity);
        System.out.println("Price for " + item1.quantity + " " + item1.itemName + " is " + result1);
        System.out.println(item1);

        System.out.println("-----------------------------------------------");
        Item item2 = new Item();
        item2.itemName = "cabage";
        item2.unitPrice = 4.5;
        item2.quantity = 3;
        double result2 = item2.calcCost(item2.unitPrice, item2.quantity);
        System.out.println("Price for " + item2.quantity + " " + item2.itemName + " is " + result2);
        System.out.println(item2);
    }
}
