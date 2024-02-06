package jd11_class_and_objects_part2;

public class CarpetClients {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(2.3,2,13,true);
        System.out.println(carpet1);
        System.out.println("Total price is: " + carpet1.calcCost());

        Carpet carpet2 = new Carpet(2.3,2,13,false);
        System.out.println(carpet2);
        System.out.println("Total price is: " + carpet2.calcCost());

        Carpet carpet3 = new Carpet(1,1,12,false);
        System.out.println(carpet3);
        System.out.println("Total price is: " + carpet3.calcCost());




    }
}
