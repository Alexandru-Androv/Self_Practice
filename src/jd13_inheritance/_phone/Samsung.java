package jd13_inheritance._phone;

public class Samsung extends IPhone{


    public Samsung(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }
    public void call(String phoneNumber){
        System.out.println("calling from samsung the number " + phoneNumber);
    }
    public void text( String phoneNumber){
        System.out.println("texting from samsung to the number " + phoneNumber);
    }

}
    /*Create a class named 'Samsung' with these specifications:
   Attributes:
       - Same as IPhone.

   Encapsulation:
       - Same conditions as IPhone.

   Constructor:
       - Same as IPhone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - toString(): Prints the information of the Samsung object.

     */


