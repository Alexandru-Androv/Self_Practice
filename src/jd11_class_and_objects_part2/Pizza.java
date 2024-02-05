package jd11_class_and_objects_part2;

public class Pizza {
     String size;
   int numberOfCheeseTopping;
   int numberOfPeperoniTopping;

    public int calcCost(){
        if(size.equalsIgnoreCase("small")){
          int  tottalCost = 10+ (2*numberOfCheeseTopping) + (2*numberOfPeperoniTopping);
          return tottalCost;
        }
        if (size.equalsIgnoreCase("medium" )){
            int totalCost = 12+ (2*numberOfCheeseTopping) + (2*numberOfPeperoniTopping);
            return totalCost;
        }
        if (size.equalsIgnoreCase("large" )){
            int totalCost = 14+ (2*numberOfCheeseTopping) + (2*numberOfPeperoniTopping);
            return totalCost;
        }
        return 0;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPeperoniTopping=" + numberOfPeperoniTopping +
                '}';
    }
}
/*
Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.
 */
