package jd13_inheritance._phone;

public class PhoneClients {
    public static void main(String[] args) {
        Nokia phone1 = new Nokia("nokia", "3310",
                "small",2555,"black");
        phone1.call("12345678");
        phone1.faceTime("1234567788");
        System.out.println(phone1);

        System.out.println();

        Samsung phone2 = new Samsung("samsung","s22", "big", 233.3, "red");
           phone2.call("237465657");
           phone2.text("456455343");
        System.out.println(phone2);


    }
}
/* Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object.

 */
