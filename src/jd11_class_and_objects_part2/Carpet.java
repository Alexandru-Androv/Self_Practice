package jd11_class_and_objects_part2;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    public double calcCost(){
        if (isPersian){
            double totalPrice = 200 + ((width*length) * unitPrice);
            return totalPrice;
        }else {
            double totalPrice = (width*length) * unitPrice;
            return totalPrice;
        }

    }
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';
    }
}
/*
Create a custom class named Carpet with the following specifications:

    Attributes:
   			width
   			length
   			unitPrice
   			isPersian (boolean)

    Actions:
		calcCost(): calculate the total cost of the carpet and return it as a double.
   		toString(): display all the info of the carpet, including the total cost of the carpet as calculated by calcCost()

   Price calculation formula:
   		Total price of carpet = (width * length) * unitPrice
   		If the carpet is Persian, add $200 to the totalPrice

    Create another class named CarpetClients, create multiple carpet objects, and test each function of the carpet object.
 */