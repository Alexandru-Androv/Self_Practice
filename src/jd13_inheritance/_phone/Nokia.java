package jd13_inheritance._phone;

public class Nokia extends IPhone {
    public Nokia(String brand, String model, String size,
                 double price, String color) {
    super(brand,model,size,price,color);

    }
    public void call(String phoneNumber){
        System.out.println("calling from nokia the number " + phoneNumber);
    }
    public void text( String phoneNumber){
        System.out.println("texting from nokia to the number " + phoneNumber);
    }


}
/*
Create a class named 'Nokia' with these specifications:
   Attributes:
       - Same as IPhone.

   Encapsulation:
       - Same conditions as IPhone.

   Constructor:
       - Same as IPhone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - toString(): Prints the information of the Nokia object.
 */