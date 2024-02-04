package jd07_class_and_objects;

public class AddressClient {
    public static void main(String[] args) {
        Address address1 = new Address();
        address1.buildingNumber = 2857;
        address1.street = "Teton pl";
        address1.city = "Canon City";
        address1.state = "CO";
        address1.zipCode = "81212";

        System.out.println( address1.buildingNumber + " " + address1.street );
        System.out.println(address1.city + " " + address1.state + " " + address1.zipCode);
        System.out.println(address1);

        System.out.println("==========================================");

        Address address2 = new Address();
        address2.buildingNumber = 7925;
        address2.street = "Jones Branch Dr";
        address2.city = "Mclean";
        address2.state = "VA";
        address2.zipCode = "22012";

        System.out.println( address2.buildingNumber + " " + address2.street + "\n" +
                 address2.city + " " + address2.state + " " + address2.zipCode );
        System.out.println(address2);

    }
}
